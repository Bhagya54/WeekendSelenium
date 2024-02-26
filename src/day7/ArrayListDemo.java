package day7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
/*ArrayList -- class
 *-- implements List Interface
 *-- Stores multiple value
 *-- similar as arrays but we can have dynamic size
 * int[] a = new int[5]
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
		
		List<Integer> list = new ArrayList();
		System.out.println(list);
		list.add(12);
		list.add(23);
		System.out.println(list);
		list.add(1, 89);
		System.out.println(list);
		list.add(45);
		list.add(12);
		list.add(null);
		list.add(null);
		System.out.println(list);
		System.out.println("Size of an arraylist: " + list.size());
		int sizeArrayList = list.size();
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		
		list.set(1,67);
		System.out.println(list);
		
		list.remove(2);
	
		System.out.println(list);
		System.out.println(list.indexOf(67));
		
		/*
		 * al1: [12, 67, 45, 12, null, null]
		 * al2: [56,68,96]
		 * 
		 * al1:[12, 67, 45, 12, null, null,56,68,96]
		 * for loop
		 */
		
		
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(56);
		al2.add(68);
		al2.add(90);
		list.addAll(al2);
		System.out.println(al2.get(0));
		
		
		for(int i=0;i<al2.size();i++) {
			list.add(al2.get(i));
		}
		System.out.println(list);
		
		
	}

}
