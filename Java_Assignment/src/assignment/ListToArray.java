package assignment;

import java.util.LinkedList;
import java.util.List;

public class ListToArray 
{
	 public static void main(String[] args)  
	    {  
	         
	         List<String> names = new LinkedList<String>();  
	           
	         names.add("Apple");  
	         names.add("Mango");  
	         names.add("Orange");  
	         names.add("Watermelon");  
	           
	     
	         int len = names.size();  
	         
	         String[] namesArray = new String[ len ];  
	        
	         for (int i = 0; i < len; i++)  
	             namesArray[i] = names.get(i);  
	        
	         System.out.println("After converting List into an Array");  
	         for (int j = 0; j < namesArray.length; j++) {  
	             System.out.println((j+1)+" element of the array is "+namesArray[j]);  
	         }  
	    }   
}
