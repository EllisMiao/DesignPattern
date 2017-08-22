package com.mxh.design.demo8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 主管类
 * @author S
 *
 */
public class Manager extends Staff{

	private List<Staff> list;
	
	public Manager(String name,String position){
		this.name = name;
		this.position = position;
		list = new ArrayList<>();
	}

	@Override
	public void add(Staff staff) {
		// TODO Auto-generated method stub
		list.add(staff);
	}

	@Override
	public void remove(Staff staff) {
		// TODO Auto-generated method stub
		list.remove(staff);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("姓名："+name+",职位："+position);
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			((Staff)iterator.next()).print();
		}
	}
}
