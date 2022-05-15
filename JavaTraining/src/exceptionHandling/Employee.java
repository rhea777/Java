package exceptionHandling;

public class Employee 
{
	private String firstName;
	private String lastName;
	private String ssn;
	public Employee()
	{
		
	}
	public Employee(String firstName, String lastName, String ssn) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{	
		this.lastName = lastName;
	}
	public String getSsn() 
	{
		return ssn;
	}
	public void setSsn(String ssn) 
	{
		this.ssn = ssn;
	}
	public String validateName(String firstName, String lastName)
	{
		if(firstName==null||lastName==null)
		{
			try
			{
				throw new NullPointerException("Entry Missing");
			}
			catch(NullPointerException ex)
			{
				return ex.getMessage();
			}
		}
		else if(firstName.length()==0||lastName.length()==0)
		{
			try
			{
				throw new StringIndexOutOfBoundsException("Index out of bound");
			}
			catch(StringIndexOutOfBoundsException ex)
			{
				return ex.getMessage();
			}
		}
		else if(Character.isDigit(firstName.charAt(0))||Character.isDigit(lastName.charAt(0)))
		{
			try
			{
				throw new IllegalArgumentException("First Character is invalid");
			}
			catch(IllegalArgumentException ex)
			{
				return ex.getMessage();
			}
		}
		else
		{
			return "Valid String";
		}
	}
	public String validateSsn(String ssn)
	{
		if(Character.isDigit(ssn.charAt(0)) && Character.isDigit(ssn.charAt(ssn.length()-1)))
		{
			return "Valid String";
		}
		else
		{
			return "Invalid String";
		}
	}
}
