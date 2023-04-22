//P->5, 6.find the GCD of two number.

import java.util.*;

//maii class
public class Gcd 
{

    //main method
    public static void main(String[] args) 
    {
        int n1,n2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First number : ");
        n1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        n2 = sc.nextInt();

        //call method
        Gcd2(n1, n2); 
    }

    //gcd method
    static void Gcd2(int n1, int n2)
    {
        int i;
        int gcd1 =1;

        for(i=1; i<=n1 && i<=n2; i++)
        {
            if(n1%i==0 && n2%i==0)
            {
                gcd1 = i;
            }
        }
        System.out.println("GCD of "+n1+" And "+n2+" is : "+gcd1);
    }
    
}
