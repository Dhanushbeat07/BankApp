package Bank;

import java.util.Scanner;

class BankAccount{
	
	private String name;
	private int ACno;
	private double ba;
	
	
	public BankAccount(String name, int ACno, double ba){
		this.name = name;
		this.ACno = ACno;
		this.ba = ba;
		
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			System.out.println("Successfully deposited of Rs : "+ amount);
		}
		
		else {
				System.out.println("Invalid amount");
			}
		}
		
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=ba) {
			ba -= amount;
			System.out.println("Successfully withdrawn the amt of Rs : "+ amount);
			
		}else {
			System.out.println("Insufficient fund");
		}
	}
	
	public void balance() {
		System.out.println("Current balance : "+ ba);
	}
	
	public void displayaccountdetails() {
		System.out.println("User name :"+ name);
		System.out.println("Account number : "+ ACno);
		System.out.println("Balance : "+ ba);
	}
	
   
}

public class BankApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter Account number : ");
		int ACno = sc.nextInt();
		
		System.out.println("Enter Initial balance : ");
		double ba = sc.nextDouble();
		
		BankAccount userAccount = new BankAccount(name, ACno,ba);
		
		int choice;
		
		do {
			System.out.println("account details");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check balance");
			System.out.println("4. Account details");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice (1-5) : ");
			
			choice = sc.nextInt();
			
			switch(choice) {
			  
			case 1 :
				   System.out.println("Enter amount to deposit: ");
				   double depositamount = sc.nextDouble();
				   userAccount.deposit(depositamount);
				   break;
			case 2 :
				   System.out.println("Enter amount to be withdrawn : ");
				   double withdrawableamt = sc.nextDouble();
				   userAccount.withdraw(withdrawableamt);
				   break;
			case 3 :
				   userAccount.displayaccountdetails();
				   break;
			case 4 : 
				   userAccount.balance();
				   break;
			case 5 :
				   System.out.println("Thanks for using banking app");
				   break;
			case 6 :
				   System.out.println("Invalid number please choose between from 1 to 5");
			}
			
			
		}
		while (choice !=5);
		
		sc.close();
		
	}

}
