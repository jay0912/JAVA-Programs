import java.util.Scanner;

public class AdditionOnTwoNumber 
{
     public static void main(String[] args)
    {
        int n1,n2,sum;
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the first number");
        n1 = sc.nextInt();

        System.out.println("Enter the second number");
        n2 = sc.nextInt();

        sum = n1+n2;

        System.out.println("Sum is = "+sum);
    }
        
        
}
