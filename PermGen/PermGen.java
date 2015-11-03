/*
 *Objective: Takes a word as input and prints out all permutations of it
 *
 *Dhruv Patel
 */
//Imports Scanner
import java.util.Scanner;


class PermGen{
    //counts lines and then displays the count each printed line
    static int line = 1;
    
    //Method takes two Strings, one is the first part, the other is the ending
    // Continously adds more to the prefix and takes from the ending,
    //then prints and repeats
    public static void PermGen(String pre, String word){
	//If the word is 0 or 1 letter, it gets printed.
	if(word.length() < 2){
	    System.out.println(line + ": " + pre + word);
	    line ++;
	}
	else{
	    for(int i = 0; i < word.length(); i++){
		PermGen(pre + word.charAt(i), word.substring(0,i) + word.substring(i + 1, word.length()));
	    }
	}

    }

    public static void main(String[] args){
	//Creates Scanner for usier input 
	Scanner s1 = new Scanner(System.in);

        System.out.println("Please enter your word here:");
	//Stores user input
	String word = s1.nextLine();

	String str = "";
	//starts permGen sequence
	PermGen(str, word);
    }


}
