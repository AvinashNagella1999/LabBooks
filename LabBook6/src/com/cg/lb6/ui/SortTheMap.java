package com.cg.lb6.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortTheMap {
	
	static void sortedMap() {
		Map<Integer,String> map = new HashMap<>();
		map.put(5356, "lambo");
		map.put(6556, "Bugatti");
		map.put(879, "ninja");
		map.put(9823,"fortuner");
		map.put(2387343, "Range Rover");
		System.out.println("Unsorted map: "+map);
		TreeMap<Integer,String>tm=new TreeMap<>(map);
		System.out.println("Sorted map"+tm);
		
		Set<Integer>s=map.keySet();
		System.out.println("Unsorted keys: "+s);
		List<Integer>l=new ArrayList<>(s);
		Collections.sort(l);
		System.out.println("sorted key"+l);
	}
	public static void main(String[] args) {
		sortedMap();
	
	}

}