/*
 *Objective: Print out all partitions of a given integer
 *Dhruv Patel
 */

import java.util.Scanner;

class Partition{
    
    //partition method takes orginal int and calls another partition method
    public static void partition(int n ){
	partition(n,n,"");
    }
    //overloaded method, takes 2 ints and a string as a suffix
    //because some partition parts can be partitioned themselves again
    //and therefore will need more paramters
    public static void partition(int n, int max, String s){
	//if the int has been decremented to 0 the method stops recurring
	if(n == 0){
	    System.out.println(s);
	    return;
	}
	//decrements original ints as well as partitioning individual parts
	for(int i = Math.min(n,max); i > 0; i--){
	    partition(n - i, i, s  + " " + i);
	}
    }
	
    public static void main(String[] args){
	//Scanner takes user input
	Scanner s1 = new Scanner(System.in);

	System.out.println("Please enter a positive integer");

	int n = s1.nextInt();
	//Makes sure user input is a Positive int
	if(n < 0 ){
	    System.out.println("Error: Please enter a POSITIVE integer");
	    main(args);
	}
	//calls partition method.
	partition(n);

    }
}
