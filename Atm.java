package codsoft;

import java.util.Scanner;

public class Atm {
	private static Scanner scanner = new Scanner(System.in);
	private static double balance = 1000; //Initial balance of the ATM
	private static boolean authenticate(int pin) {
		return false;
		}
	
	public static void main(String[] args) {
		System.out.println("Welcome to MYBank ATM!");
		System.out.println("Enter your 4-digit PIN:");
		
		// Simulating PIN authentication
		int pin = scanner.nextInt();
		if (!authenticate(pin)) {
			System.out.println("Invalid PIN. Existing...");
			return;
		}
		
		// If authenticated
		int choice;
		do {
			//Display menu
			System.out.println("\nATM Menu:");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				checkBalance();
				break;
			case 2:
				deposit();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				System.out.println("Thank you for using MYBank ATM. Goodbye!");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}

		} while (choice != 4);
	}
	
	// Method to check balance
	private static void checkBalance() {
		System.out.println("Your current balance: $"+ balance);
	}
	
	// Method to deposit money
	private static void deposit() {
		System.out.print ("Enter amount to deposit: $") ;
		double amount = scanner.nextDouble();
		if (amount <= 0) {
			System.out.println("Invalid amount. Deposit failed.");
			} else {
				balance += amount;
				System.out.println("Deposit of $" + amount + " successful.");
				System.out.println("Your new balance: $" + balance);
			}
	}
	
	// Method to withdraw money
	private static void withdraw() {
		System.out.print("Enter amount to withdraw: $");
		double amount = scanner.nextDouble();
		if (amount <= 0 || amount > balance) {
			System.out.println("Invalid amount or insufficient balance. Withdrawal failed.");
		}else {
			balance -= amount;
			System.out.println("Withdrawal of $" + amount + "successful.");
			System.out.println("Your new balance: $" + balance);
			
		}
		
	}

}
