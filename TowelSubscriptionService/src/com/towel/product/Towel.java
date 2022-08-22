package com.towel.product;

public class Towel {
	/*TOWEL_DENIER  NOT NULL NUMBER       
	TOWEL_ORGANIC          VARCHAR2(20) 
	TOWEL_COLOR            VARCHAR2(20) 
	TOWEL_NUM              NUMBER       
*/
	
	private int towelDenier;
	private String towelOrganic;
	private String towelColor;
	private int towelNum;
	private String memberId;
	
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
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
	public void setTowelColor(String tewelColor) {
		this.towelColor = tewelColor;
	}
	public int getTowelNum() {
		return towelNum;
	}
	public void setTowelNum(int towelNum) {
		this.towelNum = towelNum;
	}
	
	
	
	

}
