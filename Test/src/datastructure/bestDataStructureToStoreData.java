package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class bestDataStructureToStoreData {
	public static void main(String[] args)  {
		  
		 //  List<Long> longList = new LinkedList<>();
		   // remove comment from  below line and add comment on above line
		   List<Long> longLis = new ArrayList<Long>(10000000);
		   long maxValue = 10000000;

		   long startTime = System.currentTimeMillis();

		   for (long l = 0; l < maxValue; l++) {
			   longLis.add(l);
		   }

		   long endTime = System.currentTimeMillis();

		   System.out.println(endTime - startTime);
		 }
}
