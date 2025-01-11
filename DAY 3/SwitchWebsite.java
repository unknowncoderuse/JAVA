package switchcase.injava;

import java.util.*;

public class SwitchWebsite 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any Website's URL: ");
        String url=s.next();
        
        String type = url.substring(url.lastIndexOf(".")+1);
        
        switch(type)
        {
            case "com": System.out.println("Its a Commercial website");
            break;
            case "org": System.out.println("Its a Non-profit Organisation");
            break;
            case "net": System.out.println("Its connected to a Network");
            break;
            case "gov": System.out.println("Its a Government website");
            break;
            default: System.out.println("Invalid extension. Check and Try again!");
        }
    }
}
