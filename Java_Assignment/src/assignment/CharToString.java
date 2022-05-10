package assignment;

public class CharToString 
{
	public static String toString(char[] a)
    {
        
        String string = new String(a);
 
        return string;
    }
 
    
    public static void main(String args[])
    {
 
       
        char s[] = { 'T', 'h', 'i', 's', 'I', 's', 'S',
                     't', 'r', 'i', 'n', 'g'};
 
        
        System.out.println(toString(s));
    }
}
