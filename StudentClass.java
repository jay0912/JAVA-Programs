//P->7, 4.WAp to create class name student using getter setter.

import java.util.*;


public class StudentClass 
{
    //main method
    public static void main(String[] args) 
    {
        Student st = new Student();
        
        //call method
        st.getStudentDetails();
        st.displayStudentDetails();
    }
}

class Student
{
    //declare variable
    int Enrollment_No;
    int Semester;
    String Name;
    double CPI;
    double SPI;

    //get details
    void getStudentDetails()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Enrollment number : ");
        Enrollment_No = sc.nextInt();
        System.out.print("Enter Student Semester : ");
        Semester = sc.nextInt();
        System.out.print("Enter Student Name : ");
        Name = sc.next();
        System.out.print("Enter Studnet CPI : ");
        CPI = sc.nextDouble();
        System.out.print("Enter Student SPI : ");
        SPI = sc.nextDouble();
    }

    //display details 
    void displayStudentDetails()
    {
        System.out.println("\nStudent Details :- ");
        System.out.println("Enrollment_No :  "+Enrollment_No);
        System.out.println("Semester      :  "+Semester);
        System.out.println("Name          :  "+Name);
        System.out.println("CPI           :  "+CPI);
        System.out.println("SPI           :  "+SPI);
    }
}
