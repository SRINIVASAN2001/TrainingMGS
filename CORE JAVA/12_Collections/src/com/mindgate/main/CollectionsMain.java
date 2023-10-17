package com.mindgate.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.naming.spi.NamingManager;

public class CollectionsMain {

	public static void main(String[] args) {

		System.out.println("+++++++++++++++++++LIST++++++++++++++++++++++++++");
		System.out.println("1. ArrayList");
		List<String> nameList = new ArrayList<>();
		nameList.add("Aswin");
		nameList.add("Vijay");
		nameList.add("Rajesh");
		nameList.add("Vivek");
		nameList.add("Vivek"); // List will allow us to store duplicates

		System.out.println(nameList);
		System.out.println("The length of the list: " + nameList.size());

		nameList.add("Jaishree");
		nameList.add("Sibi");
		System.out.println(nameList);
		System.out.println("The length of the list: " + nameList.size());

		System.out.println("+++++++++++++++++++SET++++++++++++++++++++++++++");

		System.out.println("2. Hashset");
		Set<String> nameSet1 = new HashSet<>(); // String object will be
												// retrieved based on hashcode
		nameSet1.add("Vijay");
		nameSet1.add("Rajesh");
		nameSet1.add("Aswin");
		nameSet1.add("Vivek");
		nameSet1.add("Vivek");
		System.out.println(nameSet1);
		System.out.println("The length of the Set: " + nameSet1.size());
		System.out.println("Vijay".hashCode());// to get the hashcode of
												// particular object

		Set<Integer> nameSet2 = new HashSet<>(); // integer value itself will be
													// the hashcode for that
													// particular object
		nameSet2.add(3);
		nameSet2.add(2);
		nameSet2.add(1);
		nameSet2.add(3);
		System.out.println(nameSet2);
		System.out.println("The length of the Set: " + nameSet2.size());

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("3. TreeSet");

		Set<String> nameSortedSet = new TreeSet<>(); // Its preserves the
														// ascending order

		nameSortedSet.add("Aswin");
		nameSortedSet.add("Vijay");
		nameSortedSet.add("Rajesh");
		nameSortedSet.add("Sibi");

		System.out.println(nameSortedSet);

		System.out.println("+++++++++++++++++++MAP++++++++++++++++++++++++++");
		System.out.println("4. HashMap");

		Map<Integer, String> userMap = new HashMap<>(); // key should be unique
														// and values can be
														// duplicate
		userMap.put(101, "Srinivasan");
		userMap.put(102, "Aswin");
		userMap.put(103, "Rajesh");
		userMap.put(104, "Vijay");
		userMap.put(101, "Sibi"); // if we try to use same key,it will override
									// the values

		System.out.println(userMap);
		Set<Integer> userKeys = userMap.keySet();
		System.out.println("To display only Keys   : " + userKeys);

		Collection<String> userValues = userMap.values();
		System.out.println("To display only values : " + userValues);

		for (Integer i : userKeys) {
			System.out.println(i + "-->" + userMap.get(i));
		}

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("4. TreeMap");

		Map<Integer, String> productTreeMap = new TreeMap<>();
		productTreeMap.put(1, "Colgate");
		productTreeMap.put(2, "Pepsodant");
		productTreeMap.put(3, "Sensodent");
		productTreeMap.put(4, "Closeup");
		productTreeMap.put(5, "DaburAmla");
		System.out.println(productTreeMap);
	}

}
