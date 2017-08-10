package com.mxh.design.demo1;

/**
 * ƽ̨�ӿ�
 * @author S
 *
 */
public interface Platform {
	/**
	 * ��ӹ۲���
	 * @param o
	 */
	public void register(Observer o);
	
	/**
	 * �Ƴ��۲���
	 * @param o
	 */
	public void unregister(Observer o);
	
	/**
	 * ֪ͨ�۲���
	 * @param content
	 */
	public void notifyMessage(String content);
	
}
