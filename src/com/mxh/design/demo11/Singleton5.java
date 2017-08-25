package com.mxh.design.demo11;

/**
 * 双重检验锁
 * @author S
 *
 */
public class Singleton5 {
	
	private Singleton5() {}
	
    private static Singleton5 instance=null;  
	
	public static Singleton5 getInstance(){
		if(instance==null){
			synchronized(Singleton5.class){
				if(instance == null){
					instance = new Singleton5();
				}
			}
		}
		return instance;
	}
	
}
