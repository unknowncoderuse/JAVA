package loopsinjava;

import java.util.*;

public class DisplayNumberInWords 
{
    public static void main(String args[])
    {
        // Program to display number in words even tailing with 0:
        Scanner s = new Scanner(System.in);
        String str=""; char c;
        System.out.println("Enter any number: ");
        int n = s.nextInt(); // 1700
        
        
        System.out.println("\nThe number "+n+" in words are: ");
        while(n!=0)
        {
            int r = n%10;
            str = str + r; // 0071
            n = n/10;
        }
        
       
        for(int i=str.length()-1;i>=0;i--)
        {
             c = str.charAt(i);
             
            switch(c)
            {
                case '0': System.out.println("Zero");
                break;
                case '1': System.out.println("One");
                break;
                case '2': System.out.println("Two");
                break;
                case '3': System.out.println("Three");
                break;
                case '4': System.out.println("Four");
                break;
                case '5': System.out.println("Five");
                break;
                case '6': System.out.println("Six");
                break;
                case '7': System.out.println("Seven");
                break;
                case '8': System.out.println("Eight");
                break;
                case '9': System.out.println("Nine");
                break;
            
            }
        }
        
        
    }
}
