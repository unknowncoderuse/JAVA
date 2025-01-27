package loopsinjava;

import java.util.Scanner;

public class FactorialOfNumber 
{
    public static void main(String[] args)
    {
        // Program to find factorial of a given number:
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = s.nextInt();
        
        int fact=1;
        
        System.out.print("Factorial of "+n+"!"+" is: ");
        for(int i=n;i>=2;--i)
        {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
