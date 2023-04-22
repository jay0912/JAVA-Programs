//wap to find a ASCII value of character.

import java.util.Scanner;

public class ASCII 
{
    public static void main(String[] args) 
    {
        char ch;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Character to find ASCII : ");
        ch = sc.next().charAt(0);

        int ascii = ch;

        System.out.println("The ASCHII value of "+ch+" is : "+ascii);
    }
}
