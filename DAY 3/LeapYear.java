package conditionalsinjava;

import java.util.*;

public class LeapYear 
{
    public static void main(String args[])
    {
        // Program to check whether a given year is a Leap Year or Not.
        // If year is divisible by 100, then make sure it is also divisible by 400.
        
        int year;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any Year to check Leap Year: ");
        year = s.nextInt();
        
        // Using Nested-If:
/*        if(year%4 == 0)
        {
            if(year%100 == 0)
            {
                if(year%400 == 0)
                    System.out.println("Its a leap Year!");
                else
                    System.out.println("Its not a leap Year!");
            }
            else
                System.out.println("Its a Leap Year");
        }
        else
            System.out.println("Its not a Leap Year");
*/

        
        // Using if-else:
        if((year%4 == 0 && year%100 != 0) || year%400 == 0)
            System.out.println("Its a Leap Year");
        else
            System.out.println("Its not a Leap Year");
    }
}
