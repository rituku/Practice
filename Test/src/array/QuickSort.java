package array;

public class QuickSort {
	static int partition(int a[], int l, int h) {
		
		int pivot = a[h];
		int low = l-1;
		//int i = 0;
		for (int i = l; i <= h-1; i++) {
			if(a[i] < pivot) {
				low++;
				swap(a, low, i);
			}
		}
		swap(a, low+1,h);
		return low+1;
	}
	static void swap(int a[], int c, int b) {
		
		int temp = a[c];
		a[c] = a[b];
		a[b] = temp;
	}
	static void quicksort(int a[], int l, int h) {
		if(l<h) {
			int pi = partition(a, l, h);
			quicksort(a, l, pi-1);
			quicksort(a, pi+1, h);
		}	
	}
	
	static void print(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int a[] = {2,4,-33, 999,11,3,6,4};
		quicksort(a, 0, a.length-1);
		print(a);
		
	}
}
