package Java8;

import java.util.Arrays;
import java.util.List;

public class greaterthat100 {
public static void main(String[] args) {
	List<Integer> al = Arrays.asList(34, 100, 56, 8, 10008888, 758, 333);
	
	al.stream().filter(i -> i>=100).forEach(System.out::println);
}
}
