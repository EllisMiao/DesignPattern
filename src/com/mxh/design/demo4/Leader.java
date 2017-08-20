package com.mxh.design.demo4;

/**
 * 领导
 * @author S
 *
 */
public abstract class Leader {

	//领导的下一级领导
	public Leader nextLeader;

	//设置领导的下一级领导
	public void setNextLeader(Leader leader){
		this.nextLeader = leader;
	}

	//处理请求
	public abstract void handleRequest(QingjiaRequest request);
}
