package com.lab;

import java.util.Scanner;

import com.lab.modules.Employee;
import com.lab.service.CredentialService;

public class Driver {

	public static void main(String[] args) {

		Employee employee = new Employee("Abhi", "Ram");
		System.out.println(
				"Please enter the department:\n" + "1.Technical \n" + "2.Admin \n" + "3.Human Resource \n" + "4.Legal");

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String department;
		switch (input) {
		case 1:
			department = "tech";
			break;
		case 2:
			department = "adm";
			break;
		case 3:
			department = "hr";
			break;
		case 4:
			department = "legal";
			break;
		default:
			throw new IllegalArgumentException("Wrong Input " + input);

		}
		CredentialService cs = new CredentialService();
		String email = cs.generateEmailAddress(employee, department);
		String password = cs.generatePassword();
		cs.showCredentials(employee.getFirstName(), password, email);
	}
}
