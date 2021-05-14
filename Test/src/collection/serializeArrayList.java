package collection;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class serializeArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("ritu");
		al.add("soma");
		
		try {
			FileOutputStream fo = new FileOutputStream("inputfile");
			ObjectOutputStream ob = new ObjectOutputStream(fo);
			ob.writeObject(al);
			ob.close();
			fo.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
