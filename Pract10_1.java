//P->10, 1.create java class memeber and create another java class manager and empolyee using inherits.

import java.util.Scanner;

//Class Member
class Memeber
{
    //Declare variable
    String name;
    int age;
    int phoneNumber;
    String address;
    double salary;

    //salary method
    void printSalary()
    {
        System.out.println("Salary             : "+salary);
    }
}

//Empolyee Class
class Empolyee1 extends Memeber
{
    //declare varible
    String specialization;

    //details method
    void getEmployeeDetails1()
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("\nEnter the Empolyee Details :- ");
        System.out.print("Enter Empolyee Name : ");
        name = sc.next();
        System.out.print("Enter Age : ");
        age = sc.nextInt();
        System.out.print("Enter Phone Number : ");
        phoneNumber = sc.nextInt();
        System.out.print("Enter Address : ");
        address = sc.next();
        System.out.print("Enter Salary : ");
        salary = sc.nextDouble();
        System.out.print("Enter Specialization : ");
        specialization = sc.next();
    }

    //display Method
    void displayEmpolyee1()
    {
        System.out.println("\n========Empolyee Details=======");
        System.out.println("Employee Name        : "+name);
        System.out.println("Employee Age         : "+age);
        System.out.println("Employee Number      : "+phoneNumber);
        System.out.println("Employee Address     : "+address);
        printSalary();
        System.out.println("Specilization        : "+specialization);
    }
}

//Manager class
class Manager extends Memeber
{
    //declare variable
    String department;

    //Manager details method
    void getManagerDetails()
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("\nEnter the Manager Details :- ");
        System.out.print("Enter Manager Name : ");
        name = sc.next();
        System.out.print("Enter Age : ");
        age = sc.nextInt();
        System.out.print("Enter Phone Number : ");
        phoneNumber = sc.nextInt();
        System.out.print("Enter Address : ");
        address = sc.next();
        System.out.print("Enter Salary : ");
        salary = sc.nextDouble();
        System.out.print("Enter Department : ");
        department = sc.next();
    }

    //display Method
    void displayManager()
    {
        System.out.println("\n========Manager Details=======");
        System.out.println("Manager Name       : "+name);
        System.out.println("Manager Age        : "+age);
        System.out.println("Manager Number     : "+phoneNumber);
        System.out.println("Manager Address    : "+address);
        printSalary();
        System.out.println("Manager Department : "+department);
    }

}

//Main Class
public class Pract10_1
{
    //main method
    public static void main(String[] args) 
    {
        //object Intailization
        Empolyee1 e = new Empolyee1();
        Manager m =new Manager();

        //Call method
        e.getEmployeeDetails1();
        m.getManagerDetails();

        e.displayEmpolyee1();
        m.displayManager();
    }
}
