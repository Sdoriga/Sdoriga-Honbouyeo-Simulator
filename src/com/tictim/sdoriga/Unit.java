package com.tictim.sdoriga;

import java.math.BigDecimal;

public final class Unit{
	public static final Unit NORMAL = new Unit("³ë¸»", Rarity.N, "0");
	
	private final String name;
	private final Rarity rarity;
	private final BigDecimal defaultChance;
	
	public Unit(String name, Rarity rarity, String defaultChance){
		this(name, rarity, new BigDecimal(defaultChance));
	}
	
	public Unit(String name, Rarity rarity, BigDecimal defaultChance){
		this.name = name;
		this.rarity = rarity;
		this.defaultChance = defaultChance;
	}
	
	public String getName(){
		return name;
	}
	
	public Rarity getRarity(){
		return rarity;
	}
	
	public BigDecimal getChance(){
		return defaultChance;
	}
	
	@Override
	public String toString(){
		return rarity+" "+name;
	}
	
	@Override
	public boolean equals(Object o){
		if(o!=null&&o.getClass()==Unit.class){
			Unit o2 = (Unit)o;
			return o2.name.equals(this.name)&&o2.rarity.equals(this.rarity);
		}else return false;
	}
	
	@Override
	public int hashCode(){
		return name.hashCode();
	}
}
