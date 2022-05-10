package assignment;

import java.util.ArrayList;
import java.util.List;

public class JoinList 
{
	public static void main(String[] args)
    {
        
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
      
        
       
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
      
        
        List<Integer> concatenated_list
            = new ArrayList<Integer>();
  
      
        concatenated_list.addAll(list1);
        concatenated_list.addAll(list2);
  
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("Concatenated list: "
                           + concatenated_list);
    }
}
