

import java.util.*;

public class EvenOddProgram 
{
    public static void main(String args[])
    {
        // Program to check whether the given Number is Odd or Even.
        int number;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number to check Odd/Even: ");
        number = s.nextInt();
        
        // If there are multiple statements to be executed then use "{ }" Curly Braces.
        
        if(number%2 == 0)
            System.out.println(number+" is an Even Number!"); 
        else
            System.out.println(number+" is an Odd Number!");
        
    }
}
