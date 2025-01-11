package conditionalsinjava;

import java.util.*;

public class BiggestOf3Numbers 
{
    public static void main(String arg[])
    {
        // Biggest of 3 numbers using Nested if:
/*        int a=50,b=10,c=20;
        
        if(a>b)
        {
            if(a>c)
                System.out.printf("%d is greater",a);
        }
        else
        {
            if(b>c)
                System.out.printf("%d is greater\n",b);
            else
                System.out.printf("%d is greater\n",c);
        }
*/   
        
       // Biggest of 3 numbers using Else-if ladder:
/*        int a=10,b=20,c=25;
    //    double d = (double)c; // Type-Casting
        
        if(a>b && a>c)
            System.out.println(a+" is Greater!");
        else if(b>c)
            System.out.println(b+" is Greater!");
        else
            System.out.println(c+" is Greater!");
*/


      // Biggest of 3 numbers using Switch Case:
/*        int a=10,b=20,c=25;
        int largest;
        if(a>b && a>c)
        {
            largest=1;
        }
        else if(b>c)
            largest=2;
        else
            largest=3;
        
        switch(largest)
        {
            case 1:System.out.println(a+" is Greater!");
            break;
            case 2:System.out.println(b+" is Greater");
            break;
            case 3:System.out.println(c+" is Greater");
            break;
            default:System.out.println("Sorry! Check the number you have entered!");
        }
*/
    }
}
