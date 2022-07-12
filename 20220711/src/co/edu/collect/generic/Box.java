package co.edu.collect.generic;

public class Box <T>{
	private Object obj;
	
	public void set(Object obj) {
		this.obj = obj;
		
	}

	public Object get() {
		return obj;
		
	}
	
}
