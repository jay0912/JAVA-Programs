//P->4, 1.WAP to print number between given two number which is divisible by 2 but not divisible by 3.

import java.util.Scanner;

public class DivisibleBy2Not3 
{
    public static void main(String[] args) 
    {
        int n1,n2,i;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First number: ");
        n1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        n2 = sc.nextInt();

        System.out.println("Numbers which is divisible by 2 but not divisible by 3:");
        for(i=n1; i<n2; i++)
        {
            if(i%2==0 && i%3!=0)
            {
                System.out.println(i+"");
            }    
        }

    }
}
