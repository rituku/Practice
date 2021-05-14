package sum;

public class Add {
	public static int[] add(int[] arr, int sum) {
		int l = 0;
		int r = arr.length-1;
		
		
		while(l<r) {
			if(arr[l] + arr[r] < sum) {
				l++;
			}
			else if(arr[l] + arr[r] > sum) {
				r--;
			}
			else {
				
			}
			
		}
		
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = {1, 2,5, 4, 7, 3};
		int sum = 7;
		add(arr, sum);
	}
}
