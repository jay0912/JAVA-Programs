//P->6, 8.WAP to store number in nXn matrix in 2 dimention array.find the sum of each row of numbers and each column of numbrs of the matrix

import java.util.*;

public class RowColSum 
{
    public static void main(String[] args) 
    {
        int a[][],row,column,i,j,sumrow[],sumcol[]; 
        Scanner sc = new Scanner(System.in);
        
        //getting size of matrix
        System.out.print("Enter the numbers of row in 2D array : ");
        row = sc.nextInt();
        System.out.print("Enter the numbers of column in 2D array : ");
        column = sc.nextInt();
        a = new int[row][column];
        sumrow = new int[row];
        sumcol = new int[column];
        
        //getting array element 
        System.out.println("\nEnter the elements of matrix : ");
        for(i=0; i<row; i++)
        {
            for(j=0; j<column; j++)
            {
                System.out.print("Enter the element at a["+(i+1)+"]["+(j+1)+"] : ");
                a[i][j] = sc.nextInt(); 
            }
        }

        for(i=0; i<row; i++)
        {
            sumrow[i] = 0;
            sumcol[i] = 0; 
            for(j=0; j<column; j++)
            {
                sumrow[i] = sumrow[i] + a[i][j];
                sumcol[i] = sumcol[i] + a[j][i];
            }
        }

        //dispaly array
        for(i=0; i<=row; i++)
        {
            for(j=0; j<=column; j++)
            {
                if(i==row && j==column)
                {
                    System.out.println();
                    break;
                }
                if(j==column)
                {
                    System.out.print(sumrow[i]+"\t");
                }
                else if(i==row)
                {
                    System.out.print(sumcol[j]+"\t");
                }
                else 
                {
                    System.out.print(a[i][j]+"\t");
                }
            
               

            }
            System.out.println();
        }
    }    
}
