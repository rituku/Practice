package Emp;

class Thread1 extends Thread {
	
	synchronized public void run() {
		for (int i = 0; i < 6; i++) {
		 System.out.println("Thread1 ");
		}
	}

}
class Thread2 extends Thread{
	
	synchronized public void run() {
		for (int i = 0; i < 6; i++) {
		 System.out.println("Thread2");
		}
	}
	
}

public class Thread {
	
	public static void main(String[] args) {
		Thread1 th = new Thread1();
		Thread1 th2 = new Thread1();
		
		th.run();
		th2.run();
		
	}
}