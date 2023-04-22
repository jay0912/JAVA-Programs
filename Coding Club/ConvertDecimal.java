//Write a java program to convert decimal number to any from.

import java.util.Scanner;

public class ConvertDecimal 
{
    public static void main(String[] args) 
    {
        int decimal, convertnum, i=1, Number=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Decimal Number : ");
        decimal = sc.nextInt();

        System.out.print("Enter the number to convert decimal into any number : ");
        convertnum = sc.nextInt();

        while(decimal != 0)
        {
            Number = Number + (decimal % convertnum)*i;
            decimal = decimal / convertnum;
            i = i*10;
        }

        System.out.println("Converted Decimal Numnber is : "+Number);
    }
}
