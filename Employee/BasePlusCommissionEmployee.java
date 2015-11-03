package Employee;
/**
 *
 * @author Patel
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    //Creates a double that holds the employees base salary
    private double baseSalary;
    
    //6 argument constructor, invokes superclass prevents invalid input for 
    //base salary
    public BasePlusCommissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, double grossSales,
            double commissionRate, double baseSalary){
        
        super(firstName, lastName, socialSecurityNumber, grossSales,
                commissionRate);              
        
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base Salary must be >= 0.0");
        }
        
        this.baseSalary = baseSalary;
    }
    //sets employees base salary
    public void setBaseSalary(double baseSalary){
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base Salary must be >= 0.0");
        }
        
        this.baseSalary = baseSalary;
    }
    //return base salary when called
    public double getBaseSalary(){
        return baseSalary;
    }
    //returns earnings when called
    @Override
    public double getPaymentAmount(){
        return getBaseSalary() + super.getPaymentAmount();
    }
    //overrides tostring, invokes superclass prints out   
    @Override
    public String toString(){
        return String.format("%s %s: %s: %.2f; /n%s: $%.2f",
        "base salary plus", super.toString(),
        "Base salary", getBaseSalary(),
        "Earnings", getPaymentAmount());        
    }
}
