public class Policy 
{
 //Fields 
 private  String policyNumber;
 private  String providerName;
 private String firstName;
 private String lastName;
 private int age;
 private String smokingStatus;
 private double height;
 private double weight;
 
 //Constructor 1
 public Policy()
 {
  policyNumber = "";
  providerName = "";
  firstName = "";
  lastName = "";
  age = 0;
  smokingStatus = "";
  height = 0.0;
  weight = 0.0;
 }
 
 //Constructor 2
 public Policy(String pNumber, String pName, String fName, String lName, int a, String sStatus, double h, double w)
 {
  policyNumber = pNumber;
  providerName = pName;
  firstName = fName;
  lastName = lName;
  age = a; 
  smokingStatus = sStatus; 
  height = h;
  weight = w; 
 }

 //Setter methods
 
 /**
    The setPolicyNumber method set the policy number.
    @param pNumber.
 */
 public void setPolicyNumber(String pNumber)
 {
  policyNumber = pNumber;
 }
 
 
 /**
    The setProviderName method set the assurace providor's name.
    @param pName.
 */
 public void setProviderName(String pName)
 {
  providerName = pName;
 }


 /**
    The setFirstName method set the first name of the user.
    @param fName.
 */
 public void setFirstName(String fName)
 {
  firstName = fName;
 }
 
 
 /**
    The setLastName method set the last name of the user.
    @param lName.
 */
 public void setLastName(String lName)
 {
  lastName = lName;
 }


 /**
    The setAge method set the age of the user.
    @param a.
 */
 public void setAge(int a)
 {
  age = a; 
 }
 

 /**
    The setSmokingStatus method set the user's smoking status.
    @param sStatus.
 */
 public void setSmokingStatus(String sStatus)
 {
  smokingStatus = sStatus;
 }


 /**
    The setHeight method set the height of the user.
    @param h.
 */
 public void setHeight(double h)
 {
  height = h;
 }


 /**
    The setWeight method set the weight of the user.
    @param w.
 */
 public void setWeight(double w)
 {
  weight = w;
 }

 //Get methods
 
 /**
    The getPolicyNumber method returns the insurance policy number.
    @return policyNumber.
 */
 public String getPolicyNumber()
 {
  return policyNumber;
 }
 
 
 /**
    The getProviderName method returns the insurance provider's name.
    @return providerName.
 */
 public String getProviderName()
 {
  return providerName;
 }


 /**
    The getFirstName method returns the user's first name.
    @return firstName.
 */
 public String getFirstName()
 {
  return firstName;
 }


 /**
    The getLastName method returns the user's last name.
    @return lastName.
 */
 public String getLastName()
 {
  return lastName;
 }


 /**
    The getAge method returns the user's age.
    @return age. 
 */
 public int getAge()
 {
  return  age;
 }
 
 
 /**
    The getSmokingStatus method returns the user's smoking status. 
    @return smokingStatus. 
 */
 public String getSmokingStatus()
 {
  return smokingStatus;
 }


 /**
    The getHeight method returns the user's height. 
    @return height.
 */
 public double getHeight()
 {
  return height;
 }


 /**
    The getWeight method returns the user's weight.
    @return weight.
 */
 public double getWeight()
 {
  return weight;
 }
 
 
 /**
    The getBMI method returns BMI value.
    @return the BMI.
 */
 public double getBMI()
 { 
  final double CONVERTOR = 703;
  
  return (weight * CONVERTOR) / (height * height);
 }
 
 
 /**
    The getPrice method returns the total the user should pay for the insurance.  
    @return price. 
 */
 public double getPrice()
 {
  final double BASE_PRICE = 600;
  final double ADDITIONAL_FEE_AGE = 75;
  final double ADDITIONAL_FEE_SMOKING = 100;
  final double ADDITIONAL_FEE_PER_BMI = 20;
  final int AGE_THRESHOLD = 50;
  final int BMI_THRESHOLD = 35;
  
  double price =  BASE_PRICE;
  
  if(age > AGE_THRESHOLD)
    price += ADDITIONAL_FEE_AGE;
  
  if(smokingStatus.equalsIgnoreCase("smoker"))
    price += ADDITIONAL_FEE_SMOKING;
    
  if(getBMI() > BMI_THRESHOLD) 
    price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI); 
    
    
  return price;
  
 }


}