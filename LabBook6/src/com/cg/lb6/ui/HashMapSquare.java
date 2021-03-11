package com.cg.lb6.ui;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapSquare {
	
	static HashMap squareInMap(int []arr) {
		HashMap<Integer,Integer>map = new HashMap<>();
		for(int i:arr) {
			map.put(i, i*i);
		}
		return map;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter the array element");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(squareInMap(arr));
	}

}