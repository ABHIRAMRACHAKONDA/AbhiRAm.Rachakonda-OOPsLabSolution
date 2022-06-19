package oopslabassignment;

import java.util.Random;

public class Employee {

	public Employee(String firstName, String lastName, String department) {
	
		String company = "XYZ";
		String email = firstName.toLowerCase()+lastName.toLowerCase()+"@"+department.toLowerCase()+"."+company+".com";
		System.out.println("Dear "+firstName+" your generated credentials are as follows");
		System.out.println("Email     --->"+" "+email);
		System.out.println(generatePassword(8));


	}

	static char[] generatePassword(int len)
    {
        System.out.print("Password  --->"+" ");
 
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
                String symbols = "!@#$%^&*_=+-/.?<>)";
 
 
        String values = Capital_chars + Small_chars +
                        numbers + symbols;
 

        Random rndm_method = new Random();
 
        char[] password = new char[len];
 
        for (int i = 0; i < len; i++)
        {

            password[i] =
              values.charAt(rndm_method.nextInt(values.length()));
 
        }
        return password;
    }
}
