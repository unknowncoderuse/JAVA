package conditionalsinjava;

import java.util.*;

public class typeOfWebsite 
{
    public static void main(String args[])
    {
        // Program to Find type of website and the Protocol used:
        
        String url;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter url of the website: ");
        url = s.next();
        
        String protocol = url.substring(0, url.indexOf(":"));
        
        if(protocol.equals("http"))
            System.out.println("Hyper Text Transfer Protocol");
        else if(protocol.equals("ftp"))
            System.out.println("File Transfer Protocol");
        else if(protocol.equals("https"))
            System.out.println("Hyper Text Transfer Protocol Secured");
        else
            System.out.println("Invalid Protocol!");
        
        
        String extension = url.substring(url.lastIndexOf(".")+1);
        if(extension.equals("com"))
            System.out.println("It is Commercial website");
        else if(extension.equals("gov"))
            System.out.println("It is Government website");
        else if(extension.equals("net"))
            System.out.println("It is connected to a Network");
        else if(extension.equals("org"))
            System.out.println("It is Non-Profit Organisation");
        else
            System.out.println("Invalid extension!");
        
    }
}
