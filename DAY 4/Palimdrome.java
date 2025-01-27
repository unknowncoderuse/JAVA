package loopsinjava;

import java.util.Scanner;

public class Palimdrome 
{
    public static void main(String args[])
    {
        // Program to check whether the given number is Palindrome.
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = s.nextInt();
        
        int a=n;
        int rev=0;
        while(a!=0)
        {
            int r = a%10;
            rev = rev * 10 + r;
            a = a/10;
        }
        
        if(rev == n)
            System.out.println(n+" is a Palindrome Number!");
        else
            System.out.println(n+" is not a Palindrome Number!");
    }
}
