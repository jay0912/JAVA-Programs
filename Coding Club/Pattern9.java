//Write a java program to print following pattern using loop.square

import java.util.Scanner;

public class Pattern9 
{
    public static void main(String[] args) 
    {
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        n = sc.nextInt();

        for(i=1; i<=n; i++)
        {
            for(j=1; j<=n; j++)
            {
                if(i==1 || i==n || j==n || j==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
