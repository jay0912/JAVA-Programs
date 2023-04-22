//P->9, 2.Create array of object for student _Detial(Enrollment_no, Name, sem, CPi) class for 5 student, read thier information and print it.

import java.util.*;

//Student class
class Student_Detail
{
    //declare student Variable
    int Enrollment_no,sem;
    double CPI;
    String Name;

    //Get details method
    void getStudentDetails()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Enrollmnet No. : ");
        Enrollment_no = sc.nextInt();
        System.out.print("Enter Student Name : ");
        Name = sc.next();
        System.out.print("Enter Semester : ");
        sem = sc.nextInt();
        System.out.print("Enter CPI : ");
        CPI = sc.nextDouble();
    }

    //display method
    void displayStudentDetails()
    {
        System.out.println("Enrollment No. : "+Enrollment_no);
        System.out.println("Student Name   : "+Name);
        System.out.println("Semester       : "+sem);
        System.out.println("CPI            : "+CPI);
    }
}

//Main Class
public class Pract9_2 
{
    //Main Method
    public static void main(String[] args) 
    {
        //declre variable
        int n,i;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The number of student : ");
        n = sc.nextInt();

        //object Initailization
        Student_Detail s[] = new Student_Detail[n];
        
        //get student details
        for(i=0; i<n; i++)
        {
            s[i] = new Student_Detail();
            System.out.println("\nEnter Student-"+(i+1)+" Details : ");
            s[i].getStudentDetails();
        }
        //Display
        for(i=0; i<n; i++)
        {
            System.out.println("\nStudent-"+(i+1)+" Details :-");
            s[i].displayStudentDetails();
        }
        
    } 
}
