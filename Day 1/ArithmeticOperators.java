package javarevision_nov9th_2024;

import java.util.*;

public class ArithmeticOperators 
{
    public static void main(String args[])
    {
        // DAY 1: Implementing OPERATORS IN JAVA
        // Arithmetic operations can be applied on any type of data except Boolean.
        // Precedence of Operators: 
        // Higher Precedence: *,/,% (equal precedence) & (left to right associative).
        // Lower Precedence: +,- 
        // Paranthesis () is used to change the precedence of operators.
        
        int a=14,b=5;
        
        System.out.println("1. Dividing two integer values results in integer only.");
        int q=a/b;  // "/" returns quotient i.e 2 and not 2.8
        int r=a%b; // "%" returns remainder.
        System.out.println("Division: "+q+"\n"+"Remainder: "+r);
        
        
        float f=(float)a/b; // Type-Casting
        System.out.println("Type-casting for the above expression: "+f+"\n");
        
        System.out.println("2. Dividing two float values results in Float only.");
        float m=14.3f,n=3.2f;
        float _f=m%n; 
        System.out.println("Remainder: "+_f);
        
        System.out.println("3. Performing arithmetic operation on Byte and Short results in Integer only.");
        byte b1=10;
        short s1=15;
        
        // byte c=a+b; // incorrect.
        int c = a+b;  // correct.
        
        System.out.println("4. Float + int = float value.");
        float a1=12.5f;
        int i = 123;
        float m1 = a1*i;
        
        System.out.println("5. float + double = double value.");
        float f1=12.5f;
        double d1 = 123.5;
        double d2 = f1/d1; // results in double value since double is a larger datatype.
        
        System.out.println("6. Char + int = Integer");
        char c1=50;
        int i2 = 30;
        int i3 = c1-i2; // 20.
        
    }
}
