package com.revature.service;

import java.util.Scanner;

public class AddTwoMain {
	
	public static void main(String[] args) {
	
		ServiceOne_Service addImpl = new ServiceOne_Service();
		
		ServiceOne addPort = addImpl.getServiceOneImplPort();
		
		System.out.println("Enter a number:" );
		
		Scanner scan = new Scanner(System.in);
		
		int numOne = Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter a second number: ");
		
		int numTwo = Integer.parseInt(scan.nextLine());
		
		System.out.println("Sum is: " + addPort.addTwoNumbers(numOne, numTwo));
		
		//2nd function
		
		ServiceTwo_Service multiplyName = new ServiceTwo_Service();
		
		ServiceTwo multiplyPort = multiplyName.getServiceTwoImplPort();
		
		System.out.println("Enter a name: ");
		
		String name = scan.nextLine();
		
		System.out.println("Output: \n" + multiplyPort.multiplyName(name));
	}
}
