//WAP to print following pattern using lopp.

import java.util.Scanner;

public class Pattern3 
{
    public static void main(String[] args) 
    {
        int n, i, j;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number to print pattern : ");
        n = sc.nextInt();

        for(i=n; i>=1; i--)
        {
            for(j=i; j>=1; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }    
    }
}
