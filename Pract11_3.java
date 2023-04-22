//WAP to accept a string from the user and desplay all the vowels present in the strings.

import java.util.*;

//Main Class
public class Pract11_3 
{
    //Main Method
    public static void main(String[] args) 
    {
        int i;
        char ch;
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        str = sc.next();

        for(i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I'|| ch=='O' || ch=='U')
            {
                System.out.println("Present Vowel : "+ch);
            }
        }
        
    }
}
