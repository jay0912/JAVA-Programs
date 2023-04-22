//WAP to print followinng pattern usong loop.triangle

import java.util.Scanner;

public class Pattern5 
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
    }    
}
