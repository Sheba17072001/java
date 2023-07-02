package Oops;

class Car
{
	public void accelator()
	{
		System.out.println("accelator");
		
	}
}
class BMW extends Car
{
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public void accelator()
	{
		System.out.println("BMW accelator");
		super.accelator();
}
	
}
public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BMW ob=new BMW();
ob.accelator();

	}

}
