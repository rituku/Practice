package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class synchronizedArrayList {

	public static void main(String[] args) {
		List<String> synchronizedlist = Collections.synchronizedList(new ArrayList<String>());
		synchronizedlist.add("ritu");
		synchronizedlist.add("somit");
		synchronizedlist.add("ashma");
		
		synchronized (synchronizedlist) {
		
			Iterator<String> it = synchronizedlist.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
	}
}
