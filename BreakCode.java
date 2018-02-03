package homework_2;

import java.util.ArrayList;
import java.util.List;

public class BreakCode
{
    public static void main(String[] args)
    {
        
        /**
         *  -8 = (
         *  -4 = , 
         *  -7 = )
         */
        
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> blist = new ArrayList<Integer>();
        
        String str = "1(2,3)5(3,2)";
        int answer = 11;
        int x = 0;
        while (x < str.length())
        {
            int y = (str.charAt(x) - '0');
            list.add(y);
            x++;
        }
        
        for (int i = 0; i < list.size() -1 ; i++)
        {
            
            if (list.get(i) == - 8)
            {
                int a = list.get((i+1));
                blist.add(a);
                list.remove("-8");
            }
            
            if (list.get(i) == -4)
            {
                int b = list.get(i+1);
                blist.add(b);
                list.remove("-4");
            }
            if (list.get(i) == -7)
            {
                int c = list.get(i-1);
                blist.add(c);
                list.remove("-7");
            }
            
        }
        list.remove("-8");
        System.out.println("0: " + list.get(0) + " 1: " + list.get(1));
        answer = answer - (list.get(0) + list.get(1));
        System.out.println("Answer: " + answer);
        for (int b : list)
        {
            if (b == -8)
            {
                System.out.print("(");
            }
            else if (b == -4)
            {
                System.out.print(",");
            }
            else if (b == -7)
            {
                System.out.print(")");
            }
            
            else
            {
                System.out.print(b);
        
            }
            
        }
        
        System.out.println("\n");
        for (int i = 0; i < blist.size(); i++)
        {
            System.out.println(i + ":" + blist.get(i));
            
        }
        
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) < 0)
            {
                list.remove(list.get(i));
            }
        }
        
        for (int y : list)
        {
            System.out.println("list: " + y);
        }
    
      
    }
}
