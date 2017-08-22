package com.mxh.design.demo8;

/**
 * 设计模式之组合模式
 * @author S
 *
 */
public class Main {
	
	public static void main(String args[]){
		
		//普通员工
		Employee e1 = new Employee("小明","技术开发");
		Employee e2 = new Employee("小刚","技术开发");
		Employee e3 = new Employee("小红","人力资源");
		
		//主管
		Manager m1 = new Manager("李雷","技术主管");
		Manager m2 = new Manager("韩梅梅","人力主管");
		
		//为主管添加员工
		m1.add(e1);
		m1.add(e2);
		m1.remove(e2);
		m2.add(e3);
		
		//老板添加主管
		Boss boss = new Boss("李世民","老板");
		boss.add(m1);
		boss.add(m2);
		boss.print();
	}
	
}
