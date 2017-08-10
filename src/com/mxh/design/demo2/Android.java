package com.mxh.design.demo2;

/**
 * android手机
 */
public class Android {

	/**
	 * 充电
	 * @param port
	 */
	public void charge(BigPort port){
		System.out.println("Android手机使用"+port.useBigPort()+"充电");
	}
}
