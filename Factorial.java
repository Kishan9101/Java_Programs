package Extra_Programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int num = input.nextInt();
		
		int factorial = fact(num);
		
		System.out.println("Factorial of number is " + factorial);// TODO Auto-generated method stub

	}
	
	static int fact(int n) {
		int output;
		if(n == 1) {
			return 1;
		}
		output = fact(n-1)*n;
		return output;
	}

}
