package array;

public class MissingIntegerWithSum {
	public static int getMissingNo(int[] a, int n) {
		
		int sum = (n*(n+1))/2;
		int elem_sum = 0;
		for (int i = 0; i < a.length; i++) {
			elem_sum += a[i];
			
		}
		
		return sum-elem_sum;
	}

	public static void main(String[] args) {
		 int a[] = {1, 2, 4, 6, 3, 7, 8};
		    int n = a.length + 1;
		    int miss = getMissingNo(a, n);
		     
		    System.out.print(miss);
	}
}
