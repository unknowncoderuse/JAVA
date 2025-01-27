package loopsinjava;

import java.util.Scanner;

public class DisplayAPSeries 
{
    public static void main(String args[])
    {
        // Program to print AP Series till nth Term:
        
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st term of an AP: ");
        int a = s.nextInt();
        System.out.println("Enter common difference \"d\" of an AP: ");
        int d = s.nextInt();
        System.out.println("Enter nth term of an AP: ");
        n = s.nextInt();
        
        System.out.print("The AP Series till "+n+"th term are: "+a);
        for(int i=1;i<n;i++)
        {
            a = a+d;
            System.out.print(","+a);
        }
        System.out.println();
    }
}
