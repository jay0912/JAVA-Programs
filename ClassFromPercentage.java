//P->3, 4.WAP devide class from percentage.

import java.util.Scanner;

public class ClassFromPercentage 
{
    public static void main(String[] args) 
    {
        int maths,physics,chemistry,english,computer;
        double total,percentage;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the marks out of 100 of subjects");

        System.out.println("Enter the marks of maths:");
        maths = sc.nextInt();
        System.out.println("Enter the marks of physics:");
        physics = sc.nextInt();
        System.out.println("Enter the marks of chemistry:");
        chemistry = sc.nextInt();
        System.out.println("Enter the marks of english:");
        english = sc.nextInt();
        System.out.println("Enter the marks of computer:");
        computer = sc.nextInt();

        total = maths + physics + chemistry + english + computer;

        System.out.println("Total of Subjects is : "+total);

        percentage = (total*100)/500;

        System.out.println("percentage of Subjects is : "+percentage);

        System.out.println("The studenet class is : ");
        if(percentage>=70)
        {
            System.out.print("Distinction");
        }
        else if(percentage>=60 && percentage<70)
        {
            System.out.print("First Class");
        }
        else if(percentage>=45 && percentage<60)
        {
            System.out.print("Second Class");
        }
        else if(percentage>=35 && percentage<45)
        {
            System.out.print("Pass");
        }
        else
        {
            System.out.print("Fail");
        }
    }    
}
