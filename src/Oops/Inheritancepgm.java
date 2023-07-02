package Oops;

class Member
{
	String name;
	int age;
	String phoneno;
	String address;
	int salary;
	
	public void printdetails()
	{
		System.out.println("name="+name);
		System.out.println( "age="+age);
		System.out.println("phoneon="+phoneno);
		System.out.println("address="+address);
		System.out.println( "salary="+salary);
		
	}
}
class Employee1 extends Member
{
	String specialization;
}
class Manger extends Member
{
	String department;
}
public class Inheritancepgm {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee1 emp1=new Employee1();
     emp1.name="arun";
     emp1.age=24;
     emp1.phoneno="9846237740";
     emp1.address="abvc";
     emp1.salary=20000;
     
     System.out.println(emp1.specialization="tester");
     emp1.printdetails();
     
     Manger man=new Manger();
     man.name="Vijay";
     man.age=30;
     man.phoneno="9946302648";
     man.address="hjzx";
     man.salary=60000;
     
     System.out.println(man.department="head");
     man.printdetails();
     }

}
