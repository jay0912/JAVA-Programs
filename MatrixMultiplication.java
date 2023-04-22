//P->6, 6.WAp to read two matrix size of nXn and perform multiplication of two matrix and store result in third matrix.

import java.util.*;

public class MatrixMultiplication 
{
    public static void main(String[] args) 
    {
        int a[][],b[][],c[][],i,j,k,row,column;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the numbers of row in matrix : ");
        row = sc.nextInt();
        System.out.print("Enter the numbers of column  in matrix : ");
        column = sc.nextInt();

        a = new int[row][column];
        b = new int[row][column];
        c = new int[row][column];

        //getting array elements of matrix 1 
        System.out.println("\nEnter the elements of 1st matrix : ");
        for(i=0; i<row; i++)
        {
            for(j=0; j<column; j++)
            {
                System.out.print("Enter the element at a["+(i+1)+"]["+(j+1)+"] : ");
                a[i][j] = sc.nextInt();
            }
        }

        //getting array elements of matrix 2 
        System.out.println("\nEnter the elements of 2nd matrix : ");
        for(i=0; i<row; i++)
        {
            for(j=0; j<column; j++)
            {
                System.out.print("Enter the element at a["+(i+1)+"]["+(j+1)+"] : ");
                b[i][j] = sc.nextInt();
            }
        }

        //adding in third array
        for(i=0; i<row; i++)
        {
            for(j=0; j<row; j++)
            {
                c[i][j]=0;
                for(k=0; k<column; k++)
                {
                    c[i][j] = c[i][j] + ((a[i][k])*(b[k][i]));
                }
            }
        }

        //Display matrix
        System.out.println("\nArray in matrix form : ");
        for(i=0; i<row; i++)
        {
            for(j=0; j<column; j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
    }    
}
