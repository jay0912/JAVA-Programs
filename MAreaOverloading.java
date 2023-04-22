//P->5, 5.WAP thst calculate the area of circle , trianlge and sqaure usind method overloadding. side float??

import java.util.*;

public class MAreaOverloading 
{
    //main method
    public static void main(String[] args) 
    {
        int ch;
        double raduis,base,altitude;
        float side;

        Scanner sc = new Scanner (System.in);

        MAreaOverloading ao = new MAreaOverloading();

        //get details
        System.out.println("Opratins:- \n1.Area _of_cirlce \n2.Area_0f_triangle \n3.Area_of_Squre \nEnter your choice:");
        ch = sc.nextInt();

        switch(ch)
        {
            case 1:
            System.out.println("Enter the raduis : ");
            raduis = sc.nextDouble();
            ao.area(raduis);
            break; 

            case 2:
            System.out.println("Enter the base : ");
            base = sc.nextDouble();
            System.out.println("enter the altitude : ");
            altitude = sc.nextDouble();
            ao.area(base,altitude);
            break;

            case 3:
            System.out.println("Enter the side : ");
            side =sc.nextFloat();
            ao.area(side);
            break;
        }
    }

    static void area(double raduis)
    {
        double aoc;
        aoc = 3.14*raduis*raduis;
        System.out.println("Area of Circle is : "+aoc);
    }

    static void area(double base, double altitude)
    {
        double aot;
        aot = 0.5*base*altitude;
        System.out.println("Area of Triangle : "+aot);
    } 
    static void area(float side)
    {
        double aos;
        aos = side*side;
        System.out.println("Area of Square : "+aos);
    }
}
