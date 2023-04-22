//P->10, 2.
import java.util.Scanner;
import java.lang.Math;

//MyPoint Class
class MyPoint
{
    //Declare Variable
    double x;
    double y;
    Scanner sc = new Scanner(System.in);

    //Defualt Constructor
    MyPoint()
    {
        x = 0;
        y = 0;
    }

    //Parametrized Constructor
    MyPoint(double x, double y)
    {
        this.x = x; 
        this.y = y;
    }

    //Get co-ordinates method
    void getter()
    {
        System.out.print("X = "+x+" Y = "+y);
    }

    //Distance method
    void distance(double x, double y)
    {
        double distance = Math.sqrt( (this.x - x)*(this.x - x) + (this.y - y)*(this.y - y) );
        System.out.println("Distance is = "+distance);
    }

    //Distance method
    void distance(MyPoint mp2)
    {
        double distance = Math.sqrt( (x - mp2.x)*(x - mp2.x) + (y - mp2.y)*(y - mp2.y) );
        System.out.println("Distance is = "+distance);
    }

}

//Class ThreeDPoints
class ThreeDPoints extends MyPoint
{
    //Declare Variable
    double z;

    //default comstructor
    ThreeDPoints()
    {
        super(0,0);
        z = 0;
    }

    //Parametrized constructor
    ThreeDPoints(double x, double y, double z)
    {
        super(x,y);
        this.z = z;
    }

    //Distance method
    void distance(double x, double y, double z)
    {
        double distance = Math.pow(( Math.pow( this.x - x, 2) + Math.pow( this.y - y, 2) + Math.pow( this.z - z, 2) * 1.0 ) , 0.5);
        System.out.println("Distance is = "+distance);
    }

    //Dsitance method
    void distance(ThreeDPoints mp2)
    {
        double distance = Math.pow(( Math.pow( x - tp2.x, 2) + Math.pow( y - tp2.y, 2) + Math.pow( z - tp2.z, 2) * 1.0 ), 0.5);
        System.out.println("Distance is = "+distance);
    }

}

//Main Class
public class Pract10_2 
{
    //Main Method
    public static void main(String[] args) 
    {
        ThreeDPoints tp1 = new ThreeDPoints();
        ThreeDPoints tp2 = new ThreeDPoints(10, 30, 25.5);

        tp1.distance(1, 1, 1);
        tp1.distance(tp2);

    }
}
