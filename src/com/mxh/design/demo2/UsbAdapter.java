package com.mxh.design.demo2;

/**
 * 转换器
 * @author S
 *
 */
public class UsbAdapter  implements SmallPort{

	private BigPort port;
	
	public UsbAdapter(BigPort port){
		this.port = port;
	}

	@Override
	public String useSmallPort() {
		// TODO Auto-generated method stub
		return port.useBigPort();
	}

}
