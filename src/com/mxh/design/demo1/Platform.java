package com.mxh.design.demo1;

/**
 * 平台接口
 * @author S
 *
 */
public interface Platform {
	/**
	 * 注册观察者
	 * @param o
	 */
	public void register(Observer o);
	
	/**
	 * 移除观察者
	 * @param o
	 */
	public void unregister(Observer o);
	
	/**
	 * ֪ͨ通知观察者
	 * @param content
	 */
	public void notifyMessage(String content);
	
}
