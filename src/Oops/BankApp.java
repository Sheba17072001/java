package Oops;
import java.util.Scanner;

interface Bank5
{
	public void showdetails(String name);
	public void deposit();
	public void withdraw();
	public void balance();
}

class FederalBank implements Bank5
{
	int accountnumber;
	static  String bankname="Federal";
	
	int balance =20000;
	Scanner sc=new Scanner(System.in);
	
	
	
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Enter deposit amount");	
		int dep=sc.nextInt();
		balance=balance-dep;
		System.out.println("balance"+balance);	
				
	}
	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Enter withdrawl amount");	
		int amt=sc.nextInt();
		balance= balance-amt;
		System.out.println("balance="+balance);
		
	}
	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("balance");	
	}
	@Override
	public void showdetails(String customername) {
		// TODO Auto-generated method stub
		System.out.println("customername="+customername);	
		System.out.println("accountnumber="+123456789);	
		System.out.println("bankname="+bankname);	
		
	}
	
}


public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FederalBank fb=new FederalBank();
fb.showdetails("Vishnu");
fb.withdraw();
fb.deposit();
fb.balance();


}
}
