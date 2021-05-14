package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Practice {
	static ArrayList<Integer> findKthRepetaed(ArrayList<Integer> list, int k){
		HashMap<Integer, Integer> noOfFreq = new HashMap<>();
		for (int j = 0; j < list.size(); j++) {
			if (!noOfFreq.containsKey(list.get(j))) {
				noOfFreq.put(list.get(j), 1);
			}
			else {
				int temp = noOfFreq.get(list.get(j)) + 1;
				noOfFreq.put(list.get(j), temp);
			}
		}
		
		System.out.println(noOfFreq);
		
		HashMap<Integer, ArrayList<Integer>> occ = new HashMap<Integer, ArrayList<Integer>>();
		for (Map.Entry<Integer, Integer> mp: noOfFreq.entrySet()) {
		  if(!occ.containsKey(mp.getValue())) {
			  occ.put(mp.getValue(), new ArrayList<Integer>());
			  occ.get(mp.getValue()).add(mp.getKey());
		  }
		  else {
			  occ.get(mp.getValue()).add(mp.getKey());
		  }
			
		}
		
		System.out.println(occ);
		
		k = occ.size() - k;
		
		for (Map.Entry<Integer,  ArrayList<Integer>> a : occ.entrySet()) {
			
			if(k == 0) {
				return a.getValue();
			}
			k -= 1;
		}
		
			
		return new ArrayList<>();
	}
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(3, 2, 4, 2, 3, 2, 6, 7, 2, 1, 6));
		
		ArrayList<Integer> newArray = findKthRepetaed(array, 2);
		
		for (int i = 0; i < newArray.size(); i++) {
			System.out.println(newArray.get(i));
		}
	}
	
}