package loopsinjava;

import java.util.*;

public class Armstrong 
{
    public static void main(String[] args)
    {
        // Program to find whether given number is Armstrong or Not:
        Scanner s = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter any number: ");
        int n = s.nextInt(); //123
        
        // Armstrong: If the sum of the cubes of the digits of a number is equal to the number itself.
        int t=n;
        
        while(t!=0)
        {
            int d = t%10;
            int c = d*d*d;
            sum += c;
            t = t/10;
        }
        System.out.println();
        
        if(sum == n)
            System.out.println(n+" is an Armstrong Number.");
        else
            System.out.println(n+" is not an Armstrong Number!");
    }
}
