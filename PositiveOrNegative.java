//P->3, 1.WAP to cheak wether number is positive or negative.

import java.util.Scanner;

public class PositiveOrNegative
{
    public static void main(String[] args) {
        
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        number = sc.nextInt();

        if(number>0)
        {
            System.out.println(number+" Number is positive.");
        }
        else if(number<0)
        {
            System.out.println(number+" Number is negative.");
        }
        else
        {
            System.out.println("Number is niether Positive nor Negative.");
        }
    }
}