package com.mxh.design.demo6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * javaIO中的装饰者模式和适配器模式
 * @author S
 *
 */
public class Main2 {
	
	public static void main(String args[]){
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("")));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("")));
			//适配器模式
			ByteArrayInputStream stream = new ByteArrayInputStream(null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
