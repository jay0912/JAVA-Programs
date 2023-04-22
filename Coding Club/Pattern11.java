//wap to print following pattern using loop.

import java.util.Scanner;

public class Pattern11
{
     public static void main(String[] args)
        {
            int rows,i,j,k;
            Scanner sc = new Scanner(System.in);
 
            System.out.print("Enter the number of rows : ");
            rows = sc.nextInt();
             
            for (i=1; i<= rows ; i++)
            {
                for (j = i; j < rows ; j++) 
                {
                    System.out.print(" ");
                }   
                for (k = 1; k <= (2*i -1) ;k++) 
                {
                    if( k==1 || i == rows || k==(2*i-1)) 
                    {
                        System.out.print("*");
                    }
                    else 
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
            sc.close();
        }
    }