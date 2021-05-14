package removeDub;

public class remove {
public static void remove(String s) {
	
	char ch[] = s.toCharArray();
	String st ="";
	int n = ch.length-1;
	int count=1;
	
	for (int i = 0; i <= n; i++) {
		//count = 1;
		int co =1;
		for (int j = i+1; j <= n; j++) {
			if (ch[i] == ch[j]) {
				count++;
				co++;
				int k = j;
				while (k < n) {
					ch[k] = ch[k+1];
					k++;
				}
				n--;
				j--;
			}
			//j--;
		}
		System.out.println(ch[i]+"---"+co);
		st = st + ch[i];		
	}
	System.out.println(st+" "+count);
	//return ch.toString();
}
	
public static void main(String[] args) {
	remove("aaabbbbcc");
}
}
