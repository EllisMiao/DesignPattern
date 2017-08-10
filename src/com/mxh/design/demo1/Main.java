package com.mxh.design.demo1;

/**
 * 观察者模式
 * @author S
 *
 */
public class Main {
	public static void main(String args[]){
		WeChatPlatform platform = new WeChatPlatform();
		A a = new A();
		B b = new B();
		//用户订阅平台，添加观察者
		platform.register(a);
		platform.register(b);
		//发送消息给订阅者
		platform.notifyMessage("上午天气很好");
		//用户取消订阅平台，移除观察者
		platform.unregister(a);
		//发送消息给订阅者
		platform.notifyMessage("下午要下雨");
	}
}
