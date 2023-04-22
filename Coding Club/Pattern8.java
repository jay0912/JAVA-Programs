//WAP java program to prinnt following pattern using loop. damru

import java.util.Scanner;

public class Pattern8 
{
    public static void main(String[] args) 
    {
        int n, i,j,k;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number to print pattern : ");
        n = sc.nextInt(); 
        
        for(i=n; i>=1; i--)
        {
            for(k=n; k>=i; k--)
            {
                System.out.print(" ");
            }

            for(j=i; j>=1; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(i=1; i<n; i++)
        {
            for(k=n-1; k>=i; k--)
            {
                System.out.print(" ");
            }

            for(j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        /*for(i=1; i<=n; i++)
        {
            for(k=0; k<i; k++)
            {
                System.out.print(" ");
            }

            for(j=i; j<=n; j++)
            {
                System.out.print("* ");
            }

            for(l=n; l>=1; l--)
            {
                System.out.print(" ");
            }

            for(m=1; m<=i; m++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/
    }    
}
