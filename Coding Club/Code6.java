//WAP to convert decimal number into binary.

import java.util.*;

public class Code6
{
    public static void main(String[] args) 
    {
        int decimal, binary=0;
        int i=1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to convert in binary : ");
        decimal = sc.nextInt();

        while(decimal!=0)
        {
            binary = binary + (decimal%2)*i;
            decimal = decimal / 2;
            i = i*10;
        }

        System.out.println(decimal+" decimal number converted binary number is : "+binary);
    }
}

