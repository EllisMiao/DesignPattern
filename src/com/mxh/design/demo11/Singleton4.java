package com.mxh.design.demo11;

/**
 * 饿汉变种
 * @author S
 *
 */
public class Singleton4 {
	
	private static Singleton4 instance = new Singleton4();
	
	static{
		instance = new Singleton4();
	}
	
	public static Singleton4 getInstance(){
		return instance;
	}
}
