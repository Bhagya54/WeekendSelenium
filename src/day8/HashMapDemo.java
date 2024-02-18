package day8;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	/*HashMap is a class
	 * Hashing technique
	 * implements Map Interface
	 * used for storing multiple values
	 * 
	 * Terms:
	 * a key and a value together -- Entity/pair/bucket
	 * multiple entries together we call as "Entry Set"
	 * 
	 * Rules:
	 * Duplicate keys not allowed, updation of value happens
	 * Duplicate values are allowed
	 * 
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "abc");
		map.put(3, "xyz");
		map.put(2, "bhagya");
		map.put(0, "selenium");
		map.put(1, "java");
		map.put(4, "xyz");
		map.putIfAbsent(7, "qwe");
		/*
		 * map.put(null, "bharath"); map.put(null, "rajesh"); map.put(5, null);
		 * map.put(7, null);
		 */
		System.out.println(map);
		System.out.println(map.entrySet());
		
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("xyz"));
		System.out.println(map.get(2));
		Set<Integer> keyEntries = map.keySet();
		System.out.println(keyEntries);
		System.out.println(map.values());
		
		for(Entry<Integer, String> m:map.entrySet())
		{
			System.out.println(m.getKey()+ " ---- > " + m.getValue());
			
		}
		
		
		
		
	}

}
