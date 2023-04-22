import java.util.Scanner;

public class CodeFest_1 
{
    public static void main(String[] args) 
    {
        int i;
        Scanner sc = new Scanner(System.in);    

        int no_of_lanes = sc.nextInt();
        
        String[] str = new String[no_of_lanes];
        for(i=0; i<str.length; i++)
        {
            str[i] = sc.next();
        }


        for(i=0; i<str.length; i++)
        {
            char[] ch = new char[str[i].length()];
        }

        for(i=0; i<str.length; i++)
        {
            char ch[i] = str.charAt(i);
        }


        sc.close();
    }
}


// System.out.print("\nEnter the Number of Lanes : ");
//         int Lanes = sc.nextInt();

//         int[] size = new int[Lanes];
//         for(int i=0; i<size.length; i++)
//         {
//             System.out.print("\nEnter the size of the Lane"+(i+1)+" : ");
//             size[i] = sc.nextInt();
//         }


//         for(int i=0; i<size.length; i++)
//         {
//             int[] a = new int[size[i]];
//             System.out.println("\nEnter the Element of the Lane"+(i+1)+" : ");
//             for(int j=0; j<a.length; j++)
//             {
//                 a[j] = sc.nextInt();
//             }
//         } 

//         int sum=0;
//         for(int i=0; i<size.length; i++)
//         {
//             int[] a = new int[size[i]];
//             System.out.println("\nSum of the Element of the Lane"+(i+1)+" : ");
//             for(int j=0; j<a.length; j++)
//             {
//                 sum = sum + a[j];

//                 if(a[j]==a[j])
//                 {
//                     continue;
//                 }
        
//             }
//             System.out.println("Sum of the "+(i+1)+" lane : "+sum);
//         }