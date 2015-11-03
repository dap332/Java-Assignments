
package Employee;
/**
 *
 * @author Patel
 */
public abstract class Employee implements Payable {
    //Strings that contain First and Last names as well as SSN
     final String firstName;
     final String lastName;
     final String socialSecurityNumber;
    
     

     //3 argument constructor First name last name and SSN
    public Employee(String firstName, String lastName, 
            String socialSecurityNumber){
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    //returns first name when called
    public String getFirstName(){
        return firstName;
    }
    //returns last name when called
    public String getLastName(){
        return lastName;
    }
    //returns SSN when called
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }
    //prints out employees name and SSN
     @Override
    public String toString(){
        return String.format("%s , %s: \n%s: %s:", 
          firstName, lastName, 
         "social security number", socialSecurityNumber);
    }
}
