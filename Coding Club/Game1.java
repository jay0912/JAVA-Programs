//WAp to create game stone, paper, pencil and scissor.

import java.util.*;

public class Game1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nSelect your choice:- \n0.Stone \n1.paper \n2.pencil \n3.scissor \n\nEnter your choice : ");
        int userinput = sc.nextInt();

        Random r = new Random();
        int computerinput = r.nextInt(3);
        System.out.println("Computer input : "+computerinput);
        System.out.println();

        if(userinput == computerinput)
        {
            System.out.println("Draw");
        }
        else if(userinput==0 && computerinput==2 || userinput==0 && computerinput==3
               || userinput==1 && computerinput==0 || userinput==2 && computerinput==1
               || userinput==3 && computerinput==1 || userinput==3 && computerinput==2)
                {
                    System.out.println("Congratulation You Won!!");
                }

        else
        {
            System.out.println("You LOST!, better luck nextr time :)");
        }        
    }
}
