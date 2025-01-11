package conditionalsinjava;

import java.util.*;

public class ConditionalsInJava 
{
    public static void main(String[] arg) 
    {
       // All the logical operations returns Boolean values.
        int a=1,b=2,c=3;
        System.out.println(a<b); //true
        System.out.println(a<b && a<c); // true
        
        // So, if both the conditions in "Logical AND &&" are true, then it is TRUE, else everything is FALSE.
        System.out.println(a<b && a>c); // false
        
        // If one of the condition in "Logical OR ||" is true, then it is TRUE.
        System.out.println(a<b || a>c); // true 
        
        // Logical expressions can be compared using any type of data.
        float p=5.56f,q=5.56f,r=12.5005f;
        System.out.println(p<q); // false
        
        
    }
}
