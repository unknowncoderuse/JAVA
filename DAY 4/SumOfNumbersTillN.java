package loopsinjava;

import java.util.Scanner;

public class SumOfNumbersTillN 
{
    public static void main(String args[])
    {
        // Program to print Sum of Natural numbers till n:
        
        Scanner s = new Scanner(System.in);
        int sum=0,n;
        System.out.println("Input number: ");
        n = s.nextInt();
        
        int i=1;
        System.out.print("Sum of 1st "+n+" Natural numbers is: ");
        while(i<=n)
        {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
        
        // Using for Loop:
        
/*        for(int j=1;j<=n;j++)
        {
            sum += j;
            
        }
        System.out.println(sum);
*/
    }
}
