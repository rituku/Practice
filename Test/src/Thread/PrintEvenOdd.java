package Thread;

public class PrintEvenOdd {

	static int N;
	int counter = 1;
	
	public void printOddNumber() {
		synchronized(this){
		while(counter < N) {
			while(counter%2 == 0) {
				try {
				wait();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println(counter+" odd ");
			counter++;
			notify();
	      }
		}		
	}
	
	public void printEvenNumber() {
		synchronized(this) {
			while(counter < N) {
				while(counter%2 != 0) {
					try {
						wait();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println(counter+ " Even ");
				counter++;
				notify();
			}
		}
	}
	
	public static void main(String[] args) {
		N = 10;
		PrintEvenOdd pt = new PrintEvenOdd();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				pt.printEvenNumber();				 
			}			
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				 pt.printOddNumber();	
			}			
		});
		
		t1.start();
		t2.start();		
	}
}
