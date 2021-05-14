package array;

public class subsequencewithoutrecursion {
	static String[] subseq(String s) {
		
		if(s.length() == 0) {
			String str[] = {""};
			return str;
		}
	
     String[] smallArray = subseq(s.substring(1));
	 String arr[] = new String[2*smallArray.length];
	 
	 int k = 0;
	 for (int i = 0; i < smallArray.length; i++) {
		arr[k] = smallArray[i];
		k++;
	 }
	 
	 for (int i = 0; i < smallArray.length; i++) {
		arr[k] = s.charAt(0) + smallArray[i];
		k++;
	 }
	 return arr;
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3};
		subseq(arr.toString());
	}
}
