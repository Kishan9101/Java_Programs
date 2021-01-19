package abcd;

import java.util.Scanner;

public class Practical6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Character : ");
		char ch = input.nextLine().charAt(0);
		
		switch(ch) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':	
		case 'I':
		case 'O':
		case 'U':
			  System.out.println("Character is Vowel.");
              break;
		default:
			 System.out.println("Character is Consonant.");
			  
		}

	}

}
