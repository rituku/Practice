package hashmap;

import java.util.HashMap;
import java.util.Map;

public class FindDublicate {

	public static void main(String[] args) {
	      Map<Character, Integer> mp = new HashMap<>();
	      String s = "indianna";
	      char ch[] = s.toCharArray();
	      
	      for (char c: ch) {
	    	 if(!mp.containsKey(c)) {
	    		 mp.put(c, 1);
	    	 }
	    	 else {
	    		 mp.put(c, mp.get(c)+1);
	    	 }			
		}
	      
	    for (Map.Entry<Character, Integer> m : mp.entrySet()) {
			System.out.println(m.getKey()+" - "+m.getValue());
		}
	    
	    Map<String, Integer> mt = new HashMap<>();
	    String st = "ritu rani is ritu rani";
	    String starray[] = st.split(" ");
	    
	    for (String str: starray) {
			if(!mt.containsKey(str)) {
				mt.put(str, 1);
			}
			else {
				mt.put(str, mt.get(str)+1);
			}
		}
	    
	    for (Map.Entry<String, Integer> ms : mt.entrySet()) {
			System.out.println(ms.getKey()+" - "+ms.getValue());
		}
		
	}
}
