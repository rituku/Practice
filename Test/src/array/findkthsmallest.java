package array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class findkthsmallest {
	public static int findSmallest(List<Integer> lts, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
		queue.addAll(lts.subList(0, k));
		
		for (int i = k; i < lts.size(); i++) {
		  if(lts.get(i) < queue.peek()) {
			  queue.poll();
			  queue.add(lts.get(i));
		  }
		}		
		return queue.peek();
	}

	public static void main(String[] args) {
		List<Integer> lts = Arrays.asList(7, 4, 6, 3, 9, 1);
		int k = 2;
		int out = findSmallest(lts, k);
		System.out.println(out);
	}
}
