package Tests;

public class localclass {

	void test() {
	   int s = 22;
			
		class testlo{
          void ss() {
        	  System.out.println(s);
          }
		}
		testlo t = new testlo();
		t.ss();
	}
	public static void main(String[] args) {
		localclass lc = new localclass();
		lc.test();
		
		String sss = "xyz";
		sss += "XYZ";
		System.out.println(8+2+"test"+2+1);
	}
}
