package homework_2;

import java.util.*;


public class SkyesDopeBaseNumbers
{
    static List<String> list = new ArrayList<String>();
    static int base;
    static int length = 3;
    
    public static void main(String[] args)
    {
        listSetup();
        //listDriller();
    }
    
    public static void listSetup()
    {
        while(list.size()<length)
        {
            list.add(String.valueOf(0));
        }
        System.out.println(list);
    }
}
    
//    public static void listDriller()
//    {
//       
//        int drill = Integer.valueOf(list.get(length-1));
//        
//        
//        /*
//       for(int i = 0; i<length; i++)
//       {
//           
//       }
//    }*/
//    }
   
    
//    public static List<String> generateAllStringsHelper(int length, int base)
//    {   
//        if (length < 1)
//        {
//            return list;
//        }
//        
//        
//        length--;
//    }
        
    /*
    public static void incrementer()
    {
        int baseBitch = 0;
        if(baseBitch < base)
        {
            
        }
    }
}*/