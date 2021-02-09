/*
  This program creates a Policy class that will model an insurance policy for a single person.  
*/

public class Policy 
{
  private int policyNumber;
  private String providerName;
  private String firstName;
  private String lastName;
  private int age;
  private String smokingStatus;// smoker or non-smoker
  private double height;// in inches
  private double weight;// in pounds
  private double BMI;
  
  public Policy()//non-argument constructor
  {
   policyNumber = 0;
   providerName = "";
   firstName = "";
   lastName = "";
   age = 0;
   smokingStatus = "";
   height = 0.0;
   weight = 0.0;
   BMI = 0.0;
  }
  
  //constructor 
  public Policy(int pNumber, String pName, String fName, String lName, int a, String status, double h, double w)
  {
    policyNumber = pNumber;
    providerName = pName;
    firstName = fName;
    lastName = lName;
    age = a;
    smokingStatus = status;
    height = h;
    weight = w;
  }
  
  
  // the setters methods 
  
  public void setPolicyNumber(int pNumber)
  {
    policyNumber = pNumber;
  }
  
  public void setProviderName(String pName)
  {
    providerName = pName;
  }

  public void setFirstName(String fName)
  {
    firstName = fName;
  }
  
  public void setLastName(String lName)
  {
    lastName = lName;
  }

  public void setAge(int a)
  {
    age = a;
  }
 
  public void setSmokingStatus(String status)
  {
    smokingStatus = status;
  }
  
  public void setHeight(double h)
  {
    height = h;
  }

  public void setWeight(double w)
  {
    weight = w;
  }


  // the getters methods
  
  public int getPolicyNumber()
  {
    return policyNumber;
  }

  public String getProviderName()
  {
    return providerName;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }
  
  public int getAge()
  {
    return age;
  }
  
  public String getSmokingStatus()
  {
    return smokingStatus;
  }
  
  public double getHeight()
  {
    return height;
  }

  public double getWeight()
  {
    return weight;
  }
  
  
  //a return method that calculates the BMI of the policyholder.
  public double getBMI()
  {
    return (weight * 703) / (height * height);
  }
  
  
  //a method that calculates and returns the price of the insurance policy.
  public double getInsurancePrice()
  { 
    final int BASE_FEE = 600;
    double additionalFee = 0.0;
    
    if (age > 50)
    {
      additionalFee = 75;
    }
    
    if (smokingStatus == "smoker" )
    {
      additionalFee = 100;
    }
    
    if (BMI > 35)
    {
      additionalFee = (BMI - 35) / 20;
    }
    
    
    return BASE_FEE + additionalFee;
  }
  
   
  
}//end of class
