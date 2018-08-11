package com.tictim.sdoriga;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Infuse{
	protected final InfuseSetting setting;
	protected final Statistic stat = new Statistic();
	protected final Set<Unit> list = new HashSet<>(), srList = new HashSet<>();
	protected BigDecimal allChanceSum = BigDecimal.ZERO, srChanceSum = BigDecimal.ZERO, ssrChanceSum = BigDecimal.ZERO;
	
	public Infuse(InfuseSetting setting){
		this.setting = setting;
	}
	
	public void addUnit(Unit unit){
		if(list.contains(unit)) throw new IllegalArgumentException("Duplicated Unit Registeration : "+unit);
		else switch(unit.getRarity()){
		case N:
			throw new IllegalArgumentException("N Unit Registeration : "+unit);
		case SSR:
			ssrChanceSum = ssrChanceSum.add(unit.getChance());
		case SR:
			srChanceSum = srChanceSum.add(unit.getChance());
			srList.add(unit);
		case R:
			allChanceSum = allChanceSum.add(unit.getChance());
			if(allChanceSum.add(getAdditionalChance(ssrChanceSum, 99999)).compareTo(BigDecimal.ONE)>1)
				throw new RuntimeException("Too Much Units");
		default: // case R:
		}
		list.add(unit);
		stat.addUnitSample(unit);
	}
	
	public boolean isChainEnabled(){
		return this.ssrChanceSum.compareTo(BigDecimal.ZERO)>0;
	}
	
	public Statistic getStat(){
		return this.stat;
	}
	
	private Unit infuse(int chain, boolean sr){
		BigDecimal prob = BigDecimal.valueOf(new Random().nextInt(100000)).divide(BigDecimal.valueOf(100000));
		if(sr) prob = prob.multiply(srChanceSum);
		for(Unit u : (sr ? srList : list)){
			prob = prob.subtract(u.getChance());
			if(u.getRarity()==Rarity.SSR) prob = prob.subtract(getAdditionalChance(u.getChance(), chain));
			if(prob.compareTo(BigDecimal.ZERO)<0){
				stat.onInfuse(u);
				return u;
			}
		}
		stat.onInfuse(Unit.NORMAL);
		return Unit.NORMAL;
	}
	
	private BigDecimal getAdditionalChance(BigDecimal chance, int chain){
		if(chain>0&&isChainEnabled()){
			chain = Math.min(12, chain);
			return chance.multiply(BigDecimal.valueOf(chain)).divide(BigDecimal.valueOf(5));
		}else return BigDecimal.ZERO;
	}
	
	public final class InfuseHandler{
		private int chain;
		
		public int getChain(){
			return this.chain;
		}
		
		public void setChain(int chain){
			if(isChainEnabled()) this.chain = Math.min(12, Math.max(0, chain));
		}
		
		public Unit infuse(){
			return Infuse.this.infuse(chain, false);
		}
		
		public Unit[] infuse10(){
			Unit[] units = new Unit[10];
			for(int i = 0; i<9; i++){
				units[i] = Infuse.this.infuse(chain, false);
			}
			switch(setting){
			case LOOSE:
				units[9] = Infuse.this.infuse(chain, true);
				break;
			case TIGHT:
				boolean sr = false;
				for(int i = 0; i<9; i++){
					if(units[i].getRarity()==Rarity.SSR) sr = true;
				}
				units[9] = Infuse.this.infuse(chain, !sr);
				break;
			default:
				throw new IllegalArgumentException("Unexpected Setting : "+setting);
			}
			return units;
		}
	}
}
