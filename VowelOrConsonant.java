//P->3, 2.WAP to check wether the enterd number is vowel or consonant.

import java.util.Scanner;

public class VowelOrConsonant
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Character: ");
        char ch = sc.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I'|| ch=='O' || ch=='U' )
        {
            System.out.println( ch+" is vowel.");
        }
        else
        {
            System.out.println( ch+" is Consonanat.");
        }
    }
}