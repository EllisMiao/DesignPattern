package com.mxh.design.demo4;

/**
 * 主管
 * @author S
 *
 */
public class Director extends Leader{

	

	@Override
	public void handleRequest(QingjiaRequest request) {
		// TODO Auto-generated method stub
		System.out.println(request.name+":请假"+request.days+"天");
		if(request.days<=3){//小于3天
			System.out.println("主管:批准");
		}else{
			System.out.println("主管:请假大于3天,需要请示上级");
			if(this.nextLeader!=null){
				this.nextLeader.handleRequest(request);
			}
		}
	}

}
