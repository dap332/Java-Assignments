
/**
 *
 * @author Patel
 */
package Employee;

public class CommissionEmployee extends Employee{
    //doubles store grossSales and commissionRate
    private double grossSales;
    private double commissionRate;
    
    //5 argument constructor. Uses superclass for 3 of them. Also throws
    //exceptions for invalid inputs in grossSales or commissionRate
    /**
     *
     * @param firstName
     * @param lastName
     * @param socialSecurityNumber
     * @param grossSales
     * @param commissionRate
     */
    public CommissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, double grossSales, 
            double commissionRate){
    
        super(firstName, lastName, socialSecurityNumber);
        
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException(
                    "Commission rate must be > 0 and < 1.0");
        }
        
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    //Sets gross Sales and prevents invalid input
    public void setGrossSales(double grossSales){
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }
    //return grossSales when called
    public double getGrossSales(){
        return grossSales;
    }
    //set commission rate
    public void setCommissionRate(double commissionRate){
        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException(
                    "Commission rate must be >= 0.0 and <= 1.0");
        }
        this.commissionRate = commissionRate;
    }
    //return commission rate when called 
    public double getCommissionRate(){
        return commissionRate;
    }
    //returns earnings when called
    @Override
    public double getPaymentAmount(){
        return getCommissionRate() * getGrossSales();
    }
    //overrides tostring and invokes supperclass also prints commision rate and
    //gross sales
    
    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f; \n%s: $%.2f",
        "commission employee", super.toString(),
        "gross sales", getGrossSales(),
        "commission rate", getCommissionRate(),
        "Earnings",getPaymentAmount());
    }
}
