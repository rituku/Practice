package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class converttypeusingstreammap {

	public static void main(String[] args) {
		List<String> st = Arrays.asList("ritu", "somit", "mona", "sona");
		st.stream().filter(name -> !name.equals("mona")).forEach(System.out::println);
		st.stream().filter(name -> !name.equals("mona")).map(name -> new User(name)).forEach(System.out::println);
		
		List<User> userList = st.stream().filter(name -> !name.equals("sona")).map(User::new).collect(Collectors.toList());
		
		int sum = userList.stream().mapToInt(User::getAge).sum();
	
		/*
		 * List<User> userList = st.stream().filter(name -> !name.equals("mona"))
		 * .map(User::new) .collect(Collectors.toList());
		 * 
		 * for(User u : userList) { System.out.println(u); }
		 * 
		 * int sum = userList.stream().mapToInt(User::getAge).sum();
		 * System.out.println("Sum is ="+sum);
		 */
	}
}

class User{
	
	private String name;
	private Integer age = 30;
	public User(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
}