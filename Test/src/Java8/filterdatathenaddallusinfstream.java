package Java8;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Predicate;
import java.util.function.Predicate;

public class filterdatathenaddallusinfstream {
public static void main(String[] args) {
	List<Integer> values = Arrays.asList(1, 3, 6);
	
	/*
	 * Predicate<Integer> p = new Predicate<Integer>() { public boolean test(Integer
	 * i) { return i%5 == 0; } };
	 */
	
	/*
	 * System.out.println(values.stream() .filter(i -> i%5 == 0) .reduce(0, (c,e) ->
	 * c+e));
	 */
	
	//System.out.println(values.stream().filter(p).reduce(0, (c,e) -> c+e));
	
	System.out.println(values.stream().filter(i -> i%5 == 0).findFirst().map(i -> i*2).orElse(76));
	
}
}
