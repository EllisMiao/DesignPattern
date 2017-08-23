package com.mxh.design.demo9;

/**
 * 形状抽象类
 * @author S
 *
 */
public abstract class Shape {

	//颜色
	public Color color;
	//设置颜色
	public abstract void setColor(Color color);
	//绘画
	public abstract void draw();
}
