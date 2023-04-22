//P->13, 1.WAP to create command line calc with take oprand and oprator from the command line argument using exception.

//Main Class
public class Pract13_1 
{
    //Main Method
    public static void main(String[] args) 
    {
        //declarte variable 
        int result = 0;
        
        try
        {
            //scan oprand and oprator from command line arguments.
            int firstnumber = Integer.parseInt(args[0]);
            int secondnumber = Integer.parseInt(args[2]); 
            char oprator = args[1].charAt(0);
            

            //perform opration
            switch (oprator) 
            {
                case '+':
                    result = firstnumber + secondnumber;
                    System.out.println(args[0]+"  "+args[1]+"  "+args[2]+" = "+result);
                    break;

                case '-':
                    result = firstnumber - secondnumber;
                    System.out.println(args[0]+"  "+args[1]+"  "+args[2]+" = "+result);
                    break;    

                case '*':
                    result = firstnumber * secondnumber;
                    System.out.println(args[0]+"  "+args[1]+"  "+args[2]+" = "+result);
                    break;
                    
                case '/':
                    result = firstnumber / secondnumber;
                    System.out.println(args[0]+"  "+args[1]+"  "+args[2]+" = "+result);
                    break;    
            
                default:
                    System.out.println("Invaild Oprator Selected.");
                    break;
            }
        }
        catch(ArithmeticException e)
        {
            System.err.println(e.getMessage());
        }
        catch(NumberFormatException e)
        {
            System.err.println("Oprand is nonnumeric");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Please Enter Oprand.");
        }
        
    }
}
 