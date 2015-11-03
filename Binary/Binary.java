/*
 *Objective: Takes an integer in decimal form and converts it into binary.
 *Dhruv Patel
 */
import java.util.Scanner;


class Binary{
//int remainder is created, it will be used to store a remainder
	static int remainder;

    public static void  toBinary(int decimal){
	//If the integer is 0 or 1 then it will just be printed.
	if(decimal < 2){
	    System.out.print(decimal);
	    
	}
	else{
	    //Divides the current decimal by 2 prints the remainder, repeats.
	    toBinary(decimal/2);
	    remainder = decimal% 2;
	    System.out.print(remainder);
	}
    }

	public static void main(String[] args){
	    //Creates Scanner to take user input
	    Scanner in = new Scanner(System.in);
	    //Asks user to enter a positive number
	    System.out.println("Enter a positive integer");
	    
	    int dec = in.nextInt();
	    //Makes sure the user inputs a positive number
	    if(dec < 0){
		System.out.println("Error: Please enter a Positive Integer");
		main(args);
	    }
	    
	    //Calls the recursive method to find the binary equivalent
	    toBinary(dec);
	    System.out.println();
	}

}
