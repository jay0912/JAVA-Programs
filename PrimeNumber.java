//P->4, 3.WAP to cheak weather number is prime or not.

import java.util.Scanner;

public class PrimeNumber 
{
    public static void main(String[] args) 
    {
        int n,i,prime=0;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        n = sc.nextInt();

        for(i=2; i<n; i++)
        {
            if(n%i==0)
            {
                prime = 1;
                break;
            }
           
        }

        if(prime==1)
        {
            System.out.println("Enterd Number is not prime.");
        }
        else
        {
            System.out.println("Enter Number is prime.");
        }
    }    
}
