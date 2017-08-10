package com.mxh.design.demo2;

/**
 * 苹果手机
 */
public class Iphone {

	/**
	 * 充电
	 * @param port
	 */
	public void charge(SmallPort port){
		System.out.println("苹果手机使用"+port.useSmallPort()+"充电");
	}
}
