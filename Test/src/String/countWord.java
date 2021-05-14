package String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class countWord {

	public static void main(String[] args) {
		String s = "this is ritu this ritu";
		String st[] = s.split(" ");
		
		HashMap<String, Integer> mp = new HashMap<>();
		for (int i = 0; i < st.length; i++) {
			if(mp.containsKey(st[i])) {
				mp.put(st[i], mp.get(st[i])+1);
			}
			else {
				mp.put(st[i], 1);
			}
		}
		for (Map.Entry<String, Integer> m : mp.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}
}
