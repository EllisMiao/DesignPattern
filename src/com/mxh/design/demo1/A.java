package com.mxh.design.demo1;

/**
 * 观察者A
 */
public class A implements Observer{

	@Override
	public void update(String content) {
		// TODO Auto-generated method stub
		System.out.println("我是A,我接收到的信息："+content);
	}

}
