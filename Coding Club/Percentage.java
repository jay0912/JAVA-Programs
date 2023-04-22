import java.util.Scanner;

public class Percentage
{
    public static void main(String[] args)
    {
        System.out.println("Enter the marks of five subject to calculate percentage");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the mark of subject 1 : ");
        int sub1 = sc.nextInt();

        System.out.println("Enter the mark of subject 2 : ");
        int sub2 = sc.nextInt();
        
        System.out.println("Enter the mark of subject 3 : ");
        int sub3 = sc.nextInt();

        System.out.println("Enter the mark of subject 4 : ");
        int sub4 = sc.nextInt();

        System.out.println("Enter the mark of subject 5 : ");
        int sub5 = sc.nextInt();

        int sum = sub1+sub2+sub3+sub4+sub5;

        System.out.println("Total marks : ");
        System.out.print(sum);

        float percentage = (sum/500)*100;

        System.out.println("Percentage is : ");
        System.out.print(percentage);

    }
}