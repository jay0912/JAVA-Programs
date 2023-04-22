//WAP to find the distance between two numbers.

import java.util.*;

public class Code7 
{
    public static void main(String[] args) 
    {
        int a,b,i=1,j=1,k,l;
        int binary1=0;
        int binary2=0;
        int reverse1;
        int reverse2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        a = sc.nextInt();

        System.out.print("Enter Second Number : ");
        b = sc.nextInt();

        while(a!=0)
        {
            binary1 = binary1 + (a%2)*i;
            a = a / 2;
            i = i*10;
        }
        while(b!=0)
        {
            binary2 = binary2 + (b%2)*j;
            b = b / 2;
            j = j*10;
        }

        int x=0;
        for(k=0; k<binary1; k++)
        {
            int digit = binary1 % 10;
            binary1=binary1/10;
            x++;
        }

        int y=0;
        for(l=0; l<binary2; l++)
        {
            int digit = binary2 % 10;
            binary2=binary2/10;
            y++;
        }

        int z = y-x;

        System.out.println("Distance betweens the numbers : "+z);


    }
}
