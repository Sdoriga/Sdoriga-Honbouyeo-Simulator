package com.tictim.sdoriga;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public final class Statistic{
	private static final DecimalFormat CHANCE = new DecimalFormat("##.###%");
	private BigInteger samples = BigInteger.ZERO;
	private final Map<Rarity, BigInteger> chanceByRarity;
	private final Map<Unit, BigInteger> chanceByUnit;
	
	public Statistic(){
		this.chanceByRarity = new EnumMap<>(Rarity.class);
		this.chanceByUnit = new HashMap<>();
		for(Rarity r : Rarity.values()){
			chanceByRarity.put(r, BigInteger.ZERO);
		}
		addUnitSample(Unit.NORMAL);
	}
	
	public Statistic(Statistic stat){
		this.samples = stat.samples;
		this.chanceByRarity = new EnumMap<>(stat.chanceByRarity);
		this.chanceByUnit = new HashMap<>(stat.chanceByUnit);
	}
	
	public void addUnitSample(Unit unit){
		chanceByUnit.put(unit, BigInteger.ZERO);
	}
	
	public void addUnitSample(Iterable<Unit> units){
		for(Unit u : units)
			addUnitSample(u);
	}
	
	public void addUnitSample(Unit... units){
		for(Unit u : units)
			addUnitSample(u);
	}
	
	public void onInfuse(Unit unit){
		samples = samples.add(BigInteger.ONE);
		onInfuse0(unit);
	}
	
	public void onInfuse(Iterable<Unit> units){
		samples = samples.add(BigInteger.ONE);
		for(Unit u : units)
			onInfuse0(u);
	}
	
	public void onInfuse(Unit... units){
		samples = samples.add(BigInteger.ONE);
		for(Unit u : units)
			onInfuse0(u);
	}
	
	private void onInfuse0(Unit unit){
		addChanceByRarity(unit.getRarity());
		addChanceByUnit(unit);
	}
	
	private void addChanceByRarity(Rarity rarity){
		chanceByRarity.put(rarity, chanceByRarity.get(rarity).add(BigInteger.ONE));
	}
	
	private void addChanceByUnit(Unit unit){
		chanceByUnit.put(unit, chanceByUnit.get(unit).add(BigInteger.ONE));
	}
	
	public double getChanceByRarity(Rarity rarity){
		return samples.equals(BigInteger.ZERO) ? 0 : new BigDecimal(chanceByRarity.get(rarity)).divide(new BigDecimal(samples)).doubleValue();
	}
	
	public double getChanceByUnit(Unit unit){
		return samples.equals(BigInteger.ZERO) ? 0 : new BigDecimal(chanceByUnit.get(unit)).divide(new BigDecimal(samples)).doubleValue();
	}
	
	public BigInteger getRaritySampleSize(Rarity rarity){
		return chanceByRarity.get(rarity);
	}
	
	public BigInteger getChanceSampleSize(Unit unit){
		return chanceByUnit.get(unit);
	}
	
	@Override
	public String toString(){
		StringBuilder stb = new StringBuilder();
		stb.append(samples).append(" Samples\n\n");
		for(Rarity r : Rarity.values())
			stb.append(r).append(" ").append(CHANCE.format(getChanceByRarity(r))).append(" (").append(getRaritySampleSize(r)).append(" Samples)\n");
		stb.append("\n");
		for(Unit r : chanceByUnit.keySet())
			stb.append(r).append(" ").append(CHANCE.format(getChanceByUnit(r))).append(" (").append(getChanceSampleSize(r)).append(" Samples)\n");
		return stb.toString();
	}
}
