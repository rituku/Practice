package Java8;

import java.awt.geom.FlatteningPathIterator;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserStream {
public static void main(String[] args) {
	List<Emp> emp = Arrays.asList(new Emp("ritu", 76, Arrays.asList("3", "5")),
			                      new Emp("somit", 46, Arrays.asList("2", "4")));
	
//	emp.stream().forEach(em -> System.out.println(em));
	
	Optional<String> spst = emp.stream().map(empl -> empl.getPhoneNumber().stream())
	            .flatMap(stringStream -> stringStream.filter(ph -> ph.equals("5")))
	            .findAny();
	
	spst.ifPresent(pn -> System.out.println(pn));
	
}
}

 class Emp{

	 private String name;
	 private Integer age = 30;
	 private List<String> phoneNumber;
	public Emp(String name, Integer age, List<String> phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
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
	public List<String> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}
	 
	 
	
}