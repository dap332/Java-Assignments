
/**
 *
 * @author Patel
 */
package Employee;

public class EmployeeMain {
    public static void main(String[] args){
        //Creates an Array of Employees
        Employee[] employees = new Employee[3];

	//Creates 3 Employees 1 of each type
        CommissionEmployee Joe  = new CommissionEmployee("Smith","Joe","123",20,.35);
        BasePlusCommissionEmployee Bill = new BasePlusCommissionEmployee("Brown","Bill","456",12,.1,35);
        PieceWorker Jack = new PieceWorker("Bauer","Jack","789",8.5,11);
        //Adds Employees to array
        employees[0] = Joe;
        employees[1] = Bill;
        employees[2] = Jack;
        //Prints Employees info
        for (int i = 0; i < employees.length; i++){
            System.out.println(employees[i]);
        }
        
    }
}
