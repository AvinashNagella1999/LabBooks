package com.cg.lb2.ui;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicates {
	static void Duplicate(int []arr,int n) {
		int arr1[]=new int[n];
		int counter=0;
		HashMap<Integer,Boolean>hm=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(hm.get(arr[i])==null) {
				arr1[i]=arr[i];
				counter++;
			}hm.put(arr[i],true);
		}
		for(int i=0;i<n;i++) {
			if(arr1[i]!=0)
			System.out.print(arr1[i]+"\t");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		int n= sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Non Duplicate Elements are:");
		Duplicate(arr,n);
		sc.close();
	}

}