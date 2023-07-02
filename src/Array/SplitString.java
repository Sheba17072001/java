package Array;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String s3 = "selenium webdriver is used for webapplication testing";
	        
	        String[] words = s3.split(" ");
	        
	        for (String word : words) {
	            System.out.println(word);
	            if (word.equals("webapplication")) {
	                System.out.println("Execution stopped at the word \"webapplication\".");
	                break;
	            }
	        }
	}

}
