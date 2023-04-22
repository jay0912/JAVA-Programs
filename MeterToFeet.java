//P2 -> 5.WAP to convert Number meter to feet 

import java.util.Scanner;

public class MeterToFeet 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number in meter : ");
        double meter = sc.nextDouble();

        double feet = meter*3.281;

        System.out.println(meter+" meter is equal to "+feet+" feet");
    }
}
