//P->3, 8.WAP to calculate telephonebill.

import java.util.Scanner;

public class TelephoneBill 
{
    public static void main(String[] args) 
    {
        int totalcalls;
        double bill;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total numbers of calls:");
        totalcalls = sc.nextInt();

        if(totalcalls<=100)
        {
            bill = 200;
        }
        else if(totalcalls>100 && totalcalls<=150)
        {
            bill = 200 + (0.60*(totalcalls-100));
        }
        else if(totalcalls>150 && totalcalls<=200)
        {
            bill = 200 + (0.60*50) + (0.50*(totalcalls-150));
        }
        else
        {
            bill = 200 + (0.60*50) + (0.50*50) + (0.40*(totalcalls-200));
        }

        System.out.println("Total bill amount is : "+bill);
    }
}
