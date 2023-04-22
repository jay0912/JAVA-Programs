/*P->6, 3.WAP to Accept n number of array and 
now, take a number and check wether numbetr is present the list of array or not by using linear search.*/

import java.util.*;

public class ArraySearch 
{
    public static void main(String[] args) 
    {
        int a[],n,x,i;
        String msg = "not found";
        Scanner sc = new Scanner(System.in);

        //Get array size
        System.out.print("Enter the size of array : ");
        n = sc.nextInt();
        a = new int[n];

        //get array element
        for(i=0; i<a.length; i++)
        {
            System.out.print("Enter "+i+" element:");
            a[i] = sc.nextInt();
        }

        //Enter element to search in array
        System.out.print("Enter the number to seach in array : ");
        x = sc.nextInt();

        //linear search
        for(i=0; i<a.length; i++)
        {
            if(a[i]==x)
            {
                msg = "found at "+(i+1);
                break;
            }
        }
        System.out.println("Element "+msg+" place");
    }
}
