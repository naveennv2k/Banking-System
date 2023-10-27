package files;
public class Costumer{

	private String name;
	private int accountNo;
	private int balance;
	private String accountType;
	private long phno;
	private int chequeBook;
	public Costumer(String name,int accountNo,int balance,String accountType,long phno){
		this.name=name;
		this.accountNo=accountNo;
		this.balance=balance;
		this.accountType=accountType;
		this.phno=phno;
	
	}
	public String getName(){
	return this.name;
	}
	public int getAccountNo(){
	return this.accountNo;
	}
	public long getPhno(){
	return this.phno;
	}

	public int getBalance(){
	return this.balance;
	}
	public void setBalance(int balance){
	 this.balance=balance;
	}
	public String getAccountType(){
	return this.accountType;
	}
	public int getChequeBook(){
	return this.chequeBook;
	}
	public void setChequeBook(){
	 this.chequeBook+=25;
	}
	

}