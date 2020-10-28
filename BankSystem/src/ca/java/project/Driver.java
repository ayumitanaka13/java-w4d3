package ca.java.project;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	public static void printInformation(User u) {
		System.out.println(u.toString());
		System.out.println();
		System.out.println("The Bank Accounts List of "
				+ u.getFirstName() + " " + u.getLastName());
		System.out.println();
		
		for (BankAccount b : u.getBankAccounts()) {
			System.out.println(b.toString());
		}
	}
	
	public static User checkPostalCode(ArrayList<User> users, String postalCode) {
		for (User u : users) {
			if(u.getPostalCode().equalsIgnoreCase(postalCode)) {
				return u;
			}
		}
		return null;
	}
	
	public static int printInstruction() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the correct number :");
		System.out.println("1. deposit, 2. withdraw");
		return input.nextInt();
	}

	// main method
	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<User>();
		Scanner input = new Scanner(System.in);
		
		//Create BankAccount Objects
		BankAccount b1 = new BankAccount(1000, 1993, 12);
		BankAccount b2 = new BankAccount(600.5, 2015, 3);
		BankAccount b3 = new BankAccount(-100, 1830, 0);
		//Create User Object
		User u1 = new User("Ayumi", "Tanaka", "ABC 123", "123-456-789");
		//Populate the list of BankAccounts
		u1.addBankAccount(b1);
		u1.addBankAccount(b2);
		u1.addBankAccount(b3);
		
		users.add(u1);
		System.out.println("Please enter your postal code in the format of AAA AAA :");
		String pCode = input.nextLine();
		User returnedUser = checkPostalCode(users, pCode);
		
		if (returnedUser != null) {
			printInformation(returnedUser);
			System.out.println();
			int numChoosen = printInstruction();
		} else {
			System.out.println("There is no user with this postal code");
		}	
	}
	
}

