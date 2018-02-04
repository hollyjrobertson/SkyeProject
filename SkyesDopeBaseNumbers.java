package homework_2;

import java.util.*;


public class SkyesDopeBaseNumbers
{
    static List<String> list = new ArrayList<String>();
    static int base = 4;
    static int length = 3;

    public static void main(String[] args)
    {
        listSetup();
        //listDriller();
        generateAllStringsHelper(length, base);
        
        System.out.println(list);
    }

    public static void listSetup()
    {
        while(list.size()<length)
        {
            list.add(String.valueOf(0));
        }
//        System.out.println(list);
    }

    public static void listDriller()
    {
//
//        int drill = Integer.valueOf(list.get(length-1));
//
//
//        /*
//       for(int i = 0; i<length; i++)
//       {
//
//       }
    }


   public static th < 1)
        {
            return list;
       }List<String> generateAllStringsHelper(int length, int base)
    {
        if (leng

          for(int drill = Integer.valueOf(list.get(length-1)); drill<base; drill++)
          {
            list.set(length - 1, String.valueOf(drill));
            System.out.println(list);
          }
          
          
          return generateAllStringsHelper(length-1, base);
    }

//TEMPORARY
    public static void incrementer()
    {
        int baseBitch = 0;
        if(baseBitch < base)
        {

        }
    }
}
