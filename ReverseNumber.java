//P->4, 5.WAP to reverse given number.

import java.util.Scanner;

public class ReverseNumber 
{
    public static void main(String[] args) 
    {
        int i,n,reverse=0;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        n = sc.nextInt();

        for(i=n; i>0; i=i/10)
        {
            int digit = i % 10;
            reverse = reverse*10 + digit; 
        }

        System.out.print("Reverse number of "+n+" is " +reverse);
    }
}
