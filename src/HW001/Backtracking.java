package HW001;

import java.util.Scanner;

public class Backtracking {

	public static void main(String[] args) {


		Backtracking words = new Backtracking();
		
		words.input();
		System.out.println("Bye...");

	}

	private void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your word");
		String word = scan.nextLine();
		String reverseWord= "";
		scan.close();
		reversing(word, reverseWord);
		
		
	}

	private void reversing(String tempWord, String reverseWord) {
		String loopWord="";
		if(tempWord.length()>0) {
			reverseWord += tempWord.charAt(tempWord.length()-1);
				for(int i=0;i<tempWord.length()-1; i++) {
					loopWord += tempWord.charAt(i);
				}
			reversing(loopWord, reverseWord);
			
		}else {
			
			System.out.println("Your reversed word:  "+reverseWord);
		}
		
	}

//	private void reversing(String word) {
//			
//			String reverseWord="";
//			for(int i=0;i<word.length() ; i++) {
//				reverseWord += word.charAt(word.length()-i-1);
//			}
//			System.out.println("Your reversed word:  "+reverseWord);
//			
//		
//	}

}
