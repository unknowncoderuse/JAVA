package loopsinjava;

import java.util.Scanner;

public class CountDigitsOfNumber 
{
    public static void main(String args[])
    {
        // Program to Count number of digits in a number: 
        
        Scanner s = new Scanner(System.in);
        int count=0,n;
        System.out.println("Enter number: ");
        n = s.nextInt();  
        
        System.out.print("Number of digits in "+n+" is: ");
        int a=n;
        while(a!=0)
        {
            a=a/10;
            count++;
        }
        System.out.println(count);
        
        
       
    }
}
