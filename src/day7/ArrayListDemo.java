package day7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
/*ArrayList -- class
 *-- implements List Interface
 *-- Stores multiple value
 *-- similar as arrays but we can have dynamic size
 * 
 * Operation:
 * CRUD
 * Creation
 * Retrival
 * Update
 * Delete
 * 
 * Rules:
 * Insertion order is maintained
 * Indexing starts from zero
 * Duplicate values are allowed
 * null values are allowed
 * 
 */
	public static void main(String[] args) {
		
		List<Integer> list =new LinkedList();
		System.out.println(list);
		list.add(12);
		list.add(23);
		list.add(1, 89);
		list.add(45);
		list.add(12);
		list.add(null);
		list.add(null);
		System.out.println(list);
		System.out.println("Size of an arraylist: " + list.size());
		int sizeArrayList = list.size();
		for(int i=0;i<sizeArrayList;i++) {
		System.out.println(list.get(i));
		}
		
		list.set(1,67);
		System.out.println(list);
		
		list.remove(2);
	
		System.out.println(list);
		//System.out.println(list.indexOf(34));
		
		/*Assignment:
		 *AL2 -- new array list
		 *AL2-- [56,68,90] 
		 * 
		 * 
		 * 
		 */
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(56);
		al2.add(68);
		al2.add(90);
		for(int i=0;i<al2.size();i++) {
			list.add(al2.get(i));
		}
		System.out.println(list);
		
		
	}

}
