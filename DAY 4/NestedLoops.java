package loopsinjava;

import java.util.*;

public class NestedLoops 
{
    public static void main(String args[])
    {
        // Syntax for Nested Loops: 
        
        
//        1. Single Loop:
/*        for(int i=0;i<=n;i++)
        {
            // Single loop behaves linearly. (One Direction)
        }
        
        
//        2. Nested Loop:
        for(ini;con;upd++)   // Outer loop responsible for No. of rows
        {
            for(ini;con;upd++)  // Inner loop responsible for No. of coloumns.
            {
                // Nested Loop behaves 2-dimensionally. (Two Directions)
            }
        }
        
*/
        
        // Example: When 2 dice are rolled simulatineously, then the sample space is: 
        //          there are 6 × 6 = 36 different outcomes possible.
        
        System.out.println("When 2 dice are rolled simulatineously, then the sample space is: \n");
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=6;j++)
            {
                System.out.print("("+i+","+j+") ");
            }
            System.out.println();
        }
          
        
    }
}
