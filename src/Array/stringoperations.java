package Array;

public class stringoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        //1.Conatenation
		String s="Hello";
		String s1="         Welcome";
		String s2="Hello how are you";
		
		System.out.println(s.concat(s1));//hellowelcome
		System.out.println(s+s1);
		System.out.println(1+2+s+4+5); //3HALLO45
		
		//2.equals
		System.out.println(s.equals(s1));//False
		System.out.println(s.equals(s2));//False
		System.out.println(s.equalsIgnoreCase(s2));//true
		
		//3.contains
		System.out.println(s2.contains("how"));//ture
		
		//4.touppercase &tolowercase
		System.out.println(s.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		//5.trim
		System.out.println(s1.trim());
		
		//6.length
		System.out.println(s.length());
		
		//7.startswith
		System.out.println(s2.startsWith("Hello"));
		
		//8.endswith
		System.out.println(s2.endsWith("You"));
		
		//9.substring
		System.out.println(s2.substring(2,6));//hello welcome
		
		
		//10.charAt()
		System.out.println(s.charAt(1));//hello
		
		//11.split
		String[] sr=s2.split("  ");
		for(String v:sr)
		{
			System.out.println(v);
		}
		
		
		
	}

}
