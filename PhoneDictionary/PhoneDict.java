import java.io.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;



public class PhoneDict{

	static HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	static ArrayList<String> list = new ArrayList<String>();

	public static void wordToNumbers(String word){
		
	//	try{
			String key = "";

			for(int i = 0; i < word.length(); i++){
				char letter = word.toLowerCase().charAt(i);

				if(letter == 'a' || letter == 'b' || letter == 'c'){
					key += "2";
				}
				else if(letter == 'd' || letter == 'e' || letter == 'f'){
            	key += "3";
	      	}
				else if(letter == 'g' || letter == 'h' || letter == 'i'){
					 key += "4";
         	}
				else if(letter == 'j' || letter == 'k' || letter == 'l'){
					 key += "5";
				}
				else if(letter == 'm' || letter == 'n' || letter == 'o'){
	         	 key += "6";
         	}
				else if(letter == 'p' || letter == 'q' || letter == 'r' || 
					  letter == 's'){
	      	      key += "7";
				}
         	else if(letter == 't' || letter == 'u' || letter == 'v'){
	               key += "8";
				}
         	else if(letter == 'w' || letter == 'x' || letter == 'y' || 
		           letter == 'z'){
	               key += "9";
				}
			}
			createHash(key, word);
			/*
			if (map.containsKey(key)){
				if(map.get(key) == null){
					ArrayList list = new ArrayList<String>();
					list.add(word);
					map.put(key, list);
				}
				else{	
					list.add(word);
					map.put(key, list);
				}	
			}
			else{		
				ArrayList list = new ArrayList<String>();
				list.add(word);
				map.put(key, list);
			}
		}
		catch(NullPointerException e){
		}
		*/
	}
	
	public static void createHash(String key, String value){
		if(map.containsKey(key)){
			list = new ArrayList<String>();
			ArrayList<String> tmpList = new ArrayList<String>();
			tmpList = map.get(key);
			list.addAll(tmpList);
			list.add(value);
			map.put(key, list);
		}
		else{
			list = new ArrayList<String>();
			list.add(value);
			map.put(key, list);
		}

	}
	public static String[] clean(String input){
		input = input.replaceAll("0", " ");
		input = input.trim().replaceAll(" +", " ");
		String[] digits;
		digits = input.split(" ");
		return digits;
	}
	public static String find(String number, HashMap< String, ArrayList<String>
			> hash){
			String text = "";
			if (hash.containsKey(number.trim())){
				ArrayList<String> values = hash.get(number);
				if(values.size() == 1)
					text += values.get(0) + " ";
				else{
					String str = "(";
					for(String s : values)
						str += s + "|";
					text += str.substring(0, str.length()-1) + ") ";
				}
			}
			else{
				for(int i = 0; i < number.length(); i++){
					text += '*';					
				}
				text += " ";			
			}
			return text;
		}	

	public static void main(String[] args){
		try{
			BufferedReader in = new BufferedReader(new FileReader("words"));
			String ching;	
			while((ching = in.readLine()) != null){
				wordToNumbers(ching);
			}
		}
		catch(FileNotFoundException e){
		}
		catch(IOException e){
		}
		try{
			BufferedReader user_in = new BufferedReader(new InputStreamReader(System.in));
			String user;
			String[] digits;
			while((user = user_in.readLine()) != null){
				digits = clean(user);
			String s = "";
			
			for(String st : digits){
				s += find(st, map);
			}

			System.out.print( s.trim());

			}	
		}
		catch(IOException e){
		}

	}
}

/*
	THE FLOW:

	Read file line by line, convert each word to numeric key.
	Store key in HashMap with word.

	Take user input, and search for key from user input.

	display words in correct format.
*/ 
