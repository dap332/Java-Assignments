/**
 *
 * @author Patel
 */
package Employee;

/**
 *
 * @author Patel
 */
public class PieceWorker extends Employee {
    //Creates double wage for employees wage and piece to store pieces produced
    private double wage;
    private int piece;
    
    //constructor implements superclass but also adds wage and piece.
    //prevents entry below 0 for numbers
    public PieceWorker(String firstName, String lastName,
            String socialSecurityNumber, double wage, int piece){
        
        super(firstName,lastName,socialSecurityNumber);
           
    
        if(wage <= 0.0){
            throw new IllegalArgumentException("Wage must be > 0.0");
        }
        if(piece < 0){
            throw new IllegalArgumentException(
                    "wage must be => 0 ");
        }
        
        this.wage = wage;
        this.piece = piece;  
    }
    //sets wage manually
    public void setWage(double wage){
        if(wage <= 0.0){
            throw new IllegalArgumentException("Wage must be > 0.0");
        }
        
        this.wage = wage;
        }
    //sets pieces produced manually
    public void setPiece(int piece){
        
        if(wage <= 0.0){
            throw new IllegalArgumentException("Wage must be > 0.0");
        }
        
        this.piece = piece;
    }
    //return wage
    public double getWage(){
        return wage;
    }
    //returns piece
    public double getPiece(){
        return piece;
    }
    //returns earnings
    @Override
    public double getPaymentAmount(){
        return (double)piece * wage;
    }
    //returns String in format when printed.
    //includes super plus wage, pieces produced, and employee type
    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f; %s: $%.2f; \n%s: $%.2f",
        "PieceWorker", super.toString(),
        "Wage", getWage(),
        "Pieces", getPiece(),
         "Earnings",getPaymentAmount());
    }
}
