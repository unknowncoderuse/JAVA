package loopsinjava;


public class LoopsDemonstration 
{
    public static void main(String args[])
    {
        // Loops Demo: 
       
        // In while-loop, first the condition is checked then the body of the loop gets executed.
       // While means as long as the condition is true:
        /* Syntax of While loop:
            while(condition/expression)
            {
                // program logic;
                // printing statements;
            } 
        */
        
        // Program to print Power's of 2 till 5:
        
/*        System.out.println("Power's of 2 upto 100 are: ");
        
        int i=1;
        while(i<100)
        {
            System.out.print(i+" ");
            i = i*2;
        }
 */       
        // Re-writing the above code using Do-While Loop:
/*        do
        {
            
            System.out.print(i+" ");
            i=i*2;
            
        }while(i<100);
*/        
         // When ever while loop is used, As an alternative Do-while loop can also be used.
        // In do-while loop, first the body of the loop gets executed atleast once, then the condition is checked.
       // For example: 
       
/*       int j=100;
       do
       {
           System.out.print(j+" ");
           j = j*2;
       }while(j<100);
 */       
        
       // Infinite-Loop:
/*       int a=1;
       while(true)
       {
           System.out.println(a);
           a++;
         
       }
 */
        
        // For Loop: if the number of iterations(repeat) are fixed.
       // In simple terms, when you know number of times, then for loop is used.
        
      /* Real-life example:
         Add sugar to Coffee:
        Method 1: (While)
        put sugar and mix, again put sugar and mix and so on... until the coffee is sweet enough.
        Once the coffee becomes sweet you stop.
        
        Method 2: (For)
        Just mix 5 teaspoons of sugar in a large cup of Coffee and it will be sweetened.
        */
        
  
        /*
            Syntax of For Loop in java:
            for(initialisation;condition;increment/decrement)
            {
                body of the Loop;
                printing statements;
            }
        */
        
/*        // Printing 1st 5 natural numbers in ascending order:
        for(int i=1;i<=5;i++)
            System.out.print(i+" ");
            System.out.println();
        
        // Printing 1st 5 natural numbers in Descending order: 
        for(int j=5;j>=1;--j)
            System.out.print(j+" ");
*/      
        
        // Giving initialisation in for loop is Optional.
        // Updation in for-loop is also Optional.
        // Condition is also Optional.
//        int i=1;
 //       for(System.out.println("Hi");i<5;i++)
 //           System.out.println((i*1)+" ");
        
        // Infinite Loop using for loop:
/*        int j=1;
        for(;;)
            System.out.println(j);
*/

       // Inside for, more than one variable can be declared with the same datatype.
       
       for(int a=1,b=1; a<=5; a++,b*=2)
           System.out.println(a+" "+b);
       
       
    }
}
