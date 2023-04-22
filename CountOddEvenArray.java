//P->6, 1.WAP to count odd and even number from array of n numbers.

import java.util.*;

public class CountOddEvenArray 
{
    public static void main(String[] args) 
    {
        int arr[],i,n,odd=0,even=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array : ");
        n = sc.nextInt();

        arr = new int[n];
        System.out.println("\nEnter the array elements:");

        //get array element
        for(i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        //check number of odd even
        for(i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
                even++;
            else
                odd++;    
        }

        //result
        System.out.println("\nTotal EVEN number is : "+even);
        System.out.println("TOtal ODD number is : "+odd);
    }
}
