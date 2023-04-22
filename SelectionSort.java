/*WAP to accept n  number of array and pass this array to the function name selection sort
and arranged in asending ordered by using selection sort*/

import java.util.*;

public class SelectionSort 
{
    public static void main(String[] args) 
    {
        int a[],n,i,j,temp;
        Scanner sc = new Scanner(System.in);
        
        //getting array size
        System.out.print("Enter the size of array : ");
        n = sc.nextInt();
        a = new int[n];

        //Getting element of array 
        System.out.println("\nEnter the array element to sort : ");
        for(i=0; i<a.length; i++)
        {
            System.out.print("Enter element at a["+(i+1)+"] : ");
            a[i] = sc.nextInt(); 
        }

        //selection sort 
        for(i=0; i<a.length-1; i++)
        {
            for(j=i+1; j<a.length; j++)
            {
                if(a[i]>a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        //display sorted array
        System.out.println("\nSorted array :-");
        for(i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
