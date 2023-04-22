//WAP to find the length of the string.

import java.util.*;

//Main class
public class Pract11_1 
{
    //Main method
    public static void main(String[] args) 
    {
        int i=0;
        String str;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter String : ");
        str = sc.next();

        char ch[]=str.toCharArray();
 
        for(char c : ch)
        {
            i++; 
        }

        System.out.println("Length of the string = "+i);
       

    }
    
}



/*
witj built-in function
/Main class
public class Pract11_1 
{
    //Main method
    public static void main(String[] args) 
    {
        String str;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter String : ");
        str = sc.next();

        System.out.println("The length of the string is : "+str.length());

    }
    
}
*/
