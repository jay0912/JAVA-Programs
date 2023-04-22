/*WAP to create an arraylist of following :
"Delhi","Mumbai","Banglore","Hyderabad" and "ahmedabad"
replace "Ahemdabad" with "Surat" in above arraylist.
*/

import java.util.ArrayList;

public class Pract12_2 
{
    public static void main(String[] args) 
    {
        //create arraylist of string
        ArrayList<String> list = new ArrayList<String>();
        
        //Add cities in arraylist
        list.add("Delhi");
        list.add("Mumbai");
        list.add("Banglore");
        list.add("Hyderabad");
        list.add("Ahemedabad");

        //display arraylist before replace
        System.out.println("\nArrayList : "+list);

        //change element of arraylist  
        list.set(list.indexOf("Ahemedabad"), "Surat");

        //display arraylist after replace
        System.out.println("\nArrayList After Replace : "+list);

    }
}
