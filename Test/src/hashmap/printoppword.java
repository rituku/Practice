package hashmap;

import java.util.HashMap;
import java.util.Map;

public class printoppword {
	public static void main(String[] args) {
		String s = "public static void";
		String st[] = s.split(" ");
		// Map<String, Integer> mt = new HashMap<>();
		System.out.println(st.length);
		for (int i = st.length-1; i >= 0; i--) {
			System.out.print(st[i]+" ");
		}
		
	}
}
