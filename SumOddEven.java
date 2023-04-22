//P->4, 6.Wap to print sum of all positive even number and all positive odd number.

import java.util.Scanner;

public class SumOddEven 
{
  public static void main(String[] args) 
  {
        int n,i,sumeven=0,sumodd=0;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        n = sc.nextInt();

        for(i=0; i<=n; i++)
        {
            if(i%2==0)
            {
                sumeven = sumeven + i;
            }
            else if(i%2!=0)
            {
                sumodd = sumodd + i;
            }
            
        }

        System.out.println("Sum of all positive even number is : "+sumeven);
        System.out.println("Sum of all positive odd number is : "+sumodd);
  }  
}
