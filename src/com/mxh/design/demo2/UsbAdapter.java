package com.mxh.design.demo2;

/**
 * ƻ��������תAndroid������ת��ͷ
 * @author S
 *
 */
public class UsbAdapter  implements BigPort{

	private SmallPort port;
	
	public UsbAdapter(SmallPort port){
		this.port = port;
	}

	@Override
	public String useBigPort() {
		// TODO Auto-generated method stub
		return port.useSmallPort();
	}

}
