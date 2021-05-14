package Tests;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FizzBuzz {
	public static Collection<Object[]> generateData()
	  {
	    return Arrays.asList(new Object[] { 1, "1"},
	    		             new Object[] { 3, "fizz"},
	    		             new Object[] { 5, "buzz" },
	    		             new Object[] { 15, "fizz-buzz" });
	  }
	
	public static void main(String[] args) {
		final StringBuilder display = new StringBuilder();
		
		List<Integer> lt = Arrays.asList(3, 15, 1, 5);
		
		for (int i = 0; i < lt.size(); i++) {
			if(lt.get(i) % 15 == 0) {
				display.append("fizzbuzz+");
			}
			else if(lt.get(i) % 5 == 0) {
				display.append("fizz+");
			}
			else if(lt.get(i) % 3 == 0) {
				display.append("buzz+");
			}
			else {
				display.append(lt.get(i)+"+");
			}
		}
		
		Collection<Object[]> test = generateData();
		
		//for (int i = 0; i < test.size(); i++) {
			test.forEach(System.out::println);
	//	}
		
		 
		
	}

}
