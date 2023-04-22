//P-2 -> 3.WAP to convert temperature Fahrenheit to Celsius.

import java.util.Scanner;

public class FarhrenheitToCelsius
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter temperature in Fahrenheit : ");
		float F = sc.nextFloat();

		float C = (F-32)*(9f/5);

		System.out.println(F+" degree Fahrenheit is equal to "+C+" degree Celsius");


	}
}