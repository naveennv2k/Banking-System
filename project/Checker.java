package files;
import java.util.*;


public class Checker{
	

	public boolean checkPhoneNumber(long number){
	String nm=String.valueOf(number);
	return nm.length()==10;
	
	
	}
	public boolean checkName(String name){
	for(char i: name.toCharArray()){
	if(!((i>='A' && i<='Z') || (i>='a' && i<='z'))){
		return false;
	
	}
	
	
	}
	return true;
	
	}
	public boolean checkAccountType(String account){
	
	if(account.equals("saving") || account.equals("current")){
	return true;
	
	}
	return false;
	}
	
	




}