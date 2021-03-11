package com.cg.lb2.ui;
 
import java.util.Arrays;
import java.util.Scanner;

public class SortStringUpperLower {
	static String UpperCaseLowerCase(String str[],int n) {
		Arrays.sort(str);
		String result[] = new String[n];
		for(int i=0;i<n;i++) {
			result[i] = str[i];
		}if(n%2==0) {
			int half=n/2;
			for(int i=0;i<half;i++) {
				System.out.println(str[i].toUpperCase());
			}
			for(int i=half;i<n;i++) {
				System.out.println(str[i].toLowerCase());
			}
		}else {
			int half=n/2;
			for(int i=0;i<=half;i++) {
				System.out.println(str[i].toUpperCase());
			}
			for(int i=half+1;i<n;i++) {
				System.out.println(str[i].toLowerCase());
			}
		}
			return Arrays.toString(result);
	}
}