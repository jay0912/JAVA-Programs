import java.util.Scanner;

//P-2, 4.WAP to find percentage

public class Percentage 
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

        total = maths+physics+chemistry+english+computer;

        System.out.println("Total of Subjects is : "+total);

        percentage = (total*100)/500;

        System.out.println("percentage of Subjects is : "+percentage);


    }
}
