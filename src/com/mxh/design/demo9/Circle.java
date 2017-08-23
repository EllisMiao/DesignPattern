package com.mxh.design.demo9;

/**
 * 圆形
 * @author S
 *
 */
public class Circle extends Shape{

	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(color.colorName+"圆形");
	}
	
}
