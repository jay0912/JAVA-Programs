//P_>3, 7.WAP to cheak triangle is isoscele,equliteral,scalene or right angle triangle.

import java.util.Scanner;

public class CheakTriangle 
{
    public static void main(String[] args) 
    {
        int a,b,c;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the triangle side a:");
        a = sc.nextInt();

        System.out.println("Enter the triangle side b:");
        b = sc.nextInt();

        System.out.println("Enter the triangle side c:");
        c = sc.nextInt();

        if(a==b || b==c || c==a)
        {
            System.out.println("Triangle is isosceles.");
        }
        else if(a==b && b==c)
        {
            System.out.println("Triangle is equaliteal.");
        }
        else if(a*a+b*b==c*c || b*b+c*c==a*a || a*a+c*c==b*b)
        {
            System.out.println("triangle is right angle.");
        }
        else 
        {
            System.out.println("Triangle is saclene.");
        }
    }
}
