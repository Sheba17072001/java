package Constructor;

import java.util.Scanner;

public class Sumofintegerss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("enter a number");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      Sumofintegerss s=new Sumofintegerss();
      int sum=s.sumofintegerss(n);
      System.out.println("sumof integerss"+sum);
      
	}
   public int sumofintegerss(int n)
   {
	   int r,s=0;
	   while(n>0)
	   {
		   r=n%10;
		   s=s+r;
		   n=n/10;
	   }
	   return s;
   }
}
