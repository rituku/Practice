package collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Employeee{
	public int id;
	public String name;
	public int salary;
	public Employeee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employeee [id=" + id + ", name=" + name + ", Salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		System.out.println("in hashcode");
		return this.getId();
	}
	/*
	 * @Override public boolean equals(Object obj) { Employeee e1=null; if(obj
	 * instanceof Employeee) { e1 = (Employeee) obj; }
	 * 
	 * if(this.getName().equals(e1.getName())) { return true; } else { return false;
	 * } }
	 */
	
	public boolean equals(Object obj) {
		Employeee e1 = null;
		if(obj instanceof Employeee) {
			e1 = (Employeee)obj;
		}
		if(this.getName().equals(e1.getName())) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class RemoveDublicateFromHashMapObject {
	public static void main(String[] args) {
		HashMap<Employeee, String> hashMap = new HashMap<Employeee, String>();
		hashMap.put(new Employeee(1,"Jai",50000), "JAI");
		hashMap.put(new Employeee(2,"Mahesh",80000), "MAHSESH");
		hashMap.put(new Employeee(3,"Vishal",60000), "VISHAL");
		hashMap.put(new Employeee(4,"Hemant",64000), "HEMANT");
		hashMap.put(new Employeee(4,"ema",64000), "EMA");
	//	hashMap.put(new Employeee(6,"ema",64800), "EMA");
		System.out.println("HashMap elements:");
		Set<Employeee> keys = hashMap.keySet();
	        for(Employeee p:keys){
	            System.out.println(p+"-"+hashMap.get(p));
	        }
		System.out.println("Add duplicate record:");
		hashMap.put(new Employeee(4,"ema",64900), "EMAR");
		hashMap.put(new Employeee(5,"emay",87776), "EMAY");
		
		Set<Employeee> keyss = hashMap.keySet();
        for(Employeee p:keyss){
            System.out.println(p+"-"+hashMap.get(p));
        }
	System.out.println("Add duplicate record:");
	//hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employeee::getName))).forEach(System.out::println);
		/*
		 * HashMap<Integer, Employeee> mp = new HashMap<>(); mp.put(876, new
		 * Employeee(87, "yuyss", 8776)); mp.put(452, new Employeee(34, "ritu", 7663));
		 * mp.put(111, new Employeee(64, "soma", 4539)); mp.put(222, new Employeee(87,
		 * "somma", 87665));
		 * 
		 * for(Map.Entry<Integer, Employeee> mt : mp.entrySet()) {
		 * System.out.println(mt); }
		 */
	}
	
}
