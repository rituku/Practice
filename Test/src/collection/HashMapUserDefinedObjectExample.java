package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapUserDefinedObjectExample {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, Employee> mp = new ConcurrentHashMap<Integer, Employee>();
		List<Employee> ms = new ArrayList<Employee>();
		
		mp.put(1001, new Employee(1001, "Ritu", "Bang"));
	    mp.put(1002, new Employee(1002, "Rani", "Bengaluru"));
	    mp.put(1003, new Employee(1003, "Ritu", "New York"));
	    mp.put(1004, new Employee(1001, "Somit", "Bang"));
	    mp.put(1005, new Employee(1002, "Ritu", "Bengaluru"));
	    mp.put(1006, new Employee(1003, "Sona", "New York"));
	    
	    ms.add(new Employee(1001, "Ritu", "Bang"));
	    ms.add(new Employee(1002, "Rita", "Bihar"));
	    ms.add(new Employee(1003, "Rani", "Vann"));
	    ms.add(new Employee(1004, "Soma", "Teat"));
	    ms.add(new Employee(1005, "Sona", "GGh"));
	    
	    ms.forEach((k)->System.out.println(k));
	    
	   // mp.forEach((k,v)->System.out.println(k +","+ v));
	  
	   // System.out.println(mp);
		/*
		 * for (Map.Entry<Integer, Employee> mt : mp.entrySet()) {
		 * //System.out.println(mt.getKey());
		 * //System.out.println(mt.getValue().getName());
		 * 
		 * //String name= mt.getValue().getName(); for(Map.Entry<Integer, Employee> mt1
		 * : mp.entrySet()) { int id = mt1.getKey(); String name1 =
		 * mt.getValue().getName(); String name2 = mt1.getValue().getName();
		 * 
		 * if(name1.equals(name2)) { mp.remove(id); System.out.println(mp); } } }
		 */
	    
	 //   System.out.println(mp);
	//    mp.forEach((K,V) -> System.out.println(K+","+V));
	}
}

class Employee{
	private Integer id;
    private String name;
    private String city;
    
	public Employee(Integer id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	  @Override 
	  public String toString() { return "Employee [id=" + id + ", name="
	  + name + ", city=" + city + "]"; }
	 
	
}