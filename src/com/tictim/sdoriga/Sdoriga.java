package com.tictim.sdoriga;

import static com.tictim.sdoriga.Rarity.R;
import static com.tictim.sdoriga.Rarity.SR;
import static com.tictim.sdoriga.Rarity.SSR;
import java.util.HashSet;
import java.util.Set;
import com.tictim.sdoriga.Infuse.InfuseHandler;

public class Sdoriga{
	public static void main(String[] args){
		Infuse infuse = eventInfuse(InfuseSetting.TIGHT);
		//InfuseHandler h = infuse.new InfuseHandler();
		Statistic stat = new Statistic(infuse.getStat());
		for(int i = 0; i<1000000; i++){
			Set<Unit> units = new HashSet<>();
			InfuseHandler h = infuse.new InfuseHandler();
			for(int j = 0; j<2; j++)
				for(Unit u : h.infuse10())
					units.add(u);
			stat.onInfuse(units);
			/*
			for(Unit u : h.infuse10()){
				System.out.print(u);
				System.out.print("   ");
			}
			System.out.println();
			*/
		}
		System.out.println(stat);
	}
	
	private static Infuse defaultInfuse(InfuseSetting setting){
		Infuse infuse = new Infuse(setting);
		
		infuse.addUnit(new Unit("Ä«·»", SR, "0.0005"));
		infuse.addUnit(new Unit("ÀÌÁî¹Ì", SR, "0.0005"));
		infuse.addUnit(new Unit("¼È¸®", SR, "0.0005"));
		infuse.addUnit(new Unit("ÇÁ·¼¸®Ä«", SR, "0.0005"));
		infuse.addUnit(new Unit("»þ¸®½º", SR, "0.0005"));
		infuse.addUnit(new Unit("½Ã¿Â", SR, "0.0005"));
		infuse.addUnit(new Unit("»þ¸¦", SR, "0.0005"));
		infuse.addUnit(new Unit("¸®", SR, "0.0005"));
		infuse.addUnit(new Unit("¾ß¹ÌÃ÷Å°", SR, "0.0005"));
		infuse.addUnit(new Unit("¸®»ç", SR, "0.0005"));
		infuse.addUnit(new Unit("³ªÀÌÁ©", SR, "0.0025"));
		infuse.addUnit(new Unit("¿À½ºÅ¸", SR, "0.0025"));
		infuse.addUnit(new Unit("·á", SR, "0.0025"));
		infuse.addUnit(new Unit("½Ã¾îµµ¾î", SR, "0.0025"));
		infuse.addUnit(new Unit("½ÇÇèÃ¼", SR, "0.0025"));
		infuse.addUnit(new Unit("ÀÚÇÑ", SR, "0.0025"));
		infuse.addUnit(new Unit("¾áº¸", SR, "0.0025"));
		infuse.addUnit(new Unit("¾î±Ý´Ï", SR, "0.0025"));
		infuse.addUnit(new Unit("µô·±", SR, "0.005"));
		infuse.addUnit(new Unit("Çì½ºÆ¼¾Æ", SR, "0.005"));
		infuse.addUnit(new Unit("¹¦¾È", SR, "0.005"));
		infuse.addUnit(new Unit("·ÎÀú", SR, "0.005"));
		infuse.addUnit(new Unit("ÄÝ", SR, "0.005"));
		infuse.addUnit(new Unit("ÆÄÆ¼¸¶", SR, "0.005"));
		infuse.addUnit(new Unit("Ä«´©¶ó", SR, "0.005"));
		infuse.addUnit(new Unit("³×µå", SR, "0.005"));
		infuse.addUnit(new Unit("ÇªÂî", SR, "0.005"));
		infuse.addUnit(new Unit("±¸·ç¿ÐÆ®", SR, "0.005"));
		infuse.addUnit(new Unit("Ä«·»", R, "0.002"));
		infuse.addUnit(new Unit("ÀÌÁî¹Ì", R, "0.002"));
		infuse.addUnit(new Unit("¼È¸®", R, "0.002"));
		infuse.addUnit(new Unit("ÇÁ·¼¸®Ä«", R, "0.002"));
		infuse.addUnit(new Unit("»þ¸®½º", R, "0.002"));
		infuse.addUnit(new Unit("½Ã¿Â", R, "0.002"));
		infuse.addUnit(new Unit("»þ¸¦", R, "0.002"));
		infuse.addUnit(new Unit("¸®", R, "0.002"));
		infuse.addUnit(new Unit("¾ß¹ÌÃ÷Å°", R, "0.002"));
		infuse.addUnit(new Unit("¸®»ç", R, "0.002"));
		infuse.addUnit(new Unit("³ªÀÌÁ©", R, "0.015"));
		infuse.addUnit(new Unit("¿À½ºÅ¸", R, "0.015"));
		infuse.addUnit(new Unit("·á", R, "0.015"));
		infuse.addUnit(new Unit("½Ã¾îµµ¾î", R, "0.015"));
		infuse.addUnit(new Unit("½ÇÇèÃ¼", R, "0.015"));
		infuse.addUnit(new Unit("ÀÚÇÑ", R, "0.015"));
		infuse.addUnit(new Unit("¾áº¸", R, "0.015"));
		infuse.addUnit(new Unit("¾î±Ý´Ï", R, "0.015"));
		infuse.addUnit(new Unit("µô·±", R, "0.006"));
		infuse.addUnit(new Unit("Çì½ºÆ¼¾Æ", R, "0.006"));
		infuse.addUnit(new Unit("¹¦¾È", R, "0.006"));
		infuse.addUnit(new Unit("·ÎÀú", R, "0.006"));
		infuse.addUnit(new Unit("ÄÝ", R, "0.006"));
		infuse.addUnit(new Unit("ÆÄÆ¼¸¶", R, "0.006"));
		infuse.addUnit(new Unit("Ä«´©¶ó", R, "0.006"));
		infuse.addUnit(new Unit("³×µå", R, "0.006"));
		infuse.addUnit(new Unit("ÇªÂî", R, "0.006"));
		infuse.addUnit(new Unit("±¸·ç¿ÐÆ®", R, "0.006"));
		infuse.addUnit(new Unit("ÆÎ", R, "0.006"));
		infuse.addUnit(new Unit("³ª¾ß", R, "0.006"));
		infuse.addUnit(new Unit("Æ¼Ä«", R, "0.006"));
		infuse.addUnit(new Unit("Ä®³¯", R, "0.006"));
		infuse.addUnit(new Unit("¾ÈÁ©¸®¾Æ", R, "0.006"));
		
		return infuse;
	}
	
	private static Infuse eventInfuse(InfuseSetting setting){
		Infuse infuse = new Infuse(setting);
		
		infuse.addUnit(new Unit("¾ÈÁ©¸®¾ÆSP", SSR, "0.0075"));
		infuse.addUnit(new Unit("½Ã¿Â", SSR, "0.0025"));
		infuse.addUnit(new Unit("¸®»ç", SSR, "0.0025"));
		infuse.addUnit(new Unit("Ä«·»", SR, "0.0003"));
		infuse.addUnit(new Unit("ÀÌÁî¹Ì", SR, "0.0003"));
		infuse.addUnit(new Unit("¼È¸®", SR, "0.0003"));
		infuse.addUnit(new Unit("ÇÁ·¼¸®Ä«", SR, "0.0003"));
		infuse.addUnit(new Unit("»þ¸®½º", SR, "0.0003"));
		infuse.addUnit(new Unit("½Ã¿Â", SR, "0.001"));
		infuse.addUnit(new Unit("»þ¸¦", SR, "0.0003"));
		infuse.addUnit(new Unit("¸®", SR, "0.0003"));
		infuse.addUnit(new Unit("¾ß¹ÌÃ÷Å°", SR, "0.0003"));
		infuse.addUnit(new Unit("¸®»ç", SR, "0.001"));
		infuse.addUnit(new Unit("³ªÀÌÁ©", SR, "0.0015"));
		infuse.addUnit(new Unit("¿À½ºÅ¸", SR, "0.0015"));
		infuse.addUnit(new Unit("·á", SR, "0.0015"));
		infuse.addUnit(new Unit("½Ã¾îµµ¾î", SR, "0.0015"));
		infuse.addUnit(new Unit("½ÇÇèÃ¼", SR, "0.0015"));
		infuse.addUnit(new Unit("ÀÚÇÑ", SR, "0.0015"));
		infuse.addUnit(new Unit("¾áº¸", SR, "0.0015"));
		infuse.addUnit(new Unit("¾î±Ý´Ï", SR, "0.0015"));
		infuse.addUnit(new Unit("µô·±", SR, "0.003"));
		infuse.addUnit(new Unit("Çì½ºÆ¼¾Æ", SR, "0.003"));
		infuse.addUnit(new Unit("¹¦¾È", SR, "0.003"));
		infuse.addUnit(new Unit("·ÎÀú", SR, "0.003"));
		infuse.addUnit(new Unit("ÄÝ", SR, "0.003"));
		infuse.addUnit(new Unit("ÆÄÆ¼¸¶", SR, "0.003"));
		infuse.addUnit(new Unit("Ä«´©¶ó", SR, "0.003"));
		infuse.addUnit(new Unit("³×µå", SR, "0.003"));
		infuse.addUnit(new Unit("ÇªÂî", SR, "0.003"));
		infuse.addUnit(new Unit("±¸·ç¿ÐÆ®", SR, "0.003"));
		infuse.addUnit(new Unit("Ä«·»", R, "0.001"));
		infuse.addUnit(new Unit("ÀÌÁî¹Ì", R, "0.001"));
		infuse.addUnit(new Unit("¼È¸®", R, "0.001"));
		infuse.addUnit(new Unit("ÇÁ·¼¸®Ä«", R, "0.001"));
		infuse.addUnit(new Unit("»þ¸®½º", R, "0.001"));
		infuse.addUnit(new Unit("½Ã¿Â", R, "0.004"));
		infuse.addUnit(new Unit("»þ¸¦", R, "0.001"));
		infuse.addUnit(new Unit("¸®", R, "0.001"));
		infuse.addUnit(new Unit("¾ß¹ÌÃ÷Å°", R, "0.001"));
		infuse.addUnit(new Unit("¸®»ç", R, "0.004"));
		infuse.addUnit(new Unit("³ªÀÌÁ©", R, "0.015"));
		infuse.addUnit(new Unit("¿À½ºÅ¸", R, "0.015"));
		infuse.addUnit(new Unit("·á", R, "0.015"));
		infuse.addUnit(new Unit("½Ã¾îµµ¾î", R, "0.015"));
		infuse.addUnit(new Unit("½ÇÇèÃ¼", R, "0.015"));
		infuse.addUnit(new Unit("ÀÚÇÑ", R, "0.015"));
		infuse.addUnit(new Unit("¾áº¸", R, "0.015"));
		infuse.addUnit(new Unit("¾î±Ý´Ï", R, "0.015"));
		infuse.addUnit(new Unit("µô·±", R, "0.006"));
		infuse.addUnit(new Unit("Çì½ºÆ¼¾Æ", R, "0.006"));
		infuse.addUnit(new Unit("¹¦¾È", R, "0.006"));
		infuse.addUnit(new Unit("·ÎÀú", R, "0.006"));
		infuse.addUnit(new Unit("ÄÝ", R, "0.006"));
		infuse.addUnit(new Unit("ÆÄÆ¼¸¶", R, "0.006"));
		infuse.addUnit(new Unit("Ä«´©¶ó", R, "0.006"));
		infuse.addUnit(new Unit("³×µå", R, "0.006"));
		infuse.addUnit(new Unit("ÇªÂî", R, "0.006"));
		infuse.addUnit(new Unit("±¸·ç¿ÐÆ®", R, "0.006"));
		infuse.addUnit(new Unit("ÆÎ", R, "0.006"));
		infuse.addUnit(new Unit("³ª¾ß", R, "0.006"));
		infuse.addUnit(new Unit("Æ¼Ä«", R, "0.006"));
		infuse.addUnit(new Unit("Ä®³¯", R, "0.006"));
		infuse.addUnit(new Unit("¾ÈÁ©¸®¾Æ", R, "0.006"));
		
		return infuse;
	}
}
