package loopsinjava;

import java.util.*;

public class DisplayGPSeries 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st term of GP: ");
        int a = s.nextInt();
        System.out.println("Enter common ratio \"r\" of GP: ");
        int r = s.nextInt();
        System.out.println("Enter nth term of GP: ");
        int n = s.nextInt();
        
        System.out.print("The GP Series till "+n+"th term are: "+a);
        for(int i=1;i<n;i++)
        {
            a = a*r;
            System.out.print(","+a);
        }
        System.out.println();
    }
}
