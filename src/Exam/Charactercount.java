package Exam;

import java.util.Scanner;


public class Charactercount {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("enter a string");
		  String inputString=scanner.nextLine();
		  int  charactercount= inputString.length();
		  System.out.println("The total number of characters in the string is:"+charactercount);
		  

	}

}
