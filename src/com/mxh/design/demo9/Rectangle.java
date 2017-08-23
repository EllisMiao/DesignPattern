package com.mxh.design.demo9;

public class Rectangle extends Shape{

	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(color.colorName+"矩形");
	}

}
