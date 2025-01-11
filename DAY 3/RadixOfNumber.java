package conditionalsinjava;

import java.util.*;

public class RadixOfNumber 
{
    public static void main(String args[])
    {
        // Program to find the given number is valid Radix Number or Not.
        Scanner s = new Scanner(System.in);
        String number;
        System.out.println("Enter any Number: ");
        number = s.next();
        
        if(number.matches("[01]+"))
            System.out.println("It is Binary Number\nAnd Radix is 2");
        else if(number.matches("[0-7]+"))
            System.out.println("It is Octal Number\nAnd Radix is 8");
        else if(number.matches("[0-9]+"))
            System.out.println("It is Decimal Number\nAnd Radix is 10");
        else if(number.matches("[0-9A-F]+"))
            System.out.println("It is Hexa-decimal Number\nAnd Radix is 16");
        else
            System.out.println("It is an Invalid Number.");
    }
}
