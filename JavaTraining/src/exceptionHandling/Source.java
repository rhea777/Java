package exceptionHandling;

public class Source 
{

	public static void main(String[] args) 
	{
		Employee emp = new Employee("Harry","Styles","1ABCD5");
		System.out.println(emp.validateName(emp.getFirstName(), emp.getLastName()));
		System.out.println(emp.validateSsn(emp.getSsn()));

	}

}
