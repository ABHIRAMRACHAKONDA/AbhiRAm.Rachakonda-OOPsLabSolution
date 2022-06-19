package oopslabassignment;
import java.util.*;
public class ITSupportAdministrator {

	public static void main(String[] args) {
		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		String department = null;
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		if(value == 1) {
			department = "Technical";
		}
		if(value == 2) {
			 department = "Admin";
		}
		if(value == 3) {
			 department = "HumanResource";
		}
		if(value == 4) {
			 department = "Legal";
		}
		
		System.out.print("Enter FirstName: ");  
		String firstName= sc.next();     
		System.out.print("Enter LastName: ");  
		String lastName= sc.next();
        System.out.println();
		Employee employee = new Employee(firstName, lastName, department);
		
	}

}
