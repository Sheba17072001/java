package Exam;

public class ReverseString {

	public static void main(String[] args) {

String string ="Dream big";
String resersedstr="";
for(int i=string.length()-1;i>=0;i++)
{
	resersedstr=reversedstr+string.charAt(i);

	
} 
System.out.println("original string:"+string);
System.out.println("Reserse og given string:"+resersedstr);




	}

}
