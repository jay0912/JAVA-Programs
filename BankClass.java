//P->7, 2.WAP to create class named bank using getfunction and displayfunction and also create method to demostrate bank account.

import java.util.*; 

public class BankClass 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        //object intilaization
        BankAccount bn1 = new BankAccount();
        BankAccount bn2 = new BankAccount();
        BankAccount bn3 = new BankAccount();
        BankAccount bn4 = new BankAccount();
        BankAccount bn5 = new BankAccount();

        //call method
        bn1.getAccountDetails();
        bn1.displayAccountDetails();
        bn2.getAccountDetails();
        bn2.displayAccountDetails();
        bn3.getAccountDetails();
        bn3.displayAccountDetails();
        bn4.getAccountDetails();
        bn4.displayAccountDetails();
        bn5.getAccountDetails();
        bn5.displayAccountDetails();

        
    }    
}

class BankAccount
{
    //Declare variable
    int AccountNumber;
    String UserName;
    String Email;
    String AccountType;
    double AccountBalance;
    Scanner sc = new Scanner(System.in);

    //Get Details method
    void getAccountDetails()
    {
        System.out.print("\nEnter Account Number : ");
        AccountNumber = sc.nextInt();
        System.out.print("Enter User Name : ");
        UserName = sc.next();
        System.out.print("Enter your Eamil : ");
        Email = sc.next();
        System.out.print("Enter Account Type : ");
        AccountType = sc.next();
        System.out.print("Enter Account Balance : ");
        AccountBalance =  sc.nextDouble();
    }

    //Display Method
    void displayAccountDetails()
    {
        System.out.println("\nAccount Details :-");
        System.out.println("User Name :  "+UserName);
        System.out.println("Email : "+Email);
        System.out.println("Account Type : "+AccountType);
        System.out.println("Account Balance : "+AccountBalance);
    }
}


