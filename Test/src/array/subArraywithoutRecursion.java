package array;

public class subArraywithoutRecursion {

	public static void main(String args[]){
		subArraywithoutRecursion psm=new subArraywithoutRecursion();
		 int arr[]= {1,2,3, 4};
		 printSubArray(arr);
		 }		 
		 static void printSubArray(int arr[])
		 {		 
		 int n=arr.length;
		 for (int i=0; i <n; i++) //This loop will select start element
		 {
		 for (int j=i; j<n; j++)   //This loop will select end element
		 {
		 for (int k=i; k<=j; k++) //This loop will print element from start to end		 
		 {
		 System.out.print( arr[k]+" "); 
		 }
		 System.out.println();
		 }
		 }
		 }
}
