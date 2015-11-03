import java.util.Scanner;

class PalindromeTester{
    public static void main(String[] args){
   
    Scanner s1 = new Scanner(System.in);

    System.out.println("Enter a potential Palindrome");

    String word = s1.nextLine();
    
    word = word.toLowerCase();
    
    word = word.replaceAll(" ","");
    
    word = word.replaceAll("[^a-zA-Z ]", "");
    
    boolean Palindrome = true;
    
    for(int i = 0; i < word.length()/2; i++){
        
        if(word.charAt(i) != word.charAt((word.length() - 1)-i)){
        Palindrome = false;
        }
    }

    if(Palindrome == false){
        System.out.println("That word is NOT a Palindrome ");  
    }
    else{
        System.out.println("That word IS a Palindrome ");
    }
 }

}