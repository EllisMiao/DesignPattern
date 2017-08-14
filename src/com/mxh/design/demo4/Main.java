package com.mxh.design.demo4;

/**
 * 设计模式-责任链模式
 * @author S
 *
 */
public class Main {
	
	public static void main(String args[]){
		QingjiaRequest request = new QingjiaRequest();
		request.name = "张三";
		request.days = 3;
		
		Leader director = new Director();
		Leader manager = new Manager();
		director.setNextLeader(manager);
		director.handleRequest(request);
		
	}
}
