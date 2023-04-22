//P->3, 5.WAP to find out largest number from given 3 number using conditional oprater.

import java.util.Scanner;

public class LargestConditional 
{
    public static void main(String[] args) 
    {
        int num1,num2,num3,largest;
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Enter first number: ");
        num1 = sc.nextInt();

        System.out.printf("\nEnter second number: ");
        num2 = sc.nextInt();

        System.out.printf("\nEnter third number: ");
        num3 = sc.nextInt();

        largest = (num1>num2)? (num1>num3? num1:num3) : (num2>num3? num2:num3);

        System.out.printf("\n%d is the largest number.",largest);
    }   
}
