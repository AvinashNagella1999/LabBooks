package com.cg.lb6.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfEachCharacter {
	
	static void countFrequency(String s) {
		Map<Character,Integer>map=new HashMap<>();
		char c[]=s.toCharArray();
		for(char ch:c) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		for(Map.Entry e:map.entrySet()) {
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s= sc.next();
		countFrequency(s);
	}

}