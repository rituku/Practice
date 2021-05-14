package String;

import java.util.ArrayList;
import java.util.Iterator;

public class Permutation {
	static ArrayList<String> array = new ArrayList<>();
	static void findPermutation(String prefix, String input) {
		int length = input.length();
		int k =0;
		
		if(length == 0) {
		//	System.out.println(prefix);
			array.add(prefix);
			return;
		}
		
		for (int i = 0; i < input.length(); i++) {
			findPermutation(prefix+input.charAt(i), input.substring(0,i)+input.substring(i+1, length));
		}
	}
	static void permutation(String input) {
		findPermutation("", input);
		Iterator<String> it = array.iterator();
		for (int i = 0; i<array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
	public static void main(String[] args) {
		String input = "abc";
		permutation(input);
	}
}
