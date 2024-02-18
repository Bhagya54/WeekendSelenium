package day8;

import java.util.LinkedList;

public class LinkedListDemo {
/*
 * 
 * Linked List is a class which implements List Interface
 * 
 * Rules:
 * indexing starts from zero
 * allowes duplicate values
 * null values are allowed
 * 
 * 
 */
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(23);
		ll.add(56);
		ll.add(78);
		System.out.println(ll);
		ll.addFirst(56);
		ll.addLast(null);
		System.out.println(ll);
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
	
		ll.remove(2);
		System.out.println(ll);
		
		System.out.println(ll.contains(78));
	

	}

}
