package com.mxh.design.demo5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * 设计模式之迭代器模式
 * @author S
 *
 */
public class Main {
	
	public static void main(String args[]){
		List list = new ArrayList<>();
		list.add("abc");
		list.add("456");
		Iterator it =  list.iterator();
		while(it.hasNext()){
			it.next();
			System.out.println(it.next());
		}
	}
}
