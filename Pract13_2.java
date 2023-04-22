/*
WAp to accept N integer numbers from the command line. RAise and handle exceptions for followings cases:
- when a nnumbr is a -ve.
- when a number is evenly divied by 10.
- when a number is greater than 1000 and less than 2000 
- when a number is greater than 7000.
Skip the number if an exception is raised for it, otherwise add it to find total sum.
*/

//main class
public class Pract13_2 
{
    //main method
    public static void main(String[] args) 
    {
        //declare variable
        int sum = 0;
        int i;

        //setting loop for taking n numbers
        for(i=0; i<args.length; i++)
        {
            //take n nnumbres from command line.
            int number = Integer.parseInt(args[i]);

            try 
            {
                if(number<0)
                {
                    throw new Exception(number+" is Negetive.");
                }
                if(number%10 == 0)
                {
                    throw new Exception(number+" is Evenly devisible by 10.");
                }
                if(number>1000 && number<2000)
                {
                    throw new Exception(number+" is Greater than 1000 and less than 2000");
                }
                if(number>7000)
                {
                    throw new Exception(number+" is Greater than 7000.");
                }        

                sum = sum + number;
            }
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("\nSum of the N Numbers is : "+sum);
    }    
}
