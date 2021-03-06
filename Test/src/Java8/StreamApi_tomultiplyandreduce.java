package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamApi_tomultiplyandreduce {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 3, 5, 2);
		
		Function<Integer, Integer> f = new Function<Integer, Integer>(){
			public Integer apply(Integer i) {
				return i*2;
			}
		};
		
		BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
			public Integer apply(Integer i, Integer j) {
				return i+j;
			}
		};
		
		Stream s = values.stream();
		Stream s1 = s.map(f);
		Integer result = (Integer)s1.reduce(0, b);
		System.out.println(result);
		
		System.out.println(values.stream().count());
		System.out.println(values.stream().map(i -> i*2).reduce(0, (a,e) -> a+e));
		System.out.println(values.stream().mapToInt(i -> i*2).sum());
		
	}

}
