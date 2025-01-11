
package conditionalsinjava;

import java.util.*;

public class Gradesof3Subjects 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int dsa,ca,pf;
        System.out.println("Enter marks obtained in DSA: ");
        dsa = s.nextInt();
        System.out.println("Enter marks obtained in Computer Architecture: ");
        ca = s.nextInt();
        System.out.println("Enter marks obtained in Programming Fundamentals: ");
        pf = s.nextInt();
        
        int tot,avg;
        tot = dsa + ca + pf; // Calculating total marks of 3 Subjects.
        avg = tot/3;        // (Sum of all subjects)/(number of subjects) is the Average.
        
        if(avg>=70)
            System.out.println("A Grade");
        else if(avg>=60 && avg<70)
            System.out.println("B Grade");
        else if(avg>=50 && avg<60)
            System.out.println("C Grade");
        else if(avg>=40 && avg<50)
            System.out.println("D Grade");
        else
            System.out.println("Failed");
        
        
        
    }
}
