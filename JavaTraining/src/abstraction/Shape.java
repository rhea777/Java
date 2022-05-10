package abstraction;

public abstract class Shape 
{
  public void shapeType()  //non-abstract method
  {
	  System.out.println("This is a shape...");
  }
  public abstract void area(); // abstract method
}
