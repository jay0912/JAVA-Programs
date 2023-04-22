//WAP to check wether given string is palindrom or not.

import java.util.*;

//Main Class
public class Pract11_2 
{
    //Main Method
    public static void main(String[] args) 
    {
        String str, rev="";
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the String : ");
        str = sc.nextLine();

        int length = str.length();

        for(int i=length-1; i>=0; i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println("REVERSED String : "+rev);

        if(str.equals(rev))
        {
            System.out.println("\nGiven String "+str+" is Palindrom." );
        }
        else
        {
            System.out.println("\nGiven String "+str+" is not Palindrom." );
        }
        sc.close();
    }
    
}


/*
for(int i=length-1 ; i>=0; i--)
{
    for(int j=0; j<length; j++)
    {
        char ch = str1.charAt(i);
        str2.charAt(j)=ch;
    }
}
*/