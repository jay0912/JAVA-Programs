import java.util.Scanner;

public class VaildTriangle
{
	public static void main(String[] args) 
	{
		int a,b,c;
		int triangle;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the anglr a: ");
		a = sc.nextInt();

		System.out.println("Enter the anglr b: ");
		b = sc.nextInt();

		System.out.println("Enter the anglr c: ");
		c = sc.nextInt();

		triangle = a+b+c;

		if(triangle==180)
		{
			System.out.println("Triangle is vaild");
		}
		else
		{
			System.out.println("Triangle is not vaild");
		}
	}
}