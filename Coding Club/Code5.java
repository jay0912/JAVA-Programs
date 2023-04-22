//WAP to find prime number between two numbers using only do while loop.
//wrong
import java.util.*;

public class Code5 
{
    public static void main(String[] args) 
    {
        int l1,u1,x,y,i;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Lowwer Bound : ");
        l1 = sc.nextInt();
        System.out.print("Enter Upper Bound : ");
        u1 = sc.nextInt();

        x=l1; 
        y=u1;

        do
        {
            i=2;
            do
            {
                if(x%i == 0)
                {
                    break;
                }
                i++;

            }while(i <= x/2);

            if(i == (x/2)+1 )
            {
                System.out.println(x);
            }
            x++;

        }while(x <= y);
    }    
}
