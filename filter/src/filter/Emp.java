package filter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Emp {
	public String Name;
	public int id;
	

	public Emp(String name, int id) {
		super();
		Name = name;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Emp [Name=" + Name + ", id=" + id + "]";
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public static void main(String[] args) {
		ArrayList<Emp> emp = new ArrayList<>();
		emp.add(new Emp("hhh", 88));
		emp.add(new Emp("sss", 23));
		emp.add(new Emp("uyy", 98));
		emp.add(new Emp("ljhj", 56));
		Iterator it = emp.iterator();
		while(it.hasNext()) {
			Emp t = (Emp)it.next();
			
			if(t.getId() > 30) {
				//Collections.sort(t.getId());
				System.out.println(t.getName()+" "+t.getId());
			}
		}
		
	}
}
