package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class practicetest {

	static class Employ{
		public int id;
		public String name;
		public Employ(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		@Override
		public String toString() {
			return "Employ [id=" + id + ", name=" + name + "]";
		}
	}
	
	public static void main(String[] args) {
		Map<Integer, Employ> mp = new HashMap<>();
		mp.put(234, new Employ(89, "samisha"));
		mp.put(65, new Employ(76, "same"));
		mp.put(9887, new Employ(22, "rut"));
		mp.put(0, new Employ(11, "oass"));
		
		for (Map.Entry<Integer, Employ> mt : mp.entrySet()) {
			if(mt.getValue().name.equalsIgnoreCase(mt.getValue().name)) {
				
			}
		}
		
		List<Map.Entry<Integer, Employ>> m = new ArrayList<Map.Entry<Integer, Employ>>(mp.entrySet());
		Collections.sort(m, new Comparator<Map.Entry<Integer, Employ>>() {
			@Override
			public int compare(Map.Entry<Integer, Employ> o1, Map.Entry<Integer, Employ> o2) {
				//return (o1.getValue().id - o2.getValue().id);
				return (o1.getValue().name.compareTo(o2.getValue().name));
			}
		});
		
		System.out.println(m);
		
	}
	
}
