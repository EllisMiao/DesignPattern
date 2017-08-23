package com.mxh.design.demo9;
/**
 * 设计模式之桥接模式
 * @author S
 *
 */
public class Main {
	
	public static void main(String args[]){
		Shape circle = new Circle();
		Shape rectangle = new Rectangle();
		
		circle.setColor(new WhiteColor());
		rectangle.setColor(new RedColor());
		
		circle.draw();
		rectangle.draw();
	}
	
}
