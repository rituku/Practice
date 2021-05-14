package Emp;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class Employ{
	int id;
	String name;
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
/*
 * class Byid implements Comparator{
 * 
 * @Override public int compare(Object o1, Object o2) { Employ e1 = (Employ)o1;
 * Employ e2 = (Employ)o2; return (e1.id-e2.id); } }
 */

class ByName implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employ e1 = (Employ) o1;
		Employ e2 = (Employ) o2;
		return e1.name.compareTo(e2.name);
	}
	
}
public class Emp {
	public static void main(String[] args) {
		/*
		 * ByName bn = new ByName(); TreeSet t = new TreeSet(bn); t.add(new Employ(101,
		 * "ritu"));
		 */
		HashMap<Integer, Employ> mp = new HashMap<>();
		mp.put(1, new Employ(101, "ritu"));	
		mp.put(4, new Employ(404, "asama"));
		mp.put(2, new Employ(202, "rani"));
		mp.put(3, new Employ(303, "soma"));
		
		for(Map.Entry<Integer, Employ> m: mp.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println();
		for(Map.Entry<Integer, Employ> m: mp.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
