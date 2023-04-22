/*
create a claas game, which allows a user to "Guess the number"
gamw once. Game should have following methods:
1. Constructor tho genrate random number.
2. takeUserInput() to take a user input of number.
3. isCorrectNumber to detect whether the numbber enterd by user is true.
4. getter and setter for noOfGuesses
Use properties such as noOfGuess(int), etc to grt this task done. 
*/

import java.util.Random;
import java.util.Scanner;

class Game
{
    //declare variable
    int number;
    int guessno;
    int noOfGuesses=0;

    //create random number
    Game()
    {
        Random r = new Random();
        this.number = r.nextInt(100);
    }

    //take number from user
    void takeUserInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nGuess number between 1 to 100 : ");
        guessno = sc.nextInt();
    }

    //logic
    boolean isCorrectNumber()
    {
        noOfGuesses++;
        if(guessno==number)
        {
            System.out.format("\nYes, You get t right,it was %d\n You guess it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(guessno<number)
        {
            System.out.println("\nGuess number is lowwer than actual number \n Try Again");
        }
        else if(guessno>number)
        {
            System.out.println("\nGuess number is higher than actual number  \n Try Again");
        }
        return false;
    }
}

//Main Class
public class Game2 
{
    //Main Method
    public static void main(String[] args) 
    {
        Game g = new Game();
        boolean b = false;

        while(!b)
        {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }    
}

/*
Another easy code

import java.util.Random;
import java.util.Scanner;
class game{
    int n=0;
    int a;
game(int ran){ 
    while (n!=ran){
    Scanner sc= new Scanner(System.in);

  int n=sc.nextInt();
  if (ran>n){System.out.println(" you guessed the  smaller number\n try agin " );}
  else if (ran<n){System.out.println("  you guessed a larger  number \ntry again" );}
  
  else{System.out.println(" congrats you gussed the right number in "+a+" attempts" );
break;}a++;
}}
public static void main(String[] args) {
    System.out.println("guess the number between 1 and 100");
    Random rr= new Random();
  int ran=rr.nextInt(100);
    game guess= new game(ran);
 }}
*/ 