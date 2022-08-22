package com.towel.deliver;

public class Deliver {
	/*DELIVER_ADDR  NOT NULL VARCHAR2(20) 
      DELIVER_TIME           NUMBER       
      DELIVER_CYCLE          NUMBER 
	*/
	
	
	private String DeliverAddr;
	private int DeliverTime;
	private int DeliverCycle;
	private String memberId;
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getDeliverAddr() {
		return DeliverAddr;
	}
	public void setDeliverAddr(String deliverAddr) {
		DeliverAddr = deliverAddr;
	}
	public int getDeliverTime() {
		return DeliverTime;
	}
	public void setDeliverTime(int deliverTime) {
		DeliverTime = deliverTime;
	}
	public int getDeliverCycle() {
		return DeliverCycle;
	}
	public void setDeliverCycle(int deliverCycle) {
		DeliverCycle = deliverCycle;
	}
	
	

}
