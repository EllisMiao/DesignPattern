package com.mxh.design.demo7;

/**
 * 设计模式之外观模式
 * @author S
 *
 */
public class Main {
	
	public static void main(String args[]){
		Computer computer = new Computer();
		computer.start();
		computer.close();
	}
	
}
