//P->9, 1.WAP to create two class student and result.also desplay result of student

import java.util.*;

//Student Class
class Student
{
    //Declare variable 
    int Enrollmentno;
    String Sname, Course;
     

    //gert student details
    void getStudentDetails()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the Students Details :- ");
        System.out.print("\nEnter Student Enrollment number : ");
        Enrollmentno = sc.nextInt();
        System.out.print("Enter Student Name : ");
        Sname = sc.next();
        System.out.print("Enter Student's Course : ");
        Course = sc.next();
    }
}

//Result class
class Result
{
    //declare result
    int Enrollmentno;
    int sem;
    double SPI;
    double CPI;
    

    //method for get details of results
    void getResultDetails()
    {
        Scanner sc = new Scanner(System.in); 

        System.out.print("\nEnter the Results Details :- ");
        System.out.print("\nEnter the Enrollment no. : ");
        Enrollmentno = sc.nextInt();
        System.out.print("Enter the Semester : ");
        sem = sc.nextInt();
        System.out.print("Enter SPI : ");
        SPI = sc.nextDouble();
        System.out.print("Enter CPI : ");
        CPI =  sc.nextDouble();
    }

    //method for display reults
    void displayResult(Student s)
    {
        System.out.println("Students Results :- ");
        System.out.println("Enrollment No : "+Enrollmentno);
        System.out.println("Name : "+s.Sname);
        System.out.println("Course : "+s.Course);
        System.out.println("Semster : "+sem);
        System.out.println("SPI : "+SPI);
        System.out.println("CPI : "+CPI);
    }
}

//Main Class
public class Pract9_1 
{
    //Main Method
    public static void main(String[] args) 
    {
        int n,i;
        int Enrollmentno;
        boolean found = false;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of the students : ");
        n  = sc.nextInt();

        //Object Intailization
        Student s[] = new Student[n];
        Result r[] = new Result[n];

        for(i=0; i<n; i++)
        {
            s[i] = new Student();
            r[i] = new Result();
            s[i].getStudentDetails();
            r[i].getResultDetails();
        }

        System.out.print("\n Enter student enrollment number to search : ");
        Enrollmentno= sc.nextInt();

        //Find the rsukt if student is exist
        for(i=0; i<n; i++)
        {
            if(Enrollmentno == s[i].Enrollmentno)
            {
                found = true;
                break;
            }   
        }

        //Display result
        if(found == true)
        {
            r[i].displayResult(s[i]);
        }
        else
        {
            System.out.println("Not founded!");
        }
    }
}
