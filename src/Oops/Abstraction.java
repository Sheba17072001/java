package Oops;

abstract class Car3
{
	abstract public void speedlimit();
	public void carengin()
	{
		System.out.println("Car Engine");
	}
}
class Maruti extends Car3
{

	@Override
	public void speedlimit() {
		// TODO Auto-generated method stub
	System.out.println("Maruti Speedlimit");	
	}
	
}
class BMW1 extends Car3
{

	@Override
	public void speedlimit(){
		// TODO Auto-generated method stub
		System.out.println("BMW Speedlimit");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Maruti m=new Maruti();
m.carengin();
m.speedlimit();

BMW1 b=new BMW1();
b.carengin();
b.speedlimit();
	}

}

