package inheritance;

public class Manager extends Employee
{
    private double bonus;
    
    public Manager()
    {
    	bonus=5000.0;
    	System.out.println("Manager Constructor");
    }
    public Manager(double bonus)
    {
     super(102,"Mahesh",70000.0);
     this.bonus=bonus;
     System.out.println("Manager Parameterized");
    }
    public Manager(int empid, String name, double salary, double bonus)
    {
    	super(empid,name,salary);
    	this.bonus=bonus;
    }
    
    public void dispBonus()
    {
    	System.out.println("BONUS: "+bonus);
    }
}
