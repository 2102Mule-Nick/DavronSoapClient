package com.revature.service;

import java.util.Scanner;

public class MultiplyNameMain {
	
	public static void main(String[] args) {
		
		ServiceTwo_Service multiplyName = new ServiceTwo_Service();
		
		ServiceTwo multiplyPort = multiplyName.getServiceTwoImplPort();
		
		System.out.println("Enter a name: ");
		
		Scanner scan = new Scanner(System.in);
		
		String name = scan.nextLine();
		
		System.out.println("Output: \n" + multiplyPort.multiplyName(name));
		
	}

}
