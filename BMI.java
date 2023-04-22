//P2 -> 6.WAp To Calculate Body index mass.

import java.util.Scanner;

public class BMI
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter weight in pound : ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in inches : ");
        double height = sc.nextDouble();

        double weightKg = weight * 0.45359237;
        double heightMeter = height * 0.0254;

        double BMI = weightKg / ( heightMeter * heightMeter);

        System.out.print("Body Index Mass is : "+BMI);
    }
}