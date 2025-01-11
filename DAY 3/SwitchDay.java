package switchcase.injava;

import java.util.*;

public class SwitchDay 
{
    public static void main(String args[])
    {
        // Program to display name of a day based on day-number using Switch:
        
        int dayno;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Day Number: ");
        dayno = s.nextInt();
        
        switch(dayno)
        {
            case 1:System.out.println("Its Monday");
            break;
            case 2:System.out.println("Its Tuesday");
            break;
            case 3:System.out.println("Its Wednesday");
            break;
            case 4:System.out.println("Its Thursday");
            break;
            case 5:System.out.println("Its Friday");
            break;
            case 6:System.out.println("Its Saturday");
            break;
            case 7:System.out.println("Its Sunday");
            break;
            default: System.out.println("Invalid Day number given. Please Check again!");
        }
        
    }
}
