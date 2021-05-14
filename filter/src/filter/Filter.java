package filter;

public class Filter {

	public static void main(String[] args) {
		
		  int arr[] = {100, 100, 9, 8, 200};
		  int fbig = arr[0];
		  int small = arr[0];
		  for (int i = 0; i < arr.length; i++) {
			 
			if(arr[i]>fbig) {
				fbig = arr[i];
			}
			if(arr[i]<small) {
				small = arr[i];
			}
		 }
System.out.println(fbig+" "+small);
	}
}
