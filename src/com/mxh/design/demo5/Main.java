package com.mxh.design.demo5;

/**
 * 设计模式之迭代器模式
 * @author S
 *
 */
public class Main {
	
	public static void main(String args[]){
		List list = new ConcreteList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Iterator iterator = new ConcreteIterator(list);
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
