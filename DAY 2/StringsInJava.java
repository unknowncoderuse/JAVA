package stringsinjava;

public class StringsInJava {
    public static void main(String[] args) 
    {
        String str1="Java Program"; // String literal created in Pool.
        String str2 = new String("JAVA"); // String literal created in Heap.
        
        /* String Constructors:
           1. String(char[])
           2. String(byte[])
           3. String(String)
        */
        
        char c[]={'h','e','l','l','o'}; // Using Character Array
        String str3 = new String(c);
        System.out.println("Character Array: "+str3);
        
        byte b[] = {65,66,67,68};   // Using Byte Array
        String str4 = new String(b);
        System.out.println("Byte Array: "+str4); 
        
        String str5 = new String("String Constructor");
        System.out.println(str5);
        System.out.println();
        System.out.println();
        
        System.out.println("String Methods");
        
        String s1 = new String("Netbeans");
        int len = s1.length();    // returns length(no. of characters) of the String.
        System.out.println("1. Length of the String is: "+len);
        
        String lc = s1.toLowerCase(); // returns String in lower case(small) letters.
        System.out.printf("2. String to LowerCase: %s\n",lc);
        
        String uc = s1.toUpperCase(); // returns String in Upper case(big) letters.
        System.out.println("3. String to UpperCase: "+uc);
        
        String s2 = new String("   Learn Programming     ");
        String tr = s2.trim(); // removes leading & tailing spaces present in the String.
        System.out.println("4. String after trimming: "+tr);
        
        String s3 = new String("JavaProjects");
        String sub1 = s3.substring(6); // returns a part of a String starting from index 5 till end.
        System.out.println("5. Substring is: "+sub1);
        String sub2 = s3.substring(6, 11); // returns a part of a String from index 6 and ending at (index - 1).
        System.out.println("6. Substring is: "+sub2);
        
        String r = s3.replace('a','e'); // replaces the String where a is replaced with e.
        System.out.println("7. Replace a with e: "+r);
        
        
        String s4 = "Mr. Ratan Tata";
        // Boolean returns either TRUE or FALSE.
        boolean sw = s4.startsWith("Mr."); // checks a String with specified letter or String.
        System.out.println("8. String starts with \"Mr.\" : "+sw); // true
        
        System.out.println(s4.startsWith("mr")); // false
        
        System.out.println(s4.startsWith("Ra", 4)); // true
        
        System.out.println(s4.endsWith("tata")); // checks a String with specified letter at the end of the String.
        // So, both startsWith() & endsWith() are Case-Sensitive Methods.
        System.out.println("9. String ends with \"tata\" : "+sw); // true
        
        System.out.println("10. At index 8 the letter is: "+s4.charAt(8)); // returns a character at given Index number.
        System.out.println("11. Index of character \"R\" is: "+s4.indexOf('R'));
        
        String p1 = "Pyramid";
        String p2 = "Pyramid";
        String p3 = "pyramid";
        
        System.out.println("12. Are the two Strings equal ? "+p1.equals(p2)); // Checks the contents of the String.
        System.out.println("Are the two strings equal ? "+p1.equals(p3)); // returns False.
        
        // returns true, if the contents of the Strings are equal, else returns false.
        System.out.println("13. Are the contents of the String same ? "+p1.equalsIgnoreCase(p3));
        
        // Here, p1 & p3 are the references,so it will compare the references, not the contents.
        System.out.println(p1 == p3); // false
        
        /*
          1. returns 0, if both the strings having same contents.
          2. returns -1, if 1st String is smaller than the 2nd String. (Dictionary)
          3. returns 1, if 1st String is larger than the 2nd String. (Dictionary)
        */
        
        System.out.println(p1.compareTo(p2)); // returns 0.
        
        // here, 32 is the difference of their ASCII values of p and P.
        System.out.println(p3.compareTo(p1)); // returns 1.
        
        String p4 = "the great wall of china";
        System.out.println("Does the word \"wall\" present in the String ? "+p4.contains("wall"));
        
        String p5 = "I love Coding";
        String p6 = " and Programming";
        
        System.out.println(p5 + p6); // Using Arithmetic operator "+" and joining two Strings..
//                  or
        System.out.println(p5.concat(p6)); // concatenates(joins) two Strings.
        
        
        
        
        
    }
    
}
