package Thread;

public class Printalternate {
	static int N;
	int counter = 1;
	public void printthread1() {
		synchronized(this) {
			while(counter < N) {
				while(counter%2 == 0) {
				try {
					wait();
				}
				catch(Exception e) {
					e.printStackTrace();
				}}
				System.out.println("thread 1 ");
				counter++;
				notify();
			}
		} 
	}
	public void printthread2() {
		synchronized(this) {
			while(counter < N) {
				while(counter%2 != 0) {
				try {
					wait();
				}
				catch(Exception e) {
					e.printStackTrace();
				}}
				System.out.println("thread 2 ");
				counter++;
				notify();
			}
		} 
	}
	public static void main(String[] args) {
		 N = 10;
		 Printalternate at = new Printalternate();
		Thread t1 = new Thread(new Runnable() {						
			public void run() {
				at.printthread1();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
		 public void run() {
			 at.printthread2();
		 }			
		});
		t1.start();
		t2.start();
	}

}
