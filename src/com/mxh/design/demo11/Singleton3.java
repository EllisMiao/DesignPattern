package com.mxh.design.demo11;

/**
 * 饿汉模式
 * @author S
 *
 */
public class Singleton3 {
	
	private static Singleton3 instance = new Singleton3();
	
	private Singleton3(){
		
	}
	
	public static Singleton3 getInstance(){
		return instance;
	}
	
}
