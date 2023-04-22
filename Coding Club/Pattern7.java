//WAP to print following pattern using loop.daimond

import java.util.Scanner;

public class Pattern7 
{
    public static void main(String[] args) 
    {
        int n, i, j, k;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number to print pattern : ");
        n = sc.nextInt();

        for(i=1; i<=n; i++)
        {
            for(k=n; k>=i; k--)
            {
                System.out.print(" ");
            }

            for(j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(i=n; i>=1; i--)
        {
            for(k=n+1; k>=i; k--)
            {
                System.out.print(" ");
            }

            for(j=i-1; j>=1; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*for(i=1; i<=n; i++)
        {
            for(k=n; k>=i; k--)
            {
                System.out.print(" ");
            }

            for(j=1; j<=i; j++)
            {
                System.out.print("* ");
            }

            for(m=1; m<=n; m++)
            {
                System.out.print(" ");
            }

            for(o=n-1; o>=i; o--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/       
        
    }   
}
