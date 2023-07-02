package Classroom;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner input = new Scanner(System.in);
	        System.out.print("Enter the number of terms to generate: ");
	        int n = input.nextInt();
	        int a = 0, b = 1;
	        System.out.print(a + " " + b + " ");
	        for (int i = 3; i <= n; i++) {
	            int c = a + b;
	            System.out.print(c + " ");
	            a = b;
	            b = c;
	        }

	}

}
