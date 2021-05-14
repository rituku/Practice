package array;

public class Largestsubarraywithequal0and1 {
	static int findSubArray(int[] arr) {
		int maxsize = -1;
		int sum = 0;
		int startindex = 0;
		int endindex = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum = (arr[i]==0) ? -1 : 1;
		
		for (int j = 0; j < arr.length; j++) {
			if(arr[j] == 0) {
				sum += -1;
			}
			else {
				sum += 1;
			}
	   if (sum == 0 && maxsize < j-i+1) {
		 maxsize = j-i+1;
		 startindex = i;		 
	    }			
	   }
	 }
		endindex = startindex + maxsize - 1;
		if(maxsize == -1) {
			System.out.println("No such subarray");
		}
		else {
			System.out.println(startindex+" to "+endindex);
		}
		return maxsize;
	}

	public static void main(String[] args) {
		int arr[] = {1, 0, 0, 1, 0, 1, 0};
		findSubArray(arr);
	}
}
