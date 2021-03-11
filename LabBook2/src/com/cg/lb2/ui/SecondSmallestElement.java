package com.cg.lb2.ui;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestElement {
	static int secondSmallest(int []arr,int n) {
		Arrays.sort(arr);
		int result=arr[0];
		if(n==1) {
			return result;
		}
		for(int i=n-1;i>=0;i--) {
			if(arr[i]==arr[i-1]) {
				continue;
			}else {
				result=arr[i-1];
				break;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(secondSmallest(arr,n));
		sc.close();
	}

}