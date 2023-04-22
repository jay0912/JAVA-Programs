/*
WAP to create Account class, which is represeenting a bank account  where we can deposite and withdraw money.
if we want to withdraw money which exxceed our bank balance? we will be not allowed, create inSufficientFundException 
to handle above sitution and display proper error message 
*/
import java.util.Scanner;

class InSufficientFundException extends Exception
{
    InSufficientFundException(String msg)
    {
        super(msg);
    }
}

class Account
{
    double balance = 0.0;

    void depositeMoney(Double bal)
    {
        balance = balance + bal;
    }

    void checkBalance()
    {
        System.out.println("Current Balance : "+balance);
    }

    void withdrawMoney(Double bal) throws InSufficientFundException
    {
        if(bal > balance)
        {
            throw new InSufficientFundException("\nCurrent Balance : "+balance+" is less than Requested Amount : "+bal);
        }
        balance = balance - bal;
    }
}

public class Pract13_3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Deposite Money : ");
        double depositeMoney = sc.nextDouble();

        System.out.print("Enter the Withdraw Money : ");
        double withdrawMoney = sc.nextDouble();

        Account a = new Account();

        a.depositeMoney(depositeMoney);
        a.checkBalance();

        try
        {
            a.withdrawMoney(withdrawMoney);
        }
        catch(InSufficientFundException e)
        {
            System.out.println(e.getMessage());
        }
        

    }    
}
