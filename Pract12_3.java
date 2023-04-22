/* 
WAp that creates arraylist with following values:
"Aarav","Kabir","Vivaan","Ayaan" and "Aditya"
create a sublist with string from ab0ve ArrayList which start from 'A'.
*/

import java.util.ArrayList;

public class Pract12_3 
{
    public static void main(String[] args) 
    {
        //Create arraylist of string
        ArrayList<String> list = new ArrayList<String>();

        //Add String name in arraylist 
        list.add("Aarav");
        list.add("Kabir");
        list.add("Vivaan");
        list.add("Ayaan");
        list.add("Aditya");
        System.out.println("\nArrayList : "+list);

        //Create sublist with string from above arralist which star from 'A'
        ArrayList<String> subList = new ArrayList<String>();
        
        //get array list ehich start from 'A'
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).charAt(0)=='A')
            {
                subList.add(list.get(i));
            }
            
        }

        //display subarraylist
        System.out.println("\nSubArrayList : "+subList);

    }    
}
