package Exam;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	        System.out.println("Odd numbers:");
	        printOddNumbers(numbers);

	        System.out.println("\nEven numbers:");
	        printEvenNumbers(numbers);
	    }

	    public static void printOddNumbers(int[] numbers) {
	        for (int number : numbers) {
	            if (number % 2 != 0) {
	                System.out.print(number + " ");
	            }
	        }
	    }

	    public static void printEvenNumbers(int[] numbers) {
	        for (int number : numbers) {
	            if (number % 2 == 0) {
	                System.out.print(number + " ");
	            }
	        }
	    }
	}


