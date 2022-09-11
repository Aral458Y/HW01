package HW001;

import java.util.Scanner;

public class EthiopianMltiplication {
	
	private Scanner input;

	public static void main(String[] args) {
		
		EthiopianMltiplication calculation = new EthiopianMltiplication();
		
		calculation.numbers();


	}

	private void numbers() {
		this.input = new Scanner(System.in);
		int multiply = 0;
		System.out.println("enter first number");
		int x = input.nextInt();
		System.out.println("enter second number");
		int y = input.nextInt();
		input.close();
		while(x>0) {
			if(x%2==0) {
				System.err.println(x+"   "+y);
			
			}
			else {
				System.out.println(x+"   "+y);
				multiply +=y;
				
			}
			
			x /=2;
			y *=2;
			
		}
		
		System.out.println("Result:  "+multiply);
	}

}
