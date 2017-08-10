package com.mxh.design.demo1;

import java.util.ArrayList;
import java.util.List;
/**
 * 微信公众平台
 * @author S
 *
 */
public class WeChatPlatform implements Platform{

	private List<Observer> list = new ArrayList<>();
	
	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		list.add(o);
	}

	@Override
	public void unregister(Observer o) {
		// TODO Auto-generated method stub
		list.remove(o);
	}

	@Override
	public void notifyMessage(String content) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++){
			list.get(i).update(content);
		}
	}

}
