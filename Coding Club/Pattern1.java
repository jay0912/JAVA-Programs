//WAP to  print pattern using loop.

import java.util.Scanner;

public class Pattern1
{
    public static void main(String[] args) 
    {
        int n, i, j;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number to print pattern : ");
        n = sc.nextInt();

        for(i=1; i<=n; i++)
        {
            for(j=1; j<=n; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}