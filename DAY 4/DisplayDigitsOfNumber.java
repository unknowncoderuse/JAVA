package loopsinjava;

import java.util.Scanner;

public class DisplayDigitsOfNumber 
{
    public static void main(String args[])
    {
        // Program to display digits of a Given number:
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = s.nextInt();
        
        
        int digit=n;
        System.out.print("Digits of "+n+" are: ");
        while(n!=0)
        {
            digit=n%10;
            System.out.print(digit+" ");
            n = n/10;
            
        }
    }
}
