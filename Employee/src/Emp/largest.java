package Emp;

public class largest {

	public static void main(String[] args) {
		int a[]= {2, 4, 4, 4, 6, 6};
		
		int fbig = 0;
		int sbig=0;
		for (int i = 0; i < a.length; i++) {
			if(fbig < a[i]) {
				sbig = fbig;
				fbig = a[i];
			}
			if(sbig < a[i] && fbig > a[i])
			{
				sbig = a[i];
			}	}
		System.out.println(sbig);
	}
}
