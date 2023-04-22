//P->8, 2.Define time class with hours,minutes and seconds as data members. Aslo define addition method to add three time objects.

import java.util.*;

//Main Class
public class AddTime 
{
    //Main Method
    public static void main(String[] args) 
    {
        //create time object
        Time t1 = new Time(1);
        Time t2 = new Time(2);

        t1.Add(t2);
        t1.display();

    }
}

//time class
class Time
{
    //declare variable
    int hours;
    int minutes;
    int seconds;
    int totalhours = 0;
    int totalminutes = 0;
    int totalseconds = 0;
    Scanner sc = new Scanner(System.in);

    //TIme constructor
    Time(int i)
    {
        System.out.println("\nEnter Time "+i);
        System.out.print("Hours   : ");
        hours = sc.nextInt();
        System.out.print("Minutes : ");
        minutes = sc.nextInt();
        System.out.print("Seconds : ");
        seconds = sc.nextInt(); 
    }
    
    //add logic
    void Add(Time t2)
    {
        totalhours = hours + t2.hours;
        totalminutes = minutes + t2.minutes;
        totalseconds = seconds + t2.seconds;

        if(totalseconds >= 60)
        {
            totalminutes++;
            totalseconds = totalseconds - 60;
        }

        if(totalminutes >= 60)
        {
            totalhours++;
            totalminutes = totalminutes - 60;
        }

    }

    //Diplay method
    void display()
    {
        System.out.println("Total time = "+totalhours+"h : "+totalminutes+"m : "+totalseconds+"s");
    }
}
