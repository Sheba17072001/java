package Oops; 

interface bank
{
	public void deposit();
	public void withdraw();
	public void balance();
	
	
}
interface creditcard
{
	public void creditcarddetails();
}
class SBI implements bank,creditcard
{

	@Override
	public void deposit() 
	{
		System.out.println("SBI Deposit");
	}	

	@Override
	public void withdraw() 
	{
		
		System.out.println("SBI Withdraw");

	}

	@Override
	public void balance() 
	{
	
		System.out.println("SBI Balance");
	}

	@Override
	public void creditcarddetails() {
		// TODO Auto-generated method stub
		System.out.println("SBI Creditcard");
	}

	}
	

class Federal implements bank,creditcard
{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
	System.out.println("Federal Deposit");	
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Federal Withdraw");
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("Federal Balance");
	}

	@Override
	public void creditcarddetails() {
		// TODO Auto-generated method stub
		System.out.println("Federal crerditcard");
	}
	
}
	
	
public class Interfacepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SBI ob=new SBI();
    ob.deposit();
    ob.withdraw();
    ob.balance();
    ob.creditcarddetails();
    
    Federal fb=new Federal();
    fb.deposit();
    fb.withdraw();
    fb.balance();
    fb.creditcarddetails();
	}

}


