package Java8;

import java.util.Arrays;

@FunctionalInterface
interface FunctionOnAnArray {
	int apply(int k, int[] intArray);
}

public class SumOfArray {

	public static void main(String[] args) {
		 int sum = 0;
		 int array[] = {4, 5,2};
 		 FunctionOnAnArray f = (k, arr) -> Arrays.stream(array)
				    .filter(a -> a <= k)
				    .sum();
 		 
 		 System.out.println(f);
		/*
		 * int sumNo =0;
		 * 
		 * AdditionArray sum = (n, arr) -> {
		 * 
		 * for (int i = 0; i < arr.length; i++) { sumNo += arr[i]; return sumNo; } };
		 * 
		 * 
		 * int sumNumber = 0; // int[] arr = {4, 3}; AdditionArray f =
		 * Arrays.stream(arr) .filter(a -> a <= k) .sum();
		 */

	}

}
