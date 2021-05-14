package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListComparatorSort {
	
	public static void main(String[] args) {
		ArrayList<Employe> e = new ArrayList<>();
	    e.add(new Employe(234, "Ritu"));
	    e.add(new Employe(432, "Raj"));
	    e.add(new Employe(486, "Som"));
	    
	    Collections.sort(e, Employe.byid);
	    
	    for (Employe e8 : e) {
			System.out.println(e8);
		}
	    
        Collections.sort(e, Employe.byname);
	    
	    for (Employe e8 : e) {
			System.out.println(e8);
		}
	    
   Map<Integer, Employe> map = new HashMap<Integer, Employe>();
	    
	    map.put(676, new Employe(112, "risi"));

     //   map.put(2, new Employee(112, "risi"));
        map.put(1, new Employe(2982, "rsom"));
        map.put(3, new Employe(9897, "sora"));
        map.put(4, new Employe(12, "osara"));
        map.put(5, new Employe(12, "wqqq"));

        List<Map.Entry<Integer, Employe>> entryList = new ArrayList<Map.Entry<Integer, Employe>>(map.entrySet());
		
		/*
		 * Collections.sort(entryList, new Comparator<Map.Entry<Integer, Employe>>() {
		 * 
		 * @Override public int compare(Map.Entry<Integer, Employe> o1,
		 * Map.Entry<Integer, Employe> o2) { return (o1.getValue().id -
		 * o2.getValue().id); } });
		 */
		
        System.out.println(entryList);
	    
	}
	
}
