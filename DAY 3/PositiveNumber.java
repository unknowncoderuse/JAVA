package conditionalsinjava;

import java.util.*;

public class PositiveNumber 
{
    public static void main(String args[])
    {
        // Program to check whether given number is positive or not using If-Else statement.
        
        int a;
        
        // Scanner class takes the input from the user/Keyboard.
        // To use Scanner class, it is compulsory to import utility package in java.
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter any Number: ");
        a = s.nextInt();
        
        
        // If is the true block. If the condition is true, if block of code is being executed.
        // If the condition is false of if block, then the else block of code will be executed.
        if(a>=0)   
            System.out.println(a+" is a positive number!");
        else
            System.out.println(a+" is not a positive number!");
        
        
        
    }
}
