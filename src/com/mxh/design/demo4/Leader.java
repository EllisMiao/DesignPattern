package com.mxh.design.demo4;

/**
 * 领导
 * @author S
 *
 */
public abstract class Leader {
	
	public Leader nextLeader;
	
	public void setNextLeader(Leader leader){
		this.nextLeader = leader;
	}
	
	public abstract void handleRequest(QingjiaRequest request);
}
