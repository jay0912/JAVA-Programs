import java.util.Scanner;

public class code1 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number to cheak : ");
        n = sc.nextInt();

        while(n<0)
        {
            n = n - 2;
        }

        if(n==0)
        {
            System.out.println(n+" Is EVEN Number. ");
        }
        else
        {
            System.out.println(n+" Is ODD Number. ");
        }
    }
}
