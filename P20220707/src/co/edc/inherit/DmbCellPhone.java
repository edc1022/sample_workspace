package co.edc.inherit;

/*
 *  상속 : 자식이 부모를 선택(extends)
 */
public class DmbCellPhone extends CellPhone {
	
	private int channel1;

	public DmbCellPhone() {
		super(); //
	}	
	public DmbCellPhone(String model, String color, int channel1) {
		super(model, color);
		this.channel1 = channel1;
	}
	public void turnOn() {
		System.out.println("dmb화면 on");
	}
	public void turnOff() {
		System.out.println("dmb화면 off");
	}
	
	
	// overriding : 재정의
	@Override
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	@Override
	public String toString() {
		return "model명은: " + getModel() + ", "색상은 " + getColor() + " , 채널은 + chneel1 입니다.");
	}	


