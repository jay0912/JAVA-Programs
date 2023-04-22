//P->5, 2.WAP to find maximum number from given number using method.

import java.util.*;

public class Max_2 
{
    static void max(int x, int y)
    {
        if(x>y)
        {
            System.out.printf("\nGiven number "+x+" is maximum");
        }
        else if(y>x)
        {
            System.out.printf("\nGiven number "+y+" is maximum");
        }
        else
        {
            System.out.printf("\nGiven both number is equal");
        }
    }

    public static void main(String[] args) 
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("\nEnter first number : ");
        a = sc.nextInt();

        System.out.printf("\nEnter second number : ");
        b = sc.nextInt();

        //methid call 
        max(a,b);

    }
    
}
