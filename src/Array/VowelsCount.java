package Array;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String str = "Hello, Welcome";
	        int vowelCount = 0;
	        
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	                vowelCount++;
	            }
	        }
	        
	        System.out.println("The number of vowels in the string \"" + str + "\" is: " + vowelCount);
	}

}
