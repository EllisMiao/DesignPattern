package com.mxh.design.demo1;

/**
 * 观察者接口
 */
public interface Observer {
	/**
	 * 更新内容
	 * @param content
	 */
	public void update(String content);
}
