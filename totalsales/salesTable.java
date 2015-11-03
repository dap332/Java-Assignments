/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package totalsales;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * @author Patel
 * class salesRable creates an object salesTable which gathers information, 
 * stores it in a 2d array, and prints the array with totals
 * 
 */
public class salesTable {
    double[][] sales;
    int salesPerson;
    int productNumber;
    int salesAmount;
    
    //Creates scanner to read user input
    Scanner s1 = new Scanner(System.in);
    
    //Creates a Decimal Format "df" to format all doubles to two decimal places
    DecimalFormat df = new DecimalFormat("#,###,##0.00");
    
    //constructor, also initializes array
    public salesTable(){
        sales = new double[5][4];
    }
    //Method uses while lop to gather information and store it into array
    public void getInfo(){
        System.out.print("Enter sales person number:");
        salesPerson = s1.nextInt();
        //Repeats asking for salesperson number if invalid input
        if (salesPerson != -1 && (salesPerson < 1 || salesPerson > 4)){
            System.out.println("Invalid input");
            getInfo();
        }
        //Loops asking questions until user enters -1
        while(salesPerson != -1){
            System.out.print("Enter the product number:");
            productNumber = s1.nextInt();
            if(productNumber < 1 || productNumber > 5){
                System.out.println("Invalid Product Number, Try again!");
                getInfo();
                return;
            }
            //Asks for salesperson number again so it can be in the loop
            System.out.print("Enter sales amount:");
            salesAmount = s1.nextInt();
             //if all inputs are valid then add then add value to array
            if(salesPerson < 5 && salesPerson > 0 && productNumber < 6
                    &&productNumber > 0){
                sales[productNumber - 1][salesPerson - 1] += salesAmount;
            }
            
            System.out.print("Enter sales person number:");
            salesPerson = s1.nextInt();
            if (salesPerson != -1 && (salesPerson < 1 || salesPerson > 4)){
                System.out.println("Invalid input");
                getInfo();
            }             
        }
        
    }
    //finds the sum of the rows in the array
    public double productTotal(int product){
        double productTotal = 0;
        for (int col = 0; col < sales[product].length; col++){
            productTotal += sales[product][col];
        }
        return productTotal;
    }
    //finds the sum of the columns
    public double personTotal(int person){
        double personTotal = 0;
        for(int row = 0; row < sales.length; row ++){
            personTotal += sales[row][person];
        }
        return personTotal;
    }
    //prints array with formatting to make it mre tabular using \t for tabs
    public void print(){
        System.out.println("\tSalesperson 1\t" + "Salesperson 2\t" + 
                "Salesperson 3\t" + "Salesperson 4\t" + "Total");
        for (int row = 0; row < sales.length; row ++){
            System.out.print("Product " + (row + 1));
            for(int col = 0; col < sales[row].length; col++){
                System.out.print("\t" + df.format(sales[row][col]) + "\t");
            }
            System.out.print(df.format(productTotal(row)) + "\n");
        }
        System.out.println("Total\t\t" + df.format(personTotal(0))+ "\t\t" + df.format(personTotal(1)) + 
                "\t\t" + df.format(personTotal(2)) + "\t\t" + df.format(personTotal(3)));
    }
}
