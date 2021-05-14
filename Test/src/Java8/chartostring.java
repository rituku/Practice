package Java8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class chartostring {
	public static void main(String[] args) {
		
		/*
		 * final Character[] c = {'d', 's', 'q'}; Stream<Character> chararray =
		 * Arrays.stream(c);
		 * 
		 * String string = chararray.map(String::valueOf).collect(Collectors.joining());
		 * 
		 * System.out.println(string);
		 */
		
		/*
		 * final Character[] ch = {'w' ,'e','r'}; Stream<Character> st =
		 * Arrays.stream(ch); String s =
		 * st.map(String::valueOf).collect(Collectors.joining()); System.out.println(s);
		 */
		
		final Character[] c = {'e', 'r', 'w'};
		Stream<Character> st = Arrays.stream(c);
		String s = st.map(String::valueOf).collect(Collectors.joining());
		System.out.println(s);
	}
}
