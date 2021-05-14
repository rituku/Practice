package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class synchronizeMap {
public static void main(String[] args) {
	HashMap<Integer, String> mp = new HashMap<>();
	mp.put(2, "ritu");
	mp.put(4, "somit");
	mp.put(3, "sona");
	Map map = Collections.synchronizedMap(mp);
	Set set = map.entrySet();
	
	synchronized (map) {
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry mt = (Map.Entry)it.next();
			System.out.println(mt.getKey()+" "+mt.getValue());
		}
	}
	
}
}
