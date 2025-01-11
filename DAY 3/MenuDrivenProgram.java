package switchcase.injava;

import java.util.*;

public class MenuDrivenProgram 
{
    public static void main(String args[])
    {
        // Program to execute Arithmetic Operations using Switch Case:
        
        /*
        MENU:
        1. Add
        2. Subtract
        3. Multiply
        4. Division
        */
        
        
        
        
        Scanner s = new Scanner(System.in);
        int n1,n2;
        double d1,d2; // for division operation
        String option;
        System.out.println("Enter 1st number: ");
        n1 = s.nextInt();
        d1 = n1;
        System.out.println("Enter 2nd number: ");
        n2 = s.nextInt();
        d2 = n2;
        
        System.out.println("Choose any one of the following options given below:");
        System.out.println("Menu:");
        System.out.println("Addition");
        System.out.println("Subtraction");
        System.out.println("Multiplication");
        System.out.println("Division");
        
        System.out.println("Enter full option in words: ");
        option = s.next().toLowerCase();
        System.out.println();
        switch(option)
        {
            case "addition": System.out.println("Sum of two numbers is "+(n1+n2));
            break;
            case "subtraction": System.out.println("Subtraction of two numbers is: "+(n1-n2));
            break;
            case "multiplication": System.out.println("Multiplication of two numbers is "+(n1*n2));
            break;
            case "division": System.out.println("Division of two numbers is: "+(d1/d2));
            break;
            default: System.out.println("Incorrect Arithmetic Operation. Kindly check the above options and Try again!");
        }
    }
}
