package com.mxh.design.demo2;
/**
 *   ≈‰∆˜ƒ£ Ω
 * @author S
 *
 */
public class Main {
	public static void main(String args[]){
		
		AndroidUsbLine line1 = new AndroidUsbLine();
		Android android = new Android();
		android.charge(line1);
		
		IphoneUsbLine line2 = new IphoneUsbLine();
		Iphone iphone = new Iphone();
		iphone.charge(line2);
		
		BigPort line3 = new UsbAdapter(line2);
		android.charge(line3);
	}
}
