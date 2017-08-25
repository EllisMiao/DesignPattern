package com.mxh.design.demo11;

/**
 * 懒汉模式 线程安全 效率低
 * @author S
 *
 */
public class Singleton2 {
	
	private static Singleton2 instance;
	
	private Singleton2(){
		
	}
	
	public static synchronized Singleton2 getInstance(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
}
