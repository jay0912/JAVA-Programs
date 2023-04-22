//WAP to Sort arraylist.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

//main class
public class Pract12_1 
{
    //main method
    public static void main(String[] args) 
    {
        //define scanner
        Scanner sc = new Scanner(System.in);
        
        //create arraylist of integer numbers.
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //get size of arryaylist
        System.out.print("\nEnter the size of the ArrayList : ");
        int size = sc.nextInt();

        //add element in arraylist
        System.out.println("\nEnter the Elements of ArrayList : ");
        for(int i=0; i<size; i++)
        {
            list.add(sc.nextInt());
        }

        //sort element of arraylist
        Collections.sort(list);

        //display elements of arraylist
        System.out.println("\nSorted List : "+list);
    }
}
