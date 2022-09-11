package HW001;

import java.util.Scanner;

public class Eratosthenes {
	private Scanner input;


	public static void main(String[] args)  {
		
		Eratosthenes find = new Eratosthenes();
		find.primeNumbers();
		System.out.println("\nBye...");
	}

	private void primeNumbers() {
		this.input = new Scanner(System.in);
		System.out.println("Welcome to Eartosthenes!");
		System.out.print("Please enter your number for finding prime numbers ");
		int number = input.nextInt();
		int[][] numbers = array(number);
		numbers[0][1] = 0;

		for (int i = 1; i < number; i++) {
			if (numbers[i][1] == 1) {

				notPrime(numbers, numbers[i][0]);
			}
		}
		primeNumbers(numbers);
		input.close();
	}

	private void notPrime(int[][] numbers, int primeNumber) {
		
		for (int i = primeNumber; i < numbers.length; i++) {
			if (numbers[i][1] == 1 && numbers[i][0] % primeNumber == 0) {
				numbers[i][1] = 0;

			}
		}

	}

	private void primeNumbers(int[][] numbers) {
		System.out.print("Prime numbers are: ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i][1] == 1) {
				System.err.print(numbers[i][0] + " ");
			}
		}
	
	}

	private int[][] array(int number) {

		int[][] numbers = new int[number][2];
		for (int i = 0; i < number; i++) {
			numbers[i][0] = i + 1;
			numbers[i][1] = 1;
		}
		return numbers;
	}
	
}