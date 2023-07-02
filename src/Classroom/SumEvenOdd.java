package Classroom;
import java.util.Scanner;
public class SumEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a set of integers (separated by spaces): ");
	        String input = scanner.nextLine();

	        String[] numbers = input.split(" ");
	        int sumEven = 0, sumOdd = 0;

	        for (String number : numbers) {
	            int n = Integer.parseInt(number);
	            if (n % 2 == 0) {
	                sumEven += n;
	            } else {
	                sumOdd += n;
	            }
	        }

	        System.out.println("Sum of even integers: " + sumEven);
	        System.out.println("Sum of odd integers: " + sumOdd);
	}

}
