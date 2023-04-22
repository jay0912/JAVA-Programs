//P->5, 3.WAp to genrate the fibonacci series of N given number using method.

import java.util.*;

public class MFibonacci 
{
    //main method
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the limit of fibonacci series :");
        n = sc.nextInt();

        //method call
        Fibonacci(n);
    }

    //method
    static void Fibonacci(int n)
    {
        int n1=0, n2=1,temp,i;

        System.out.printf("\nFibonacci Series : ");
        for(i=0; i<n; i++)
        {
            System.out.printf("%d\t",n1);
            temp = n2;
            n2 = n1 + n2;
            n1 = temp;
        }
        
    }
}
