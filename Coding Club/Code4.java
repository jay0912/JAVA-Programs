//WAP to find substraction of two number

import java.util.Scanner;

public class Code4 
{
    public static void main(String[] args) 
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        a = sc.nextInt();

        System.out.print("Enter Second Number : ");
        b = sc.nextInt();

        c = a + (~b) +1;
        
        System.out.println("Substraction of "+a+" And "+b+" is : "+c);
    }    
}
