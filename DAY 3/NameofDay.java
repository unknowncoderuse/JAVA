package conditionalsinjava;

import java.util.*;

public class NameofDay 
{
    public static void main(String args[])
    {
        // Program to display name of a Day based on day Number given by the User.
        /*
            Day 1: Monday
            Day 2: Tuesday
            Day 3: Wednesday
            Day 4: Thursday
            Day 5: Friday
            Day 6: Saturday
            Day 7: Sunday
        */
        
        int day;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Day Number: ");
        day = s.nextInt();
        
        if(day == 1)
            System.out.println("Monday");
        else if(day == 2)
            System.out.println("Tuesday");
        else if(day == 3)
            System.out.println("Wednesday");
        else if(day == 4)
            System.out.println("Thursday");
        else if(day == 5)
            System.out.println("Friday");
        else if(day == 6)
            System.out.println("Saturday");
        else if(day == 7)
            System.out.println("Sunday");
        else
            System.out.println("Invalid");
    }
}
