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
		
		infuse.addUnit(new Unit("ī��", SR, "0.0005"));
		infuse.addUnit(new Unit("�����", SR, "0.0005"));
		infuse.addUnit(new Unit("�ȸ�", SR, "0.0005"));
		infuse.addUnit(new Unit("������ī", SR, "0.0005"));
		infuse.addUnit(new Unit("������", SR, "0.0005"));
		infuse.addUnit(new Unit("�ÿ�", SR, "0.0005"));
		infuse.addUnit(new Unit("����", SR, "0.0005"));
		infuse.addUnit(new Unit("��", SR, "0.0005"));
		infuse.addUnit(new Unit("�߹���Ű", SR, "0.0005"));
		infuse.addUnit(new Unit("����", SR, "0.0005"));
		infuse.addUnit(new Unit("������", SR, "0.0025"));
		infuse.addUnit(new Unit("����Ÿ", SR, "0.0025"));
		infuse.addUnit(new Unit("��", SR, "0.0025"));
		infuse.addUnit(new Unit("�þ��", SR, "0.0025"));
		infuse.addUnit(new Unit("����ü", SR, "0.0025"));
		infuse.addUnit(new Unit("����", SR, "0.0025"));
		infuse.addUnit(new Unit("�Ẹ", SR, "0.0025"));
		infuse.addUnit(new Unit("��ݴ�", SR, "0.0025"));
		infuse.addUnit(new Unit("����", SR, "0.005"));
		infuse.addUnit(new Unit("�콺Ƽ��", SR, "0.005"));
		infuse.addUnit(new Unit("����", SR, "0.005"));
		infuse.addUnit(new Unit("����", SR, "0.005"));
		infuse.addUnit(new Unit("��", SR, "0.005"));
		infuse.addUnit(new Unit("��Ƽ��", SR, "0.005"));
		infuse.addUnit(new Unit("ī����", SR, "0.005"));
		infuse.addUnit(new Unit("�׵�", SR, "0.005"));
		infuse.addUnit(new Unit("Ǫ��", SR, "0.005"));
		infuse.addUnit(new Unit("�����Ʈ", SR, "0.005"));
		infuse.addUnit(new Unit("ī��", R, "0.002"));
		infuse.addUnit(new Unit("�����", R, "0.002"));
		infuse.addUnit(new Unit("�ȸ�", R, "0.002"));
		infuse.addUnit(new Unit("������ī", R, "0.002"));
		infuse.addUnit(new Unit("������", R, "0.002"));
		infuse.addUnit(new Unit("�ÿ�", R, "0.002"));
		infuse.addUnit(new Unit("����", R, "0.002"));
		infuse.addUnit(new Unit("��", R, "0.002"));
		infuse.addUnit(new Unit("�߹���Ű", R, "0.002"));
		infuse.addUnit(new Unit("����", R, "0.002"));
		infuse.addUnit(new Unit("������", R, "0.015"));
		infuse.addUnit(new Unit("����Ÿ", R, "0.015"));
		infuse.addUnit(new Unit("��", R, "0.015"));
		infuse.addUnit(new Unit("�þ��", R, "0.015"));
		infuse.addUnit(new Unit("����ü", R, "0.015"));
		infuse.addUnit(new Unit("����", R, "0.015"));
		infuse.addUnit(new Unit("�Ẹ", R, "0.015"));
		infuse.addUnit(new Unit("��ݴ�", R, "0.015"));
		infuse.addUnit(new Unit("����", R, "0.006"));
		infuse.addUnit(new Unit("�콺Ƽ��", R, "0.006"));
		infuse.addUnit(new Unit("����", R, "0.006"));
		infuse.addUnit(new Unit("����", R, "0.006"));
		infuse.addUnit(new Unit("��", R, "0.006"));
		infuse.addUnit(new Unit("��Ƽ��", R, "0.006"));
		infuse.addUnit(new Unit("ī����", R, "0.006"));
		infuse.addUnit(new Unit("�׵�", R, "0.006"));
		infuse.addUnit(new Unit("Ǫ��", R, "0.006"));
		infuse.addUnit(new Unit("�����Ʈ", R, "0.006"));
		infuse.addUnit(new Unit("��", R, "0.006"));
		infuse.addUnit(new Unit("����", R, "0.006"));
		infuse.addUnit(new Unit("Ƽī", R, "0.006"));
		infuse.addUnit(new Unit("Į��", R, "0.006"));
		infuse.addUnit(new Unit("��������", R, "0.006"));
		
		return infuse;
	}
	
	private static Infuse eventInfuse(InfuseSetting setting){
		Infuse infuse = new Infuse(setting);
		
		infuse.addUnit(new Unit("��������SP", SSR, "0.0075"));
		infuse.addUnit(new Unit("�ÿ�", SSR, "0.0025"));
		infuse.addUnit(new Unit("����", SSR, "0.0025"));
		infuse.addUnit(new Unit("ī��", SR, "0.0003"));
		infuse.addUnit(new Unit("�����", SR, "0.0003"));
		infuse.addUnit(new Unit("�ȸ�", SR, "0.0003"));
		infuse.addUnit(new Unit("������ī", SR, "0.0003"));
		infuse.addUnit(new Unit("������", SR, "0.0003"));
		infuse.addUnit(new Unit("�ÿ�", SR, "0.001"));
		infuse.addUnit(new Unit("����", SR, "0.0003"));
		infuse.addUnit(new Unit("��", SR, "0.0003"));
		infuse.addUnit(new Unit("�߹���Ű", SR, "0.0003"));
		infuse.addUnit(new Unit("����", SR, "0.001"));
		infuse.addUnit(new Unit("������", SR, "0.0015"));
		infuse.addUnit(new Unit("����Ÿ", SR, "0.0015"));
		infuse.addUnit(new Unit("��", SR, "0.0015"));
		infuse.addUnit(new Unit("�þ��", SR, "0.0015"));
		infuse.addUnit(new Unit("����ü", SR, "0.0015"));
		infuse.addUnit(new Unit("����", SR, "0.0015"));
		infuse.addUnit(new Unit("�Ẹ", SR, "0.0015"));
		infuse.addUnit(new Unit("��ݴ�", SR, "0.0015"));
		infuse.addUnit(new Unit("����", SR, "0.003"));
		infuse.addUnit(new Unit("�콺Ƽ��", SR, "0.003"));
		infuse.addUnit(new Unit("����", SR, "0.003"));
		infuse.addUnit(new Unit("����", SR, "0.003"));
		infuse.addUnit(new Unit("��", SR, "0.003"));
		infuse.addUnit(new Unit("��Ƽ��", SR, "0.003"));
		infuse.addUnit(new Unit("ī����", SR, "0.003"));
		infuse.addUnit(new Unit("�׵�", SR, "0.003"));
		infuse.addUnit(new Unit("Ǫ��", SR, "0.003"));
		infuse.addUnit(new Unit("�����Ʈ", SR, "0.003"));
		infuse.addUnit(new Unit("ī��", R, "0.001"));
		infuse.addUnit(new Unit("�����", R, "0.001"));
		infuse.addUnit(new Unit("�ȸ�", R, "0.001"));
		infuse.addUnit(new Unit("������ī", R, "0.001"));
		infuse.addUnit(new Unit("������", R, "0.001"));
		infuse.addUnit(new Unit("�ÿ�", R, "0.004"));
		infuse.addUnit(new Unit("����", R, "0.001"));
		infuse.addUnit(new Unit("��", R, "0.001"));
		infuse.addUnit(new Unit("�߹���Ű", R, "0.001"));
		infuse.addUnit(new Unit("����", R, "0.004"));
		infuse.addUnit(new Unit("������", R, "0.015"));
		infuse.addUnit(new Unit("����Ÿ", R, "0.015"));
		infuse.addUnit(new Unit("��", R, "0.015"));
		infuse.addUnit(new Unit("�þ��", R, "0.015"));
		infuse.addUnit(new Unit("����ü", R, "0.015"));
		infuse.addUnit(new Unit("����", R, "0.015"));
		infuse.addUnit(new Unit("�Ẹ", R, "0.015"));
		infuse.addUnit(new Unit("��ݴ�", R, "0.015"));
		infuse.addUnit(new Unit("����", R, "0.006"));
		infuse.addUnit(new Unit("�콺Ƽ��", R, "0.006"));
		infuse.addUnit(new Unit("����", R, "0.006"));
		infuse.addUnit(new Unit("����", R, "0.006"));
		infuse.addUnit(new Unit("��", R, "0.006"));
		infuse.addUnit(new Unit("��Ƽ��", R, "0.006"));
		infuse.addUnit(new Unit("ī����", R, "0.006"));
		infuse.addUnit(new Unit("�׵�", R, "0.006"));
		infuse.addUnit(new Unit("Ǫ��", R, "0.006"));
		infuse.addUnit(new Unit("�����Ʈ", R, "0.006"));
		infuse.addUnit(new Unit("��", R, "0.006"));
		infuse.addUnit(new Unit("����", R, "0.006"));
		infuse.addUnit(new Unit("Ƽī", R, "0.006"));
		infuse.addUnit(new Unit("Į��", R, "0.006"));
		infuse.addUnit(new Unit("��������", R, "0.006"));
		
		return infuse;
	}
}
