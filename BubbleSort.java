/*P->6, 4.WAP to Accept n number of array and pass to a function name bubble sort. 
arrangr all the numbers in array using bubble sort.*/

import java.util.*;

public class BubbleSort 
{
    public static void main(String[] args) 
    {
        int a[],n,i,j,temp;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        n = sc.nextInt();
        a = new int[n];

        //getting array element
        System.out.println();
        for(i=0; i<a.length; i++)
        {
            System.out.print("Enter element at a["+(i+1)+"] : ");
            a[i] = sc.nextInt();
        }

        //bubble sort
        System.out.println("\nAfter Bubble sort : ");
        for(i=1; i<a.length; i++)
        {
            for(j=0; j<a.length-i; j++)
            {
                if(a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        
        //display after bubble sort
        for(i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
