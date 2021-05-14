package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Emp{
	private String name;
	private int id;
	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public int hashCode() { 
		int hashCode = 0; 
		return hashCode; }
	 
	  public boolean equals(Object o) {
		   
		    return true;
		}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
	
	
}
public class Remdublonbasofdupobjectkey {
	public static void main(String[] args) {
		Map<Integer, Emp> ehm = new LinkedHashMap<Integer, Emp>();
		ehm.put(1, new Emp("ritu", 5754));
		ehm.put(2, new Emp("Somit", 654));
		ehm.put(3, new Emp("ashma", 987));
		for(Map.Entry<Integer, Emp> entry: ehm.entrySet()) {
			System.out.println(entry.getKey()+ " = "+entry.getValue());
		}
		
		List<Map.Entry<Integer, Emp>> mp = new ArrayList<Map.Entry<Integer,Emp>>(ehm.entrySet());
		
	//	ehm.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Emp::getName))).forEach(System.out::println);
		
		Collections.sort(mp, new Comparator<Map.Entry<Integer, Emp>>() {
			@Override
			public int compare(Map.Entry<Integer, Emp> e1, Map.Entry<Integer, Emp> e2) {
				return e1.getValue().getId() - e2.getValue().getId();
			}
		});
		System.out.println(mp);
		

		/*
		 * Emp dup = new Emp("ritu", 788); ehm.put(4, dup); System.out.println("after");
		 * for(Map.Entry<Integer, Emp> entry: ehm.entrySet()) {
		 * System.out.println(entry.getKey()+ " = "+entry.getValue()); }
		 */
		
	}
	

}
