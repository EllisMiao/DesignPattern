package com.mxh.design.demo10;

/**
 * 状态模式
 * @author S
 *
 */
public class Main {
	
	public static void main(String args[]){
		
		State state = new State();
		state.setWeather(new Sunny());
		state.getWeather();
		state.setWeather(new Rain());
		state.getWeather();
	}
	
}
