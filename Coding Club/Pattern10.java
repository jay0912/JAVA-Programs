//WAP to print following pattern using loop.

import java.util.Scanner;

public class Pattern10 
{
    public static void main(String[] args) 
    {
        int n,i,j,k=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number to print pattern : ");
        n = sc.nextInt();

        for(i=1; i<=n; i++)
        {
            for(j=1; j<=i; j++)
            {
                k++;
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }    
}
