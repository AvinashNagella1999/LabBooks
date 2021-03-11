package com.cg.lb5.ui;

import java.util.Scanner;

import com.cg.lb5.exception.NameCheckException;

public class FirstAndLastNameCheck {
	static void nameCheck(String first,String last) throws NameCheckException {
		if(first.equals("")) {
			throw new NameCheckException("first name is blank!");
		}if(last.equals("")) {
			throw new NameCheckException("Last name is balnk");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name as well as last name: ");
		String first=sc.next();
		String last=sc.next();
		try {
			nameCheck(first,last);
			}
		catch(Exception e) {
			System.out.println("Exception occured: "+e);
		}
		finally {
			System.out.println("Successfully Executed!");
		}
		}
	}