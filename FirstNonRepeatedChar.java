package test.coding.java.oct13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstNonRepeatedChar {
	
	//write a program to find first non repeated character in given String?
	
	public static char firstNonRepeatedChar(String s){
		Set<Character> repeating = new HashSet<>(); 
		List<Character> nonRepeating = new ArrayList<>(); 
		
		for (int i = 0; i < s.length(); i++) { 
			char letter = s.charAt(i); 
			if (repeating.contains(letter)) { 
				continue; 
				} 
			if (nonRepeating.contains(letter)) { 
				nonRepeating.remove((Character) letter); 
				repeating.add(letter); 
				} 
			else { 
				nonRepeating.add(letter); 
				} 
			} 
		
		return nonRepeating.get(0);

	}

	public static void main(String[] args) {
		//String input = "hhello";
		String input = "hehello";
		char c = firstNonRepeatedChar(input);
		
		System.out.println("First repeated character in string '"+input+"' is '" +c+"'");

	}

}
