//P->7, 1.Wap to create a class named candidate.

import java.util.*;

//main class 
public class CandidateClass 
{
    //main method
    public static void main(String[] args) 
    {
        //object initialization
        Candidate cn = new Candidate();
    
        //call method
        cn.getCandidateDetails();
        cn.displayCandidateDetails();
        
    }    
}

class Candidate
{
    //declare variable
    int CandidateId;
    int CandidateAge;
    int CandidateWeight;
    String CandidateName;
    double CandidateHeight;
    Scanner sc = new Scanner(System.in);

    //get details method
    void getCandidateDetails()
    {
        System.out.print("Enter the Candidate ID : ");
        CandidateId = sc.nextInt();
        System.out.print("Enter the candiidate Name : ");
        sc.nextLine();
        CandidateName = sc.nextLine();
        System.out.print("Enter the Candidate Age : ");
        CandidateAge = sc.nextInt();
        System.out.print("Enter the Candidate Weight : ");
        CandidateWeight = sc.nextInt();
        System.out.print("Enter the Candidate height : ");
        CandidateHeight = sc.nextInt();
    }

    //display detais method
    void displayCandidateDetails()
    {
        System.out.println("\nCandiate Detaills :-");
        System.out.println("Id     :  "+CandidateId);
        System.out.println("Name   :  "+CandidateName);
        System.out.println("Age    :  "+CandidateAge);
        System.out.println("weight :  "+CandidateWeight);
        System.out.println("Height :  "+CandidateHeight);
    }
}
