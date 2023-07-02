package Array;

public class StringSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String input = "Java is a popular programming language";
	        String searchStr = "java language";
	        
	        if (input.toLowerCase().contains(searchStr.toLowerCase())) {
	            System.out.println("The string \"" + searchStr + "\" is present in the input string.");
	        } else {
	            System.out.println("The string \"" + searchStr + "\" is not present in the input string.");
	        }

	}

}
