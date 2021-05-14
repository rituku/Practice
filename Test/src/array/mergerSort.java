package array;

public class mergerSort {
	static void partition(int a[], int l, int m, int h) {
		int nL = m-l+1;
		int nR = h-m;
		int L[] = new int[nL];
		int R[] = new int[nR];
		
		for(int i = 0; i<nL; i++) {
			L[i] = a[l+i];
		}
		
		for(int j = 0; j<nR; j++) {
			R[j] = a[m+1+j];
		}
		
		int i = 0, j=0;
		int k = l;
		
		while(i < nL && j < nR) {
			if(L[i] < R[j]) {
				a[k] = L[i];
				i++;
				k++;
			}
			else {
				a[k] = R[j];
				k++;
				j++;
			}
		}
		
		while(i < nL) {
			a[k] = L[i];
			i++;
			k++;
		}
		while(j < nR) {
			a[k] = R[j];
			k++;
			j++;
		}	
		
	}
	static void sort(int a[], int l, int h) {
		if(l<h) {
			int m = l+(h-l)/2;
			sort(a, l, m);
			sort(a, m+1, h);
			partition(a, l, m, h);
		}
	}

	static void print(int a[]) {
		for(int t = 0; t<a.length;t++) {
			System.out.print(a[t]+" ");
		}
	}
	
	public static void main(String[] args) {
		int a[] = {4,9,2,7,5,0,1,22};
		sort(a, 0, a.length-1);
		print(a);
	}
}
