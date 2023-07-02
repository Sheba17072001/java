package Classroom;
import java.util.Scanner;
public class AverageValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        int sum = 0;
	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Enter integer #" + i + ": ");
	            int n = scanner.nextInt();
	            sum += n;
	        }

	        double average = sum / 10.0;
	        System.out.println("Average value: " + average);

	}

}
