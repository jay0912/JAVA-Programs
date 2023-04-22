//write a java program to display transpose of matrix.

import java.util.Scanner;

//main method
public class TransposeMatrix 
{
    //main method
    public static void main(String[] args) 
    {
        //declare varible
        int n,row,column,a[][],transpose[][],i,j;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row of matrix : ");
        row = sc.nextInt();
        System.out.print("Enter the column of matrix : ");
        column = sc.nextInt();
        a = new int[row][column];

        for(i=0; i<row; i++)
        {
            for(j=0; j<column; j++)
            {
                System.out.print("Enter the element at a["+(i+1)+"]: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("Matrix before transpose :- \n");
        for(i=0; i<row; i++)
        {
            for(j=0; j<column; j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

        transpose = new int[column][row];
        for(i=0; i<row; i++)
        {
            for(j=0; j<column; j++)
            {
                transpose[j][i] = a[i][j];
            }
        }

        System.out.print("\nMatrix After Transpose :-\n");
        for(i=0; i<column; i++)
        {
            for(j=0; j<row; j++)
            {
                System.out.print(transpose[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
