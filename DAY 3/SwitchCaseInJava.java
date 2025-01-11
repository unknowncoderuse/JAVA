package switchcase.injava;


public class SwitchCaseInJava 
{   
    public static void main(String args[])
    {
        // Syntax of Switch case:
/*
       switch (expression) 
        {
            case value1:
            // Code block
            break;
            case value2:
            // Code block
            break;
            ...
            default:
        // Default code block
        }        
*/




// Comparison of Switch with else-if Ladder:
        
/*        int n=3;
        if(n==1)
            System.out.println("One");
        else if(n==2)
            System.out.println("Two");
        else if(n==3)
            System.out.println("Three");
        else
            System.out.println("Not Valid");
*/
        
// So, in the above program, to check the condition n=3, it checked all the three conditions in the else-if
// ladder and executed the output.

/* 1. If there is a requirement of checking more than one conditions and check for equality condition(==), 
      then it is always suitable to use Switch case, because it allows you to execute one condition 
      among multiple conditions.
   2. Switch is considered the faster way of execution of program.
   3. For Switch expressions only: 
        Integral type data              (byte,short,long,int)
        Character type data &           (char)
        String type data are allowed.   (String) 
   4. Float or double type data values are not allowed in Switch cases.
   5. Switch cases are mostly used to develop Menu-Driven Programs.
   6. No Logical operators are allowed inside Case values in Switch.
        Ex: case "Hello" && "Hi": Not allowed.
        case 'abc' || 'bbc':  Not allowed.
*/
        
// To check either Else-if ladder or Switch case is faster is by debugging the code.        


// Now writing the above program using Switch case:
        int n=3;
        switch(n)
        {
            case 0: System.out.println("Zero");
            break;
            case 1: System.out.println("One");
            break;
            case 2: System.out.println("Two");
            break;
            case 3: System.out.println("Three");
            break;
            default: System.out.println("Invalid");
        }
    }
    
}
