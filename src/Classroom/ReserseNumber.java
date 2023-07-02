package Classroom;
import java.util.Scanner;
public class ReserseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();

	        int reversed = 0;
	        while (number != 0) {
	            int digit = number % 10;
	            reversed = reversed * 10 + digit;
	            number /= 10;
	        }

	        System.out.println("Reversed number: " + reversed);
	    }
	
	}


