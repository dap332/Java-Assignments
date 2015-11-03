/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author Patel
 */
public class PayableInterfaceTest {
    public static void main(String[] args){
        //creates array of Payable Objects
        Payable[] payableObjects = new Payable[6];
         
        //Adds 6 employees to Payable array, 2 Invoice, 1 Salaried employee
        //1 HourlyEmployee, 1 Commission Employee, and 1 BasePlusCommision Employee
        payableObjects[0] = new Invoice("01234","seat",2,375.00);
        payableObjects[1] = new Invoice("56789","tire",4,79.95);
        payableObjects[ 2 ] =
            new SalariedEmployee( "John", "Smith", "111-11-1111", 800.00 );
        payableObjects[ 3 ] =
            new HourlyEmployee( "Lisa", "Barnes", "888-88-8888", 12.00, 36);
        payableObjects[4] = new CommissionEmployee("Simpson","Homer","222-22-2222",
                            50.0,0.80);
        payableObjects[5] = new BasePlusCommissionEmployee("Bauer","Jack","333-33-3333",
                            38,0.10,9.00);
    //Prints statement
    System.out.println("Invoices and Employees processed polymorphically:\n" );
        //create a BasePlusCommissionEmployee Object
        BasePlusCommissionEmployee Jack;
    
        //For loop prints all Employees and their info
        for(Payable currentPayable : payableObjects){
            //Checks to see if payable object is a BasePlusCommissionEmployee
            //If it is then a 10% raise is given to BaseSalary.
            if( currentPayable instanceof BasePlusCommissionEmployee){
                Jack = (BasePlusCommissionEmployee) currentPayable;
                Jack.setBaseSalary((Jack.getBaseSalary() * 1.1));
                currentPayable = Jack;
            }
            System.out.printf( "%s \n%s: $%,.2f\n\n",
                currentPayable.toString(), "payment due",
                currentPayable.getPaymentAmount());
        }
    }
}
