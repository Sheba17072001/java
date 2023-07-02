package Classroom;
import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner scanner = new Scanner(System.in);

	        int countPositive = 0;
	        int countNegative = 0;
	        int countZero = 0;

	        while (true) {
	            System.out.print("Enter a number (0 to stop): ");
	            int n = scanner.nextInt();

	            if (n == 0) {
	                break;
	            } else if (n > 0) {
	                countPositive++;
	            } else {
	                countNegative++;
	            }
	        }

	        System.out.println("Number of positive numbers: " + countPositive);
	        System.out.println("Number of negative numbers: " + countNegative);
	        System.out.println("Number of zeros: " + countZero);
	}

}
