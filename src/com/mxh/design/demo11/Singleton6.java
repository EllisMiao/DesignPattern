package com.mxh.design.demo11;

/**
 * 静态内部类
 * @author S
 *
 */
public class Singleton6 {
	private static class LazyHolder{
		private static final Singleton6 instance = new Singleton6();
	}
	
	private Singleton6(){
		
	}
	
	public static final Singleton6 getInstance(){
		return LazyHolder.instance;
	}
}
