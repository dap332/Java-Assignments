/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package totalsales;

/**
 *
 * @author Patel
 * Objective = keep records of salespersons, the products sold, and the total amounts in a tabular 2d array.
 * 
 * Input- salesperson and product numbers with random amounts, -1 to end the program
 * 
 * Output- 2d array with totals for columns and rows.
 */
public class TotalSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Makes salesTable object, then gathers info and prints it
        salesTable s = new salesTable();
        s.getInfo();
        s.print();
    }
}
