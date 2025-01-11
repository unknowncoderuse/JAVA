package conditionalsinjava;

import java.util.*;

public class PersonIsYoung 
{
   public static void main(String args[])
   {
         // These are my assumptions. You may assume any age value you like.
        // Person to be Young: Age is between 14 to 55.
       // Person's age after 55 is taken as Not Young.
       
       Scanner s = new Scanner(System.in);
       int age;
       System.out.print("Enter your age to check you're Young or not: ");
       age = s.nextInt();
       
      // TYPE-1:
/*       if(age>=14 && age<=55)
           System.out.println("You are Young");
       else if(age>0 && age<14 )
           System.out.println("You are a Child");
       else
           System.out.println("You're Old");
*/       
      // TYPE-2:
       if(age<14 || age>55)
           System.out.println("You are not Young!");
       else
           System.out.println("You're Young!");
   }
}
