package Constructor;

public class Studentpgm {
 
	int studentid;
	String studentname;
	String college="Coet";
	public Studentpgm( int studentid,String,Studentname) {
		this.studentid=studentid;
		this.studentname=studentname;
	}
 public void display()
 {
	 System.out.println("studentid="+studentid);
	 System.out.println("studentname="studentname);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student(101,"Hari");
		//s.studentid=101;
		System.out.println(s.studentid);
		System.out.println(s.studentname);
		s.display();
	

	}

}
