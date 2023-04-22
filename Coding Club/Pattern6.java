//WAP to rint following pattern using loop. 180degrere triangle.

import java.util.Scanner;

public class Pattern6 
{
    public static void main(String[] args) 
    {
        int n, i, j, k;
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
    }    
}
