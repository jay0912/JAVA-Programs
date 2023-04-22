/* 
P->8, 3.Define class for complex number with real and imaginary part. Describe its constructor,
overload the constructor and instantite its object. Also define addition method to add two complex object.
 */

//---------------code----------------
import java.util.*;

//class complexnumber
class ComplexNumbers
{
    int real, imaginary;
    int totalReal, totalImaginary;
    Scanner sc = new Scanner(System.in);

    //Constructor
    ComplexNumbers(int i)
    {
        System.out.println("\nEnter Complex Number "+i);
        System.out.print("Enter Real : ");
        real = sc.nextInt();
        System.out.print("Enter Imaginary : ");
        imaginary = sc.nextInt();
    }

    //add complexnumber
    void addComplexNumber(ComplexNumbers cn2)
    {
        //add logic
        totalReal = real + cn2.real;
        totalImaginary = imaginary + cn2.imaginary;
    }

    //display method
    void display()
    {
        System.out.println("\nTotal = "+totalReal+" + "+totalImaginary+" i ");
    }
}

 //Main Class
public class AddComplexNumber 
{
    //Main Method
    public static void main(String[] args) 
    {
        //Object Intiatlization
        ComplexNumbers cn1 = new ComplexNumbers(1);
        ComplexNumbers cn2 = new ComplexNumbers(2);

        //call method
        cn1.addComplexNumber(cn2);
        cn1.display();
        
    }
}
