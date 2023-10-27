package files;
import java.util.*;
import files.*;
public class main extends Bank{



public static void main (String args[]){
	Bank bk=new Bank();
	new main().init();
		
	
	
	}
	
	void init(){
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
	while(flag){		
	
		System.out.println("*******************************************************");
		System.out.println("Welcome to Bank of Zoho");
		System.out.println("Enter 1 for New Registration");
		System.out.println("Enter 2 the Account ");
		System.out.println("Enter 3 for Exit");	
		System.out.println("*******************************************************");
		int input=sc.nextInt();
	switch(input){
	case 1:
		Random rn=new Random();
		int randomValue=rn.nextInt(2000);
		System.out.println();
		System.out.println("*******************************************************");
		System.out.println("Welcome to Customer Registration");
		System.out.println("Enter the Account type :   \"saving\" , \"current\"");
		String accountType=sc.next();
		try{
		if(!checkAccountType(accountType)){
			throw new Exception ("Invalid Account Type");
	
		}}
		catch(Exception e){
				System.out.println(e);
				break;
				}
		System.out.println("Enter Account Holder Name:");
		String name=sc.next();	
		try{
		if(!checkName(name)){
			throw new Exception ("Invalid name");
	
		}}
		catch(Exception e){
				System.out.println(e);
				break;
				}
		System.out.println("Enter the  Phone Number:");	
		long phno=sc.nextLong();
		try{
		if(!checkPhoneNumber(phno)){
			throw new Exception ("Invalid Phone Number");
	
		}}
		catch(Exception e){
				System.out.println(e);
				break;
				}
		System.out.println("Enter the amount to be deposit: ");
		int deposit;	
		try{
		deposit=sc.nextInt();
		}
		catch(NumberFormatException e){
		throw new NumberFormatException("Invalid number");
		}
		catch(Exception e){
				System.out.println(e);
				break;
				}	
		int accountNo=Integer.parseInt(String.valueOf(2023)+String.valueOf(randomValue%1000+1000));
		
		
		Costumer current=new Costumer(name,accountNo,deposit,accountType,phno);
		accountDetails.put(accountNo,current);
		System.out.println(accountType+" account Created SuccesFully ,Your Account Number is "+" "+accountNo);	
		System.out.println("*******************************************************");
		System.out.println();
		break;

	case 2:
		System.out.println();
		System.out.println();
		System.out.println("*******************************************************");
		System.out.println("Enter the Account Number");
		int id=sc.nextInt();
		if(accountDetails.get(id).getAccountType().equals("saving")){
		
		Saving sv=new Saving(id);
		}
		else{
		Current currentAmount=new Current(id);
		}
		System.out.println("*******************************************************");
		break;
		
				
	
	case 3:
	flag=false;
	break;
	
	
}

}	
	
}

}