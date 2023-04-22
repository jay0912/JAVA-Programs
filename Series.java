//P->4, 4.Wap to print the sum of the series:1/1 + 1/2 + 1/3 + ........ + 1/n.

import java.util.Scanner;

public class Series 
{
   public static void main(String[] args) 
   {
        int n,i;
        double sum=0;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        n = sc.nextInt();

        for(i=1; i<=n; i++)
        {
            sum = sum + 1.0/i;
        }

        System.out.println("Sum of given series is : "+sum);

   } 
}
