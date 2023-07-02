package Oops;

class Animal2
{
	public void animaldetails2()
	{
		System.out.println("animaldetails2");
	}
}
class Dog2 extends Animal2
{
	public void dogdetails2()
	{
		System.out.println("dogdetails");
	}
}
class Tiger extends Animal2
{
   public void tigerdetails2()
   {
	   System.out.println("tigerdetails");
   }
   }
public class HierarchicalInheritance {

	

	public static void main(String[] args) {
		 Dog2 ob=new Dog2();
		 ob.animaldetails2();
		 ob.dogdetails2();
		 Tiger t=new Tiger();
		 t.animaldetails2();
		 t.tigerdetails2();
	}
}