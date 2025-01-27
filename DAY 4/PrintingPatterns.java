package loopsinjava;

public class PrintingPatterns 
{
    public static void main(String args[])
    {
/*
      Pattern 1: 
      1 2 3 4 5
      1 2 3 4 5 
      1 2 3 4 5
      1 2 3 4 5        

        
        int i;
        for(i=1;i<6;i++)  // Outer for loop Used for no. of rows
        {
            for(int j=1;j<6;j++)  // Inner for loop Used for no. of columns
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
*/
        
// ---------------------------------------------------------------------------


/*
     Pattern 2: 
     1 1 1 1 1
     2 2 2 2 2
     3 3 3 3 3 
     4 4 4 4 4 
     5 5 5 5 5


        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
*/        
        
// ---------------------------------------------------------------


/* 
    Pattern 3: 
     2 3 4 5 6
     3 4 5 6 7
     4 5 6 7 8
     5 6 7 8 9
     6 7 8 9 10
        
        
        for(int i=0;i<5;i++)
        {
            for(int j=2;j<7;j++)
            {
                int a = i+j;
                System.out.print(a+" ");
            }
            System.out.println();
        }
*/
        
// -----------------------------------------------------------------------

/* 
    Pattern 4: 
     1  2  3  4  5
     6  7  8  9 10 
    11 12 13 14 15
    16 17 18 19 20
    21 22 23 24 25    
        
        
    
        int count=1;
       for(int i=1;i<=5;i++)
       {
           
           for(int j=1;j<=5;j++)
               System.out.printf("%02d ",count++);
           
           System.out.println();
       }
        
*/        
        
// -----------------------------------------------------------------------
        

/*  Pattern 5:
     1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5    
      
        
     for(int i=1;i<=5;i++)
     {
         for(int j=1;j<=i;j++)
         {
             System.out.print(j+" ");
         }
         System.out.println();
     }
        
*/

// --------------------------------------------------------------------------

/*
     Pattern 6:
      1
      2  3
      4  5  6
      7  8  9 10 
     11 12 13 14 15
        
        
        
        int count=1;
        for(int i=1;i<6;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(count++ +" ");
            
            System.out.println();
        }

*/
        
// -----------------------------------------------------------------------

/*
     Pattern 7: 
      * 
      * *
      * * * 
      * * * *
      * * * * * 
        
      
        for(int i=1;i<6;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            
            System.out.println();
        }
        
*/ 
        
// -------------------------------------------------------------------

/*
     Pattern 8: 
      1 2 3 4 5
      1 2 3 4
      1 2 3
      1 2
      1
           
        
        for(int i=1;i<=5;i++)
        {
            int count=1;
            for(int j=5;j>=i;j--)
                System.out.print(count++ +" ");
            
            System.out.println();
        }

*/  
        
// ----------------------------------------------------------------------

/*
    Pattern 9: 
   * * * * *   
     * * * *
       * * *
         * *
           *
        
        
        for(int i=1;i<=5;i++)
        {
            for(int j=2;j<=i;j++)
            {
                System.out.print("  ");
            }
            
            for(int k=5;k>=i;k--)
                System.out.print("* ");
            
            System.out.println();
        }
        
*/        
        
// -------------------------------------------------------------------------

/*
    Pattern 10:
            *
          * *
        * * * 
      * * * *  
    * * * * *    
        
        
        for(int i=1;i<=5;i++)
        {
            for(int j=4;j>=i;j--)
                System.out.print("  ");
            
            for(int k=1;k<=i;k++)
                System.out.print(" *");
            
            System.out.println();
        }
        
*/   
        
        
        
    }
}
