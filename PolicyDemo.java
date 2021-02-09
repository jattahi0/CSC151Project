import java.util.Scanner;
/*
  This program demonstrates the Policy class by writing a Demo class.  The Demo class should ask the user to enter all necessary information.
*/

public class PolicyDemo
{

   public static void main(String[] args)
   {
    int pNumber = 0;
    String pName = "";
    String fName = "";
    String lName = "";
    int a = 0;
    String status = "";
    double h = 0.0;
    double w = 0.0;

    //Scanner object needed in order to get the user's input. 
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Please enter the Policy Number: ");
    pNumber = keyboard.nextInt();  
    
    //clear the buffer 
    keyboard.nextLine();
    
    System.out.print("Please enter the Provider Name: ");
    pName = keyboard.nextLine();
    
    System.out.print("Please enter the Policyholder's First Name: ");
    fName = keyboard.nextLine();
    
    System.out.print("Please enter the Policyholder's Last Name: ");
    lName = keyboard.nextLine(); 
        
    System.out.print("Please enter the Policyholder's Age: ");
    a = keyboard.nextInt();
    
    //clear the buffer 
    keyboard.nextLine();
    
    System.out.print("Please enter the Policyholder's Smoking Status(smoker/non-smoker): ");
    status = keyboard.nextLine();
    
    System.out.print("Please enter the Policyholder's Height (in inches): ");
    h = keyboard.nextDouble();
    
    System.out.print("Please enter the Policyholder's Weight (in pounds): ");
    w = keyboard.nextDouble();
        
    
    //Create an instance 
    Policy p = new Policy(pNumber, pName, fName, lName, a, status, h, w);
    
    System.out.println("\n\nPolicy Number: " + p.getPolicyNumber());
    System.out.println("Provider Name: " + p.getProviderName());
    System.out.println("Policyholder's First Name: " + p.getFirstName());
    System.out.println("Policyholder's Last Name: " + p.getLastName());
    System.out.println("Policyholder's Age: " + p.getAge());
    System.out.println("Policyholder's Smoking Status: " + p.getSmokingStatus());
    System.out.printf("Policyholder's Height: %,.1f \n", p.getHeight());
    System.out.printf("Policyholder's Weight: %,.1f \n", p.getWeight());
    System.out.printf("Policyholder's BMI: %,.2f \n", p.getBMI());
    System.out.printf("Policy Price: $%,.2f \n", p.getInsurancePrice());
    
    
   
   }
   
   
}