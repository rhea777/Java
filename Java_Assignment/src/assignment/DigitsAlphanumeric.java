package assignment;

public class DigitsAlphanumeric 
{
	static void splitString(String str)
    {
        StringBuffer alpha = new StringBuffer(),
        num = new StringBuffer(), special = new StringBuffer();
         
        for (int i=0; i<str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i)))
                num.append(str.charAt(i));
           
        }
      
      
        System.out.println(num);
       
    }
     
    
    public static void main(String args[])
    {
        String str = "Hello12good3day45";
        splitString(str);
    }
}
