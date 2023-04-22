//WAP to find Power of number without using multiple and recursion.

import java.util.*;

public class Code3 
{
    public static void main(String[] args) 
    {
        int number,power;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number : ");
        number = sc.nextInt();

        System.out.print("Enter Power :");
        power = sc.nextInt();

        int ans=1;
        while(power>0)
        {
            ans = pow(ans, number);
            power--; 
        }

        System.out.println("Power of the number : "+ans);
    }

    static int pow(int a, int b)
    {
        int sum=0;
        while(b>0)
        {
            sum = sum + a;
            b--;
        }
        return sum;
    }
}
