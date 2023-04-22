//P->5, 1.WAP to calculate simple intrest using method.

import java.util.*;

public class SimpleIntrest 
{
    //method
    static void calculateIntrest(double princliple, double rate_of_intrest, double number_of_years)
    {
        double simpleintrest = princliple * rate_of_intrest *number_of_years;
        System.out.println("Simple intrest is : "+simpleintrest);
    }
    public static void main(String[] args) 
    {
        double princliple, rate_of_intrest, number_of_years;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle : ");
        princliple = sc.nextDouble();
        System.out.print("Enter rate of intrest : ");
        rate_of_intrest = sc.nextDouble();
        System.out.print("Enter number of years : ");
        number_of_years = sc.nextDouble();

        //method call 
        calculateIntrest(princliple,rate_of_intrest,number_of_years);
    }
}
