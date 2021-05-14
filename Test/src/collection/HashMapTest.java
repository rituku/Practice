package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class StudentClass {
	private int id;
	private String name;
	private int salary;
	
	
	public StudentClass(int id, String name, int salary) {
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
		return "StudentClass [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}	
	
	
}

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, StudentClass> map = new HashMap<>();
		map.put("ritu", new StudentClass(88, "ritu", 2000));
		map.put("rani", new StudentClass(82, "rani", 6000));
		map.put("somit", new StudentClass(84, "somit", 20000));
		
		List<Map.Entry<String, StudentClass>> entryset = new ArrayList<Map.Entry<String, StudentClass>>(map.entrySet());
		Collections.sort(entryset, new Comparator<Map.Entry<String, StudentClass>>() {
			public int compare(Map.Entry<String, StudentClass> e1, Map.Entry<String, StudentClass> e2) {
				return e1.getKey().compareTo(e2.getKey());
			}
		});
		
		System.out.println(entryset);
		
	//	map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		/*
		 * Collections.sort(entryset, new Comparable() {
		 * 
		 * public int compareTo() { return } });
		 */
		//map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		//map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(StudentClass::getName))).forEach(System.out::println);
	}

}
