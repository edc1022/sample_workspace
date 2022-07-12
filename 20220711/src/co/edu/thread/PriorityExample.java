package co.edu.thread;

class CalcThread extends Thread {
	
	public CalcThread(String name) {
		setName(name);
	}
	@Override
	public void run() {
		for ( int i = 0; i < 2000000000; i++)
			if(i%100000000 == 0) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
					
				}
			}
		
		System.out.println("Thread: " + getName());
	}
	

	}


public class PriorityExample {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			Thread thread = new CalcThread("Thread-" + i);
			if (i != 10) {
				thread.setPriority(1);

			} else {
				thread.setPriority(10);
			}
			thread.start();		
		}
		
		
		
	}
	

}
