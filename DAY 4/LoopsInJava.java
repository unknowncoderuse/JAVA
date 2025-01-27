package loopsinjava;

import java.lang.*;
import java.util.Scanner;

public class LoopsInJava {

    
    public static void main(String[] args) 
    {
//        int rev = 0,a,n,m,r=0,j=1,i,count=0,sum=0;
        Scanner s = new Scanner(System.in);
//        System.out.println("Input number: ");
//        n = s.nextInt();
      
// if the reverse of a number is the number itelf, then it is said to be Palindrome.

// if the sum of the cubes of the digits is equal to the number itself, then it is said to be an Armstrong.

// Display number in words even tailing with 0

//        int i,n,fact=1;
//        System.out.println("Input number to find Factorial: ");
//        n=s.nextInt(); 
//        
//        for(i=1;i<=n;i++)
//            fact = fact * i;
//            
//        System.out.print("Factorial of "+n+" is: "+fact);

       // Display AP Series:  
//       int a,b,n,r,term,rev=0,c;
//       System.out.println("Enter 1st term: ");
//       a = s.nextInt();
//       System.out.println("Enter common difference(d): ");
//       r = s.nextInt();
//       System.out.println("Enter number of terms you want to print(n): ");
//       n = s.nextInt();
//       
//       System.out.println("Fibonacci Series: ");
//       a = 0;
//       b = 1;
//       System.out.print(a+","+b);
//       for(int i=2;i<n;i++)
//       {
//         System.out.print(","+(c = a + b));  
//         a=b;
//         b=c;  
//       } 
//          System.out.print((a=a*r)+","); 
       
       
//            int i=1;
//            while(i<100)
//            {
//                System.out.println(i);
//                i = i*2;
//            }





/* ---------------------------------------------------------------------------------------  */




// 1. Display Multiplication Table:
        
//            int n;
//            System.out.println("Enter any number to find the multiplication Table: ");
//            n = s.nextInt();
//            
//            for(int i=1;i<=10;i++)
//            {
//                System.out.println(n+" X "+i+" = "+(i*n));
//            }

// 2. Find Sum of n Numbers:

//        int n,sum=0;
//        System.out.println("Input number of terms: ");
//        n = s.nextInt();
//        
//        for(int i=1;i<=10;i++)
//        {
//            sum = sum + i ;
//            
//        } 
//        System.out.println("Sum of numbers upto "+n+" terms is: "+sum);


// 3. Factorial of a Number:

//        int n;
//        long fact=1;
//        System.out.println("Enter number to find factorial: ");
//        n = s.nextInt();
//        
//        for(int i=1;i<=n;i++)
//        {
//           
//           fact = fact * i;
//           
//        }
//        System.out.println("Factorial of "+n+" is: "+fact);

//4. Display digits of a number: 
//        long r,n;
//        System.out.println("Enter number: ");
//        n = s.nextLong();
//        
//        if(n == 0)
//            System.out.println("The digits of zero does not exist!");
//        else
//        {
//        System.out.println("The digits of a number are:");
//        while(n!=0)
//        {
//             r = n%10;
//             n = n/10;
//             System.out.println(r);
//        }
//        }

// 5. Count number of digits: 

//        long n,m,r,count = 0;
//        System.out.print("Input any number: ");
//        n = s.nextLong();
//        
//        m = n; 
//        if(m == 0)
//            System.out.println("Number of digits is: 1");
//        else
//        {
//        while(m != 0)
//        {
//            r = m%10;
//            m = m/10;
//            
//            count++;
//        }
//        System.out.println("The number of digits of "+n+" is: "+(count));
//        }

// 6  Finding a number is Armstrong or not:

//        int n,m,r,c,sum = 0;
//        System.out.println("Enter any number: ");
//        n = s.nextInt();
//        
//        m = n;
//        do
//        {
//            r = m%10;
//            m = m/10;
//            c = r*r*r;
//            sum = sum + c;
//        } while(m != 0);
//        
//        if(sum == n)
//            System.out.println(""+n+" is an ArmStrong number.");  // 153,370,371,407
//        else
//            System.out.println(""+n+" is not an ArmStrong number.");
//        

// 7. Reverse of a Number: 

//        int rev = 0,n,r;
//        System.out.println("Enter any number: ");
//        n = s.nextInt();
//        
//        while(n != 0)
//        {
//            r = n%10;
//            rev = rev * 10 + r;
//            n = n/10;
//        }
//        System.out.println("Reverse of a number is: "+rev);

// 8. Check a number is Palindrome or not:

/*        int rev = 0,n,m,r;
        System.out.println("Enter any number: ");
        n = s.nextInt();
        
        m = n;
        while(m != 0)
        {
            r = m%10;
            rev = rev * 10 + r;
            m = m/10;
        }
        
        if(rev == n)
            System.out.println(""+n+" is a Palindrome number.");
        else
            System.out.println(""+n+" is not a Palindrome number.");
*/


// 9. Display number in words even with tailing 0:


//        int n,r,rev =0;
//        char c;
//        String str = "";
//        System.out.println("Enter number: ");
//        n = s.nextInt();
//        
//        while(n != 0) //1700
//        {
//            r = n%10;
//            n = n/10;
//            str = str + r;
//        }
//         System.out.println("Number in words: ");
//       
//        for(int i=str.length()-1;i>=0;i--)
//        {
//            c = str.charAt(i);
//            switch(c)
//            {
//                case '0': System.out.print("Zero ");
//                break;
//                case '1': System.out.print("One ");
//                break;
//                case '2': System.out.print("Two ");
//                break;
//                case '3': System.out.print("Three ");
//                break;
//                case '4': System.out.print("Four ");
//                break;
//                case '5': System.out.print("Five ");
//                break;
//                case '6': System.out.print("Six ");
//                break;
//                case '7': System.out.print("Seven ");
//                break;
//                case '8': System.out.print("Eight ");
//                break;
//                case '9': System.out.print("Nine ");
//                break;
//            }
//        }


// 10. Display AP Series: 

//            int n,a,d;  
//            System.out.println("Enter 1st term in AP series: "); 
//            a = s.nextInt();      // 2,4,6,8,... a=2,d=4-2=2,a+d;
//            System.out.println("Enter common difference: ");
//            d = s.nextInt();
//            System.out.println("Enter number of terms: ");
//            n = s.nextInt();
//               
//            System.out.println("Series of an AP are: ");
//            
//            int i = 1;
//            while(i<=n)
//            {
//                System.out.print(a+",");
//                a = a + d;
//                i++;
//            }
//            


// 11. Display GP Series:

//            int n,a,r;
//            System.out.println("Enter 1st term in GP series: "); 
//            a = s.nextInt();     
//            System.out.println("Enter common ratio: ");
//            r = s.nextInt();
//            System.out.println("Enter number of terms: ");
//            n = s.nextInt();            
//            
//            System.out.println("Series of a GP are: ");
//            int i = 1;
//            while(i<=n)
//            {
//                System.out.print(a+",");
//                a = a * r;
//                i++ ;
//            }


// 12. Display Fibonacci Series:

//            int n,a=0,b=1,c,i = 1;
//            System.out.println("Enter number of terms: ");
//            n = s.nextInt();
//            
//            System.out.println("The Fibonacci Series are: ");
//            System.out.print(a+","+b);
//            while(i<=n-2)
//            {
//                
//                c = a + b;
//                System.out.print(","+c);
//                a = b;
//                b = c;
//                i++ ;
//            }
            


// 13. Nested Loops

//        int count = 1;
//        for(int i=1;i<=5;i++)
//        {
//            for(int j=1;j<=5;j++)
//            {
//                System.out.format("%02d ",(count++));
//            }
//            System.out.println();
//        }



//           int i,j;
//           for(i=1;i<=5;i++)
//           {
//               for(j=1;j<=i;j++)
//                   System.out.print(j+" ");
//               
//               System.out.println();
//           }
        
                
//            int count = 1;
//            for(int i=1;i<=5;i++)
//               {
//                   for(int j=1;j<=i;j++)
//                   {
//                       
//                       System.out.print((count++)+" ");
//                   }
//                 
//                System.out.println();
//               }   



//          for(int i=1;i<=5;i++)
//           {
//               for(int j=1;j<=5-i+1;j++)
//                   System.out.print(j+" ");
//               
//               System.out.println();
//           }



//            for(int i=1;i<=5;i++)
//           {
//               for(int j=1;j<=5;j++)
//               {
//                   if(i+j>5)
//                       System.out.print("* ");
//                   else
//                       System.out.print("  ");
//               }
//               System.out.println();
//           }
//        
        
        
        
              






//        switch(r)
//    {
//        case 0: System.out.println("Zero");
//                break;
//        case 1: System.out.println("One");
//                break;
//        case 2: System.out.println("Two");
//                break;
//        case 3: System.out.println("Three");
//                break;
//        case 4: System.out.println("Four");
//                break;
//        case 5: System.out.println("Five");
//                break;
//        case 6: System.out.println("Six");
//                break;
//        case 7: System.out.println("Seven");
//                break;
//        case 8: System.out.println("Eight");
//                break;
//        case 9: System.out.println("Nine");
//    }
//        
    
        
    
        
        
        
        
        
        
        
    
    
    

















                         // Palindrome of number.
//         m=n;
//         do
//         {
//             r = n%10;
//             rev = (rev * 10)+r;
//             n = n/10;
//         }while(n!=0);
//         
//         
//         if(rev==m)
//         System.out.println("The given number "+rev+" is a Palindrome number");
//         
//         else 
//         System.out.println("The given number "+rev+" is not a Palindrome number ");
         




       
       //Reverse of a number
//       System.out.print("Reverse of a number is: ");
//       do
//       {
//           r = n%10 ;
//           System.out.print(r);
//           n = n/10 ;
//       }while(n!=0);
       
 



//                   [OR]




           // Reverse of Number.
//         System.out.print("Reverse of a number is: ");
//         do
//         {
//             r = n%10;
//             rev = (rev * 10)+r;
//             n = n/10;
//         }while(n!=0);
//         System.out.print(rev);






         
        //Armstrong number
        //int m=n;
//       do 
//       {
//           r = n%10;
//           sum += (r*r*r) ;
//           n = n/10;
//       }while(n!=0);
//         if(sum==m)
//       System.out.println("It is an armstrong number.");
    //     else System.out.println("Not an armstrong number.");
          









     
// Count of its digits:
//        do
//        {
//           n = n/10 ;
//           count++;
//        }while(n!=0);
//        System.out.println("The number of digits are: "+count);


        




         



        //Factorial of number;
//        for(int i=1;i<=n;i++)
//        {
//            j = j*i;
//        }
//        System.out.println("Factorial of "+n+" is: "+j);
       
        




        //Sum of N numbers;
//        for(int i=1;i<=n;i++)
//        {
//            sum += i;
//            
//        }System.out.println("Sum of "+n+" numbers is: "+sum);

        




         //Multiplication table:
//        for(int i=1;i<=10;i++)
//        {
//            System.out.println("5 X "+i+" = "+""+(i*n));
//        }


// Program to print Power's of 2 till 5:
        
 //       System.out.println("Power's of 2 upto 100 are: ");
        
//        int i=1;
//        while(i<100)
//        {
//            i = i*2;
//            int res = i;
//            
//            if(res < 100)
//            System.out.print(res+" ");
//        }



    }
    
}
