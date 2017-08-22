package com.mxh.design.demo8;

/**
 * 员工类
 * @author S
 *
 */
public abstract class Staff {
	
	//姓名
	public String name;
	//职位
	public String position;
	//添加员工
	public abstract void add(Staff staff);
	//移除员工
	public abstract void remove(Staff staff);
	//打印员工
	public abstract void print();
}
