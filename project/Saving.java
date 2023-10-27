package files;
import java.util.*;
import files.*;
public class Saving extends Bank{
	Scanner sc=new Scanner(System.in);
	
	public Saving(int accountNumber){
	Costumer savingCustomer=accountDetails.get(accountNumber);
	
	
	int input;
	boolean flag=true;
	while(flag){
	System.out.println("*******************************************************");
	System.out.println("Welcome to saving account");
	System.out.println("Enter 1 for WithDrawal");
	System.out.println("Enter 2 for Deposit");
	System.out.println("Enter 3 for Account Details");
	System.out.println("Logout");
	System.out.println("*******************************************************");
	input=sc.nextInt();
	switch(input){
	case 1:
		this.withdraw(savingCustomer);
		accountDetails.put(accountNumber,savingCustomer);
		break;	
	
	case 2:
		this.deposit(savingCustomer);
		accountDetails.put(accountNumber,savingCustomer);
		break;
	
	case 3:
	
		this.accountDetails(savingCustomer);
		break;
	case 4:
		flag=false;
		break;
	
	
	
	
	}
	
	}
	
	}
	void withdraw(Costumer saving){
		System.out.println("*******************************************************");
		System.out.println("Enter the Amount is to withdrawn :");	
		int input =sc.nextInt();
		if(saving.getBalance()<input){
		System.out.println("insufficient money");
		return;
		}
		System.out.println("Money is withdrawan");
		System.out.println("Account balance is "+(saving.getBalance()-input));
		saving.setBalance(saving.getBalance()-input);	
	System.out.println("*******************************************************");
	
	
	}
	void deposit(Costumer saving){
		System.out.println("*******************************************************");
		System.out.println("Enter the Amount to be deposit:");	
		int input =sc.nextInt();
		
		System.out.println("Money is deposited successfully");
		System.out.println("Account balance is "+(saving.getBalance()+input));
		saving.setBalance(saving.getBalance()+input+(int)(saving.getBalance()*.07));	

	System.out.println("*******************************************************");
	
	}
	void accountDetails( Costumer saving){
		System.out.println("*******************************************************");
			System.out.println("Account number :"+" "+saving.getAccountNo());				System.out.println("AccountHolder Name :"+" "+saving.getName());
			
			System.out.println("Phone Number :"+" "+saving.getPhno());
			System.out.println("Account Balance :"+" "+saving.getBalance());
			
			
	
	System.out.println("*******************************************************");
	}	
	
	
	
	
	
	
	
	
	
	
}