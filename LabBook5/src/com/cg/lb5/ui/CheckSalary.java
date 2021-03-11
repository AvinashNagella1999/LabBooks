package com.cg.lb5.ui;

import java.util.Scanner;

import com.cg.lb5.exception.EmployeeException;

class CheckSalary {

	static void salaryCheck(int salary)throws EmployeeException{
		if(salary<3000) {
			throw new EmployeeException("Employee salary is less than 3000.");
		}else {
			System.out.println("Salary is more than 3000.");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary: ");
		int salary=sc.nextInt();
		try {
			salaryCheck(salary);
		}catch(Exception e) {
			System.out.println("Exception occured:  "+e);
		}finally {
			System.out.println("---Successfully executed.---");
		}

	}

}
//public class CheckSalary {
//
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
//
	//}

//}
