package com.cg.lb5.ui;

import java.util.Scanner;

import com.cg.lb5.exception.UserDefinedException;

public class ValidAge {
	static void ageCheck(int age)throws UserDefinedException{
		if(age<=15) {
			throw new UserDefinedException("Age is not valid!");
		}else {
			System.out.println("Age is valid!");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		try {
			ageCheck(age);
		}catch(Exception e) {
			System.out.println("Exception occured:"+e);
		}finally {
			System.out.println("Program Successfully Executed.");
		}

	}

}