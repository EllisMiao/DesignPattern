package com.mxh.design.demo4;

public class Manager extends Leader{

	@Override
	public void handleRequest(QingjiaRequest request) {
		// TODO Auto-generated method stub
		if(request.days<5){
			System.out.println("经理:请假小于5天,批准");
		}else{
			
		}
	}


}
