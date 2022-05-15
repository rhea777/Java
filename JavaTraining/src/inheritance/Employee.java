package inheritance;

public class Employee 
{
	private int empid;
	private String name;
	private double salary;
	
	public Employee()
	{
		empid=101;
		name="Sachin";
		salary=20000.0;
		System.out.println("Employee Constructor");
		
	}
	public Employee(int empid, String name, double salary)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		System.out.println("Employee Parameterized");
	}
     public void dispEmployee()
     {
    	 System.out.println("EMPID: "+empid+"\nNAME: "+name+"\nSALARY: "+salary);
    	 
     }
}
