package homework_2;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input a word to see if it is a palindrome:");
        if (isPalindrome(input.nextLine()))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("Nope");
        }
        
        input.close();
    }
    
    public static boolean isPalindrome(String str)
    {
        return helperPalindrome(str, 0, (str.length() -1 ));
    }
    
    private static boolean helperPalindrome(String str, int first, int last)
    {
        str = str.toLowerCase();
        
        if (first >= last)
        {
            return true;
        }
        else
        {
            return (str.charAt(first) == str.charAt(last)) && helperPalindrome(str, (first + 1), (last - 1));
        }
       
    }
}
