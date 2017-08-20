package com.mxh.design.demo4;

/**
 * 设计模式-责任链模式
 * @author S
 *
 */
public class Main {
	
	public static void main(String args[]){

		//小明请假2天
		QingjiaRequest request = new QingjiaRequest();
		request.name = "小明";
		request.days = 2;
		//小刚请假5天
		QingjiaRequest request1 = new QingjiaRequest();
		request1.name = "小刚";
		request1.days = 5;

		//主管
		Leader director = new Director();
		//经理
		Leader manager = new Manager();
		//主管指定下一级领导
		director.setNextLeader(manager);
		//处理请假
		director.handleRequest(request);
		director.handleRequest(request1);
	}
}
