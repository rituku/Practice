package array;

public class QuickSort1 {
	static int partition(int a[], int l, int h) {
		
		int pivot = a[h];
		int i = l-1;
		
		for (int j = l; j <= h-1; j++) {
			if(a[j] < pivot) {
				i++;
				swap(a, i, j);
			}
		}
		swap(a, i+1, h);
		return i+1;
	}
	
	static void swap(int ar[], int l, int h) {
		int temp = ar[l];
		ar[l] = ar[h];
		ar[h] = temp;
	}
	
	static void quickSort(int arr[], int low, int high) {
		if(low<high) {
			int p = partition(arr, low, high);
			quickSort(arr, low, p -1);
			quickSort(arr, p+1, high);
		}
	}
	
	public static void main(String[] args) {
		 int[] arr = { 10, 7, 8, 9, 1, 5 };
		 int n = arr.length;
		 
		 quickSort(arr, 0, n-1);
		 for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
