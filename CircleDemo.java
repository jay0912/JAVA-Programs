//P->8, 1.WAP to create cricle class with area and perimeter function to find area and perimeter of circle.

import java.util.*;

public class CircleDemo 
{
    public static void main(String[] args) 
    {
        Circle c = new Circle();
        
        c.getCircleRadius();
        c.Area();
        c.Perimeter();
        c.displayCircleAreaPerimeter();
    }
}

class Circle
{
    //declare variable 
    double raduis;
    double perimeter;
    double area;
    final double pi = 3.14;
    Scanner sc = new Scanner(System.in);

    //get raduis 
    void getCircleRadius()
    {
        System.out.print("Enter the raduis of circle : ");
        raduis = sc.nextDouble();
    }

    //find area
    void Area()
    {
        area = 2 * raduis * raduis;
    }

    //find perimeter 
    void Perimeter()
    {
        perimeter = 2 * pi * raduis;
    }

    //display
    void displayCircleAreaPerimeter()
    {
        System.out.println("Area of circle is : "+area);
        System.out.println("Perimeter of circle is : "+perimeter);
    }
}