package Oops;

class Emp
{
	private String empname;
    private String empdesignation;
	
    public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdesignation() {
		return empdesignation;
	}
	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}
    
	}
	

public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp ob=new Emp();
ob.setEmpname("Arun");
ob.setEmpdesignation("Developer");
System.out.println(ob.getEmpname());
System.out.println(ob.getEmpdesignation());
	}

}
