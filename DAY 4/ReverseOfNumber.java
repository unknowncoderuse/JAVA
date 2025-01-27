package loopsinjava;

import java.util.Scanner;

public class ReverseOfNumber 
{
    public static void main(String args[])
    {
        // Program to print Reverse of a Number: 
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = s.nextInt();
        int rev=0;
        
        while(n!=0)
        {
            int r = n%10;
            rev = rev * 10 + r;
            n = n/10;
        }
        System.out.println("Reverse of a number is: "+rev);
        
        
    }
}
