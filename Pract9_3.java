//P->9, 3.WAP that count the number of objects created by static variable.

import java.util.*;

//count class
class CountObject
{
    static int no_of_object=0;

    public static void displayObject()
    {
        no_of_object = no_of_object + 1;
        System.out.println("No. of created object is : "+no_of_object);
    }
}

//Main Class
public class Pract9_3 
{
    //MAin method
    public static void main(String[] args) 
    {
        //Object Intailization
        CountObject c1 = new CountObject();
        c1.displayObject();

        CountObject c2 = new CountObject();
        c2.displayObject();
    }
}
