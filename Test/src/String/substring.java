package String;

public class substring {
	static void findsubstring(String s, String substring) {
		char ch[] = s.toCharArray();
		char ch1[] = substring.toCharArray();
		int count = 0;
		int k = 0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] == ch1[0]) {
				k = 0;
				while(k < ch1.length) {
					if(ch[k+i] != ch1[k]) {
						break;
					}
					k++;
				}
			}
			if(k > ch1.length-1) {
				count++;
			}
		}
		
		System.out.println(count +" count ");
		
	}

	public static void main(String[] args) {
		String s= "Rammat";
		String substring = "ma";
		findsubstring(s, substring);
	}
}
