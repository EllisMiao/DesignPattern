package com.mxh.design.demo1;

public class B implements Observer{

	@Override
	public void update(String content) {
		// TODO Auto-generated method stub
		System.out.println("我是B,我接收到的信息："+content);
	}
	
}
