package HW001;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
         Palindrom words = new Palindrom();
		
		words.input();
		System.out.println("Bye...");

	}

	private void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your word");
		String word = scan.nextLine();
		scan.close();
		control(word);
		System.out.println(word + (control(word) ? " is Palindorm" : " is not Palindrom"));
		
	}

	private boolean control(String word) {
		boolean returnValue = false;
		
		for(int i=0;i<word.length()/2;i++) {
			returnValue =  word.charAt(i) == word.charAt(word.length()-i-1);
		}
		return returnValue;
		
		
	}


	

}
