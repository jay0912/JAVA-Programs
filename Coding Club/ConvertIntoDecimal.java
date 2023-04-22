//write a java programm to convrt any number into decimal.

import java.util.Scanner;

public class ConvertIntoDecimal 
{
    public static void main(String[] args) 
    {
        int n,base,i=0;
        double Number=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number to convert into decimal : ");
        n = sc.nextInt();

        System.out.print("Enter the number base : ");
        base = sc.nextInt();

        while(n != 0)
        {
            Number = (Number) + ((n % 10) * Math.pow(base, i));
            ++i;
            n = n / 10;
        }

        System.out.print(" Decimal is : "+Number);
    }    
}
