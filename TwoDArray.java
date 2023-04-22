//P->6, 5.WAP to read value of two dimention array and print them in matrix form.

import java.util.*;

public class TwoDArray 
{
    public static void main(String[] args) 
    {
        int a[][],row,column,i,j;
        Scanner sc = new Scanner(System.in);

        //get number of row and column
        System.out.print("Enter the number of rows in 2D array : ");
        row = sc.nextInt();
        System.out.print("Enter the number of column in 2D array : ");
        column = sc.nextInt();
        a = new int[row][column];

        //gettting array element of 2Darray
        System.out.println();
        for(i=0; i<row; i++)
        {
            for(j=0; j<column; j++)
            {
                System.out.print("Enter element at a ["+(i+1)+"]["+(j+1)+"] : ");
                a[i][j] = sc.nextInt();
            }
        }

        //Dispslay array
        System.out.println("\nArray in matrix form : ");
        for(i=0; i<row; i++)
        {
            for(j=0; j<column; j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
