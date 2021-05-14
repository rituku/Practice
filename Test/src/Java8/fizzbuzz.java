package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class fizzbuzz {
	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(1, 2, 3, 5, 10, 15);
		List<String> lst1 = Arrays.asList("tests", "", "riturani", "", "rani");
		List<Object> str = lst.stream().map(i -> i%15 == 0 ? "fizzbuzz" : i%5 == 0 ? "fizz" : i%3 == 0 ? "buzz" : Integer.valueOf(i)).collect(Collectors.toList());
	    System.out.println(str);
	    
	    List<String> str1 = lst1.stream().filter(i -> !i.isEmpty()).collect(Collectors.toList());
	    System.out.println(str1);
	    
	    List<String> str2 = lst1.stream().filter(x -> x.length()>4).collect(Collectors.toList());
	    System.out.println(str2);
	    
	    List<String> str3 = lst1.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
	    System.out.println(str3);
	 //   List<String> filtered = lst1.stream().filter(x -> !x.isEmpty()) .collect(Collectors.toList()); 
	//    System.out.printf("Original List : %s, List without Empty Strings : %s %n", lst1, filtered);
}

}
