//Find factorial without using multipexing and recursion.

import java.util.*;

public class Code2 
{
    public static void main(String[] args) 
    {
        int n,fact=1;
        int i;
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter number : ");
        n = sc.nextInt();

        for(i=1; i<=n; i++)
        {
            fact = multi(i,fact);
        }
        System.out.println("Factorial is  : "+fact);
    }

    static int multi(int a, int b)
    {
        int i;
        int ans=0;
        for(i=0; i<b; i++)
        {
            ans = a + ans;
        }
        return ans;
    }
}
