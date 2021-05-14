package array;

public class moveallzeroleft {

	public static void main(String[] args) {
		
		int arr[] = {8, 2, 0, 1, 0, 8, 0, 7};
		int count = arr.length-1;
		int temp;
		for (int i = arr.length-1; i >= 0; i--) {
			if(arr[i] != 0) {
			temp = arr[i];
			arr[i] = arr[count];
			arr[count] = temp;
			count--;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
