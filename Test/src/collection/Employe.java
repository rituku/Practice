package collection;

import java.util.Comparator;

public class Employe {

	private int id;
	private String name;
	public Employe(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + "]";
	}
	
	public static Comparator<Employe> byName = new Comparator<Employe>() {
		public int compare(Employe e1, Employe e2) {
			return e1.name.compareTo(e2.name);
		}
	};
		
	public static Comparator<Employe> byid = new Comparator<Employe>() {
		public int compare(Employe e1, Employe e2) {
			return e1.id - e2.id;
		}
	};
	
	public static Comparator<Employe> byname = new Comparator<Employe>() {
		public int compare(Employe e1, Employe e2) {
			return e1.name.compareTo(e2.name);
		}
	};
	
	public static Comparator<Employe> byId = new Comparator<Employe>() {
		public int compare(Employe e1, Employe e2) {
			return e1.id - e2.id;
		}
	};
}
