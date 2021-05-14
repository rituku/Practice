package String;

import java.util.HashMap;

public class countChar {

	public static void main(String[] args) {
		String s = "thisisritu";
		char ch[] = s.toCharArray();
		
		HashMap<String, Integer> mp = new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			if(mp.containsKey(ch[i]+"")) {
				mp.put(ch[i]+"", mp.get(ch[i]+"")+1);
			}
			else {
				mp.put(ch[i]+"", 1);
			}
		}
		System.out.println(mp);
	}
}
