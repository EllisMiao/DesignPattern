package com.mxh.design.demo1;

/**
 * �۲���ģʽ
 * @author S
 *
 */
public class Main {
	public static void main(String args[]){
		WeChatPlatform platform = new WeChatPlatform();
		A a = new A();
		B b = new B();
		//�û�����ƽ̨����ӹ۲���
		platform.register(a);
		platform.register(b);
		//������Ϣ��������
		platform.notifyMessage("���������ܺ�");
		//�û�ȡ������ƽ̨���Ƴ��۲���
		platform.unregister(a);
		//������Ϣ��������
		platform.notifyMessage("����Ҫ����");
	}
}
