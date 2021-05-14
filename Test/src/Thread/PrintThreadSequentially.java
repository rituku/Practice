package Thread;

public class PrintThreadSequentially {

	public static void main(String[] args) {
		Printthreeseq seq1 = new Printthreeseq(1);
		Printthreeseq seq2 = new Printthreeseq(2);
		Printthreeseq seq3 = new Printthreeseq(0);
		
		Thread t1 = new Thread(seq1,"t1");
		Thread t2 = new Thread(seq2, "t2");
		Thread t3 = new Thread(seq3, "t3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
