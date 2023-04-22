import java.util.Scanner;

public class Pract11_4 
{
    public static void main(String[] args) 
    {
        String str;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entert String : ");
        str = sc.next();

        String a[] = str.split("\\.");

        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }
        sc.close();
    }
}
