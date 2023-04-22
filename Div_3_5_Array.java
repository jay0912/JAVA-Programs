//P->6, 2.WAP to display sum of all the n array element which is divisible by either 3 or 5.

import java.util.*;

public class Div_3_5_Array 
{
    public static void main(String[] args) 
    {
        int a[],i,n,sum=0;
        Scanner sc = new Scanner(System.in);
        
        //get array size
        System.out.print("Entee the size of array : ");
        n = sc.nextInt();
        a = new int[n];

        //get array element
        
        for(i=0; i<a.length; i++)
        {
            System.out.print("Enter "+i+" element:");
            a[i] = sc.nextInt();

            //Add Number which is divisible by 3 or 5
            if(a[i]%3==0 || a[i]%5==0)
            {
                sum += a[i];
            }
        }
        System.out.println("Sum is : "+sum);
    }
}
