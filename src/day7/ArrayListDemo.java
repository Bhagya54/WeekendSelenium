package day7;

import java.util.ArrayList;

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
 * 
 * 
 */
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList();
		System.out.println(list);
		list.add(12);
		list.add(23);
		list.add(1, 89);
		list.add(45);
		list.add(12);
		System.out.println(list);
		System.out.println("Size of an arraylist: " + list.size());
		int sizeArrayList = list.size();
		for(int i=0;i<=sizeArrayList-1;i++) {
		System.out.println(list.get(i));
		}
		
		list.set(1,67);
		System.out.println(list);
		
		//list.remove(2);
	
		System.out.println(list);
		System.out.println(list.indexOf(34));
		
		/*Assignment:
		 *AL2 -- new array list
		 *AL2-- [56,68,90] 
		 * 
		 * 
		 */
		
	}

}
