import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
/*
  This program demonstrates the Policy class by writing a Demo class.  The Demo class should ask the user to enter all necessary information.
*/

public class PolicyDemo
{

   public static void main(String[] args) throws IOException
   {
   
    //Declare varivle
    String policyNumber = "";
    String providerName = "";
    String firstName = "";
    String lastName = "";
    int age = 0;
    String smokingStatus = "";
    double height = 0.0;
    double weight = 0.0;
    int numSmokers = 0;
    String fileInput = "";
    
    //ArrayList to store Policy object
    ArrayList<Policy> policyList = new ArrayList<Policy>();
    
    try
    {
      //Create and open the file
      File file = new File("PolicyImformation.text");
      Scanner inputFile = new Scanner(file);
     
      //process all information in the file
      while(inputFile.hasNext())
      {
        //"Parsing" way of reading input.
        policyNumber = inputFile.nextLine();
        providerName = inputFile.nextLine();
        firstName = inputFile.nextLine();
        lastName = inputFile.nextLine();
        fileInput = inputFile.nextLine();//clear the new line or inputFile.nextLine();
        age = Integer.parseInt(fileInput);//convet the age to int
        fileInput = inputFile.nextLine();
        smokingStatus = inputFile.nextLine();
        height = Double.parseDouble(fileInput);//covert the height to double
        fileInput = inputFile.nextLine();
        weight = Double.parseDouble(fileInput);//covert the weight to double
        
        //make sure we have'nt hit te end of the file before trying to skip the blank line
        if(inputFile.hasNext())
           inputFile.nextLine();
           
        //Create a Policy object and add it to our ArrayList
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
        policyList.add(policy);
        
      }//end of while loop
     
        //print out information of each Policy object.     
        for(int i = 0; i < policyList.size(); i++)
        {   
         
         //Display information about the policy
         System.out.println("\n\nPolicy Number: " + policyList.get(i).getPolicyNumber());
         System.out.println("Provider Name: " + policyList.get(i).getProviderName());
         System.out.println("Policyholder's First Name: " + policyList.get(i).getFirstName());
         System.out.println("Policyholder's Last Name: " + policyList.get(i).getLastName());
         System.out.println("Policyholder's Age: " + policyList.get(i).getAge());
         System.out.println("Policyholder's Smoking Status: " + policyList.get(i).getSmokingStatus());
         System.out.printf("Policyholder's Height: %,.1f \n", policyList.get(i).getHeight());
         System.out.printf("Policyholder's Weight: %,.1f \n", policyList.get(i).getWeight());
         System.out.printf("Policyholder's BMI: %,.2f \n", policyList.get(i).getBMI());
         System.out.printf("Policy Price: $%,.2f \n", policyList.get(i).getPrice());
         System.out.println();
    
         if(policyList.get(i).getSmokingStatus().equalsIgnoreCase("smoker"))//keep track of the number of smokers
         numSmokers++;
   
       }//end of for loop
        
      //print out the number of smoker and non-smoker
      System.out.println("The number of policies with a smoker is: " + numSmokers);
      System.out.println("The number of policies with a non-smoker is: " + (policyList.size() - numSmokers));
      
  }//Close the "try" block of code
   
     catch(IOException ex)//If something goes wrong, an Exception id "thrown" to u, and we "catch" it and deal with it.
     {
       //use the getMessage method of the exception we "caught" to print out it;s message about what went wrong.
       System.out.println("Something went wrong reading the file: " + ex.getMessage());
     }
   
   }//end of main method
   
}//end of the Demo class