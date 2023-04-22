//P->3, 6.WAP to make simple claculator using switch case.
 
import java.util.Scanner;

public class SimpleCalculator 
{
    public static void main(String[] args) 
    {
        double n1,n2,result;
        char operator;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        n1 = sc.nextDouble();

        System.out.println("Enter second number: ");
        n2 = sc.nextDouble();

        System.out.print("Enter opration to be perform (+,-,*,/) : ");
        operator = sc.next().charAt(0);

        switch(operator)
        {
            case '+':
                result = n1 + n2;
                break;

            case '-':
                result = n1 - n2;
                break;
            
            case '*':
                result = n1 * n2;
                break;
                
            case '/':
                result = n1 / n2;
                break;
                
            default:
                System.out.println("Enter vaild opration.");   
                return; 
        }

        System.out.printf(n1+" "+ operator+" "+ n2+" = "+result);
    }    
}
