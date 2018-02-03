package homework_2;

import java.util.*;


public class BaseNumbers
{
    static List<String> list = new ArrayList<String>();

    public static void main(String[] args)
    {
        List<String> printList = generateAllStrings(2, 8);

        for (String x : printList)
        {
            System.out.print(x + ", ");
        }

    }
    
    public static List<String> generateAllStrings(int length, int base) 
    { 
        List<String> nope = new ArrayList<String>();
        
        if ((length <= 0) || (base < 2))
        {
            nope.add("Not able to calculate with the given input.");
            return nope;
        }
        
        else 
        {
            list = generateAllStringsHelper(length, base);
            return list;
        }
       
    }
    
    public static List<String> generateAllStringsHelper(int length, int base)
    {
        
        
        if (length < 1)
        {
            return list;
        }
        
        for (int i = (base - 1); i < base; i++ )
        {
            list.add(String.valueOf(i));

        }
            return generateAllStringsHelper((length - 1), (base - 1));
    }


}
