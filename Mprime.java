//P->5, 4.WAP to check weather given number is prime or not using method. 

import java.util.*;

public class Mprime 
{
    //method
    static int check(int n)
    {
        int i;

        for(i=2; i<n; i++)
        {
            if(n%i == 0)
            { 
                return 0;
            }
        }
        return 1;
    }

    //main method
    public static void main(String[] args) 
    {
        int n, prime;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check weather number is prime or not:");
        n = sc.nextInt();
        
        //method call
        prime = check(n);

        if(prime==0)
        {
            System.out.println(n+" is not prime number");
        }
        else 
        {
            System.out.println(n+" is prime number");
        }
    }
}
