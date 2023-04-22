//P->3, 3.WAp to find out largest number from given three number without using logical oprator.

import java.util.Scanner;

public class LargeNumber 
{
    public static void main(String[] args) 
    {
        int n1,n2,n3;
        Scanner sc = new Scanner (System.in);

        System.out.println("ENter first number:");
        n1 = sc.nextInt();

        System.out.println("ENter second number:");
        n2 = sc.nextInt();

        System.out.println("ENter third number:");
        n3 = sc.nextInt();

        if(n1>n2)
        {
            if(n1>n3)
            {
                System.out.println(n1+" is largest number.");
            }
            else
            {
                System.out.println(n3+" is largest number.");
            }
        }
        else
        {
            if(n2>n3)
            {
                System.out.println(n2+" is largest number.");
            }
            else
            {
                System.out.println(n3+" is largest number.");
            }
        }
    }
}
