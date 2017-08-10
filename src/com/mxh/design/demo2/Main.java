package com.mxh.design.demo2;
/**
 * 适配器模式
 * @author S
 *
 */
public class Main {
	public static void main(String args[]){

		//安卓手机充电
		AndroidUsbLine line1 = new AndroidUsbLine();
		Android android = new Android();
		android.charge(line1);

		//苹果手机充电
		IphoneUsbLine line2 = new IphoneUsbLine();
		Iphone iphone = new Iphone();
		iphone.charge(line2);
		
		SmallPort line3 = new UsbAdapter(line1);
		iphone.charge(line3);
	}
}
