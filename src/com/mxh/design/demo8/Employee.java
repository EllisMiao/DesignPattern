package com.mxh.design.demo8;

/**
 * 雇员类
 * @author S
 *
 */
public class Employee extends Staff{

	public Employee(String name,String position){
		this.name = name;
		this.position = position;
	}
	
	@Override
	public void add(Staff staff) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Staff staff) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("姓名："+name+"，职位："+position);
	}
	
}
