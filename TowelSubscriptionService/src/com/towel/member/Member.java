package com.towel.member;

public class Member {
/*MEMBER_ID       NOT NULL VARCHAR2(20)  
  MEMBER_NAME     NOT NULL VARCHAR2(10)  
  MEMBER_PW       NOT NULL VARCHAR2(15)  
  MEMBER_ADDR     NOT NULL VARCHAR2(100) 
  MEMBER_PHONE             VARCHAR2(15)  
  MEMBER_CARD              NUMBER        
  MEMBER_ACCOOUNT          NUMBER 
*/
	
	private String memberId; //회원 ID
	private String memberName;//회원 이름
	private String memberPw;//회원 비밀번호
	private String memberAddr;//회원 주소
	private String memberPhone;//회원 전화번호
	private int memberCard;//회원 카드번호
	private int memberAccount;//회원 계좌번호
	
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String string) {
		this.memberPw = string;
	}
	public String getMemberAddr() {
		return memberAddr;
	}
	public void setMemberAddr(String memberAddr) {
		this.memberAddr = memberAddr;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public int getMemberCard() {
		return memberCard;
	}
	public void setMemberCard(int memberCard) {
		this.memberCard = memberCard;
	}
	public int getMemberAccount() {
		return memberAccount;
	}
	public void setMemberAccount(int memberAccount) {
		this.memberAccount = memberAccount;
	}
	
	
	
	
	

}
