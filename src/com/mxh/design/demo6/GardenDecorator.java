package com.mxh.design.demo6;

/**
 * 花园装饰
 * @author S
 *
 */
public class GardenDecorator extends Decorator{

	private House house;
	
	public GardenDecorator(House house){
		this.house = house;
	}
	
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return "有花园的"+house.getDesc();
	}

}
