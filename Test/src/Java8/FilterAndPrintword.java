package Java8;

import java.util.Arrays;
import java.util.List;

public class FilterAndPrintword {

	public static void main(String[] args) {
		List<String> st = Arrays.asList("ritu", "somit", "mona", "sona");
		
	//	st.stream().filter(name -> !name.equals("mona")).forEach(i -> System.out.println(i));
		
		st.stream().filter(name -> !name.equals("mona")).forEach(System.out::println);
		
	}

}
