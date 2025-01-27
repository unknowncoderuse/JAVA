package loopsinjava;

import java.util.Scanner;
public class MultiplicationTable 
{
    public static void main(String args[])
    {
        // Program to print Multiplication Table: 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number to print the Multiplication Table: ");
        int n = s.nextInt();
        
        int i=1;
        while(i<=10)
        {
            System.out.println(n+" X "+i+" = "+(n*i));
            i++;
        }
        s.close();
    }
}
