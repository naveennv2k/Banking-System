package files;
import files.*;
import java.util.*;
public class Current extends Bank{
	int minimum=1000;
		public Current(int accountNumber){
	Costumer currentCustomer=accountDetails.get(accountNumber);
	
	Scanner sc=new Scanner(System.in);
	int input;
	boolean flag=true;
	while(flag){
	System.out.println("Welcome to current account");
	System.out.println("Enter 1 for cheque book:");
	System.out.println("Enter 2 for deposit money");
	System.out.println("Enter 3 for account details");
	System.out.println("Logout");
	input=sc.nextInt();
	switch(input){
	case 1:	
		System.out.println("*******************************************************");
		System.out.println("press 1 for requesting cheque book:");
		System.out.println("press 2 for money withdrawal by cheque book:");
		System.out.println("*******************************************************");
		int input1=sc.nextInt();
		switch(input1){
		case 1:
		System.out.println("************************");
			if(currentCustomer.getChequeBook()==0){
		currentCustomer.setChequeBook();
		accountDetails.put(accountNumber,currentCustomer);
		System.out.println("ChequeBook is provided");
		}else{
		System.out.println("Chequebook is already provided");
		}
		System.out.println("************************");
		break;
		case 2:
		if(currentCustomer.getChequeBook()>0){
			System.out.println("************************");
			System.out.println("enter the amount to be withdraw:");	
			int amount=sc.nextInt();
			if(currentCustomer.getBalance()>amount){
			currentCustomer.setBalance(currentCustomer.getBalance()-amount);
			System.out.println("transation completed successfully");
			if(currentCustomer.getBalance()<minimum){
				currentCustomer.setBalance((int)(currentCustomer.getBalance()-currentCustomer.getBalance()*.01));
				}
			
			}
			else{
			System.out.println("Insufficient money");
			}	
		}
		else{
		
	          System.out.println("no chequebook is available");
		}
		System.out.println("************************");


	
		
	
		
	
		}
		break;
	case 2:
		this.deposit(currentCustomer);
		accountDetails.put(accountNumber,currentCustomer);
		break;
	
	case 3:
	
		this.accountDetails(currentCustomer);
		break;
		
		
	case 4:
		flag=false;
		break;
	
	
	
	
	}
	
	}

}
void deposit(Costumer saving){
		System.out.println("*******************************************************");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount to be deposit:");	
		int input =sc.nextInt();
		
		System.out.println("Money is deposited successfully");
		System.out.println("Account balance is "+(saving.getBalance()+input));
		saving.setBalance(saving.getBalance()+input);	
	
		System.out.println("*******************************************************");
	
	}
void accountDetails( Costumer current){
			System.out.println("*******************************************************");
			System.out.println("Account number :"+" "+current.getAccountNo());				
			System.out.println("AccountHolder Name :"+" "+current.getName());
			System.out.println("Phone Number :"+" "+current.getPhno());
			System.out.println("Account Balance :"+" "+current.getBalance());
			
			
			System.out.println("*******************************************************");
	
	
	}

}













	