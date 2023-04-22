//wap to reverse the array element.

import java.util.*;

public class ReverseArray 
{
   public static void main(String[] args) 
   {
        int a[],n,i,j,temp;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array : ");
        n = sc.nextInt();
        a = new int[n];

        System.out.print("\nEnter the array elements :-\n");
        for(i=0; i<n; i++)
        {
            System.out.print("Enter element at a["+i+"] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("\nReverse array : \n");
        for(j=0; j<a.length/2; j++)
        {
            temp = a[j];
            a[j] = a[a.length - j - 1];
            a[a.length - j - 1] = temp;
        }

        for(int k=0; k<a.length; k++)
        {
            System.out.print("a["+k+"] : "+a[k]+"\n");
        }

    
        sc.close();;
   } 
}
