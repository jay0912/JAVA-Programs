//WAP to cheak wether year is leap year or not.

import java.util.Scanner;

public class LeapYear
{
	public static void main(String[] args) 
	{
		int year;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the year: ");
		year = sc.nextInt();

		if((year%4==0) && (year%100!=0) || (year%400==0))
		{
			
			System.out.print("Year is leapyear.");
			
		}	
		else
		{
			System.out.print("Year is not leapyear.");
		}
	}
}