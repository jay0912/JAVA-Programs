//P->7, 3.WAP to create class name employee using getter detter.

import java.util.*;

public class EmployeeClass 
{
    //main method
    public static void main(String[] args) 
    {
        Employee e = new Employee();

        //Call method
        e.getEmployeeDetails();
        e.displayEmployeeDetails();
    }    
}

class Employee
{
    //declare variable
    int EmployeeId;
    int Age;
    int Salary;
    String EmployeeName;
    String Designation;
    Scanner sc = new Scanner(System.in);

    //get details
    void getEmployeeDetails()
    {
        System.out.print("Enter Employee ID : ");
        EmployeeId = sc.nextInt();
        System.out.print("Enter Employee Name : ");
        EmployeeName = sc.next();
        System.out.print("Enter the Employee Designation : ");
        Designation = sc.next();
        System.out.print("Enter the Employee Age : ");
        Age = sc.nextInt();
        System.out.print("Enter the Employee Salary : ");
        Salary = sc.nextInt();
    }

    //Display Details
    void displayEmployeeDetails()
    {
        System.out.println("\nEmployee Details :- ");
        System.out.println("ID          :   "+EmployeeId);
        System.out.println("Name        :   "+EmployeeName);
        System.out.println("Designation :   "+Designation);
        System.out.println("Age         :   "+Age);
        System.out.println("Salary      :   "+Salary);
    }

}
