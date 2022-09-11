package HW001;

import java.util.Scanner;

public class Fraction {
	private Scanner input;

	public static void main(String[] args) {
		Fraction Calculation = new Fraction() ;
		
		Calculation.menu();
		System.out.println("Bye...");

	}

	

	private void menu() {
		System.out.println("Welcome to Calculator");
		while(true) {
		this.input = new Scanner(System.in);
		
		System.out.println("Please choose your process");
		System.out.println("1- Addition");
		System.out.println("2- Multiple Addition");
		System.out.println("3- Extraction");
		System.out.println("4- Multiplication");
		System.out.println("5- Division");
		System.out.println("6- Exit");
		int selection = input.nextInt();
		input.nextLine();
		if(selection == 6) {
			break;
		}
		if(!processSelection(selection)) {
			System.out.println("Wrong choice. Please try again.");
		}
	}
	}
	private int[] inputNumbers() {
		int[] numbers = new int[4];
		System.out.println("Enter A");
		numbers[1] = input.nextInt();
		System.out.println("Enter B");
		numbers[2] = input.nextInt();
		System.out.println("Enter C");
		numbers[3] = input.nextInt();
		System.out.println("Enter D");
		numbers[4] = input.nextInt();
		return numbers;
	}



	private boolean processSelection(int selection) {
		boolean returnValue = true;
		switch (selection) {
		case 1:
			addition();
			break;
			
        case 2:
			
			break;
			
        case 3:
        	extraction();
        	break;
        	
        case 4:
        	multiplication();
        	break;
		
        case 5:
        	division();
        	break;
        	

		default:
			returnValue = false;
		}
		return returnValue;
	}



	private void division() {
		// TODO Auto-generated method stub
		
	}



	private void multiplication() {
		calculationMethod('*');
		int[] numbers = inputNumbers();
		int numerator = (numbers[0] * numbers[2]);
		int denominator = (numbers[1]*numbers[3]);
		System.out.println(numerator+"/"+denominator);
		
	}



	private void extraction() {
		calculationMethod('-');
		int[] numbers = inputNumbers();
		int numerator = (numbers[0] * numbers[3])-(numbers[1]*numbers[2]);
		int denominator = (numbers[1]*numbers[3]);
		System.out.println(numerator+"/"+denominator);
		
	}



	private void addition() {
		calculationMethod('+');
		int[] numbers = inputNumbers();
		int numerator = (numbers[0] * numbers[3])+(numbers[1]*numbers[2]);
		int denominator = (numbers[1]*numbers[3]);
		printResult(numerator, denominator);
	}



	private void printResult(int numerator, int denominator) {
		System.out.println("========================================");

		int bcd = calculateBcd(numerator, denominator); // calculate the Biggest Common Divisor
		int newNumerator = -1 * (numerator / (Math.abs(bcd) * -1));
		int newDenominator = Math.abs(denominator / bcd);
		System.err.println("Result is: " + ((newNumerator % newDenominator == 0) ? newNumerator / newDenominator
				: newNumerator + " / " + newDenominator));
		
	}



	private int calculateBcd(int numerator, int denominator) {
		int bcd = 0;
		boolean positiveBcd = true;

		if (numerator < 0) {
			positiveBcd = false;
			numerator *= -1;
		}

		if (denominator > numerator) {
			for (int i = 1; i <= numerator; i++) {
				if (numerator % i == 0 && denominator % i == 0) {
					bcd = i;
				}
			}
		} else {
			for (int i = 1; i <= denominator; i++) {
				if (numerator % i == 0 && denominator % i == 0) {
					bcd = i;
				}
			}
		}
		return positiveBcd ? bcd : -bcd;
	}



	private void calculationMethod(char a) {
		System.out.println("Operation format");
		System.out.println("A/B"+ a + "C/D");
		
	}
	

}
