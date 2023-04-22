//WAP to find min ,max, and avg of n given number withput using structure,function,array,pointer.

import java.util.Scanner;


public class Code10 
{
    public static void main(String[] args) 
    {
        int n,x,i,min=0,max=0,sum=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Range of the number : ");
        n =sc.nextInt();

        System.out.println("========Enter N Numbers========");
        for(i=0; i<n; i++)
        {
            System.out.print("Enter Number("+(i+1)+") : ");
            x=sc.nextInt();

            sum = sum + x;

            if(i==0)
            {
                max=x;
                min=x;
            }
            else
            {
                if(x>max)
                {
                    max=x;
                }
                else if(x<min)
                {
                    min=x;
                }
            }

        }

        System.out.println("\nMIN Number : "+min+"\nMAX Number : "+max+"\nAVERAGE of Number : "+(sum/n));
    }
}
