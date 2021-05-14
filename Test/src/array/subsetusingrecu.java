package array;

public class subsetusingrecu {
	
	static void subset(int a[], int index, String curr) {
		
		if(index == a.length) {
			
			if(!curr.equals("")) {
			System.out.println("out "+curr);
			
			}
			return;
		}
		
		subset(a, index+1, curr+a[index]);
		subset(a, index+1, curr);
	}
	
	public static void main(String[] args) {
		int arr[] = {2,4,6};
		subset(arr, 0, "");
	}
}
