package com.towel.pay;

public class Pay {
/*PAY_ID       NOT NULL VARCHAR2(20) 
  PAY_DAY               NUMBER       
  PAY_SUBCYCLE          NUMBER       
  PAY_METHOD            NUMBER       
*/
	
	private String memberId;
	private int payDay;
	private int paySubcycle;
	private int payMethod;
	
	private String DeliverAddr;
	private int DeliverTime;
	private int DeliverCycle;
	
	private int towelDenier;
	private String towelOrganic;
	private String towelColor;
	private int towelNum;

	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public int getPayDay() {
		return payDay;
	}
	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}
	public int getPaySubcycle() {
		return paySubcycle;
	}
	public void setPaySubcycle(int paySubcycle) {
		this.paySubcycle = paySubcycle;
	}
	public int getPayMethod() {
		return payMethod;
	}
	public void setPayMethod(int payMethod) {
		this.payMethod = payMethod;
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
	public int getTowelDenier() {
		return towelDenier;
	}
	public void setTowelDenier(int towelDenier) {
		this.towelDenier = towelDenier;
	}
	public String getTowelOrganic() {
		return towelOrganic;
	}
	public void setTowelOrganic(String towelOrganic) {
		this.towelOrganic = towelOrganic;
	}
	public String getTowelColor() {
		return towelColor;
	}
	public void setTowelColor(String towelColor) {
		this.towelColor = towelColor;
	}
	public int getTowelNum() {
		return towelNum;
	}
	public void setTowelNum(int towelNum) {
		this.towelNum = towelNum;
	}
	
	
	
}
