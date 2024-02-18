package day8;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
/*
 * Hash Set class implements Set Interface
 * internally uses the hashing concept.
 * order of insertion is not maintained
 * no indexing concept
 * duplicate values are not allowed
 * null values are allowed
 */
	public static void main(String[] args) {
		
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(45);
		h1.add(78);
		h1.add(90);
		h1.add(90);
		h1.add(null);
		System.out.println(h1);
		
		//Enhanced for loop
		System.out.println("Using Enhanced for loop");
		  for(Integer a:h1){
		  System.out.print(a + " ");
		  }
		  System.out.println();
		  System.out.println("Using Iterator for loop");
		  Iterator<Integer> it = h1.iterator();
		  while(it.hasNext()) {
			  System.out.print(it.next() + " ");
		  }
		  System.out.println();
		h1.remove(78);
		System.out.println(h1);
		
		/*
		 * Assignment
		 * A1: [34,67,78,34,67]
		 * remove the duplicates
		 * 
		 * A1: [34,67,78]
		 * 
		 */
	}

}
