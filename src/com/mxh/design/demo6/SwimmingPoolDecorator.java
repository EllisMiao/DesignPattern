package com.mxh.design.demo6;

/**
 * 游泳池装饰
 * @author S
 *
 */
public class SwimmingPoolDecorator extends Decorator{

	private House house;
	
	public SwimmingPoolDecorator(House house){
		this.house = house;
	}
	
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return "有泳池的"+house.getDesc();
	}

}
