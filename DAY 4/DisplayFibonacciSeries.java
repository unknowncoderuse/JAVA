package loopsinjava;

import java.util.Scanner;

public class DisplayFibonacciSeries 
{
    public static void main(String args[])
    {
        // Program to display Fibonacci Series:
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of terms: \n");
        int n = s.nextInt();
        
        int a=0,b=1;
        
        System.out.print("The Fibonacci Series are: "+a+","+b);
        for(int i=1;i<n-1;i++)
        {
            int c = a+b;
            a=b;
            b=c;
            System.out.print(","+c);
        }
        System.out.println();
        s.close();
    }
}
