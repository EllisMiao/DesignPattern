package com.mxh.design.demo6;


/**
 * 设计模式之装饰者模式
 */
public class Main {
	
	public static void main(String args[]){
		//有花园有泳池
		House house1 = new GardenDecorator(new SwimmingPoolDecorator(new Flat()));
		//有花园
		House house2 = new GardenDecorator(new Flat());
		System.out.println(house1.getDesc());
		System.out.println(house2.getDesc());
	}
}
