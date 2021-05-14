package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;



public class TreeMapSort {

	public static void main(String[] args) {
		// ById byid = new ById();
	    Map<Integer, Student> mp = new TreeMap<Integer, Student>();	
	   
		mp.put(3, new Student(2, "ritu"));
		mp.put(2, new Student(8, "somit"));
		mp.put(8, new Student(6, "ashma"));
		mp.put(5, new Student(9, "asra"));
		
	//	 List<Map.Entry<Integer, Employee>> entryList = new ArrayList<Map.Entry<Integer, Employee>>(map.entrySet());

	//	List<Map.Entry<Integer, Student>> se=new ArrayList<Map.Entry<Integer, Student>>(mp.entrySet());
	//	Collections.sort(se, byid);
		//Collections.sort(se, Student.byId);
		//mp.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		//mp.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Student::getName))).forEach(System.out::println);

	//	mp.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Student::getId))).forEach(System.out::println);
//	mp.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Student::getName))).forEach(System.out::println);
	mp.entrySet().stream().sorted((o1, o2) -> (int)o1.getValue().getId()-o2.getValue().getId()).forEach(System.out::println);
	//mp.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Student::getId))).forEach(System.out::println);
	}

}

class ById implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		return (int)(s1.getId()-s2.getId());
	}
}


class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	/*
	 * public static Comparator<Student> byId = new Comparator<Student>() {
	 * 
	 * @Override public int compare(Student s1, Student s2) { return
	 * (int)s1.id-s2.id; } };
	 */
	

}