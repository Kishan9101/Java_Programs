package Extra_Programs;

import java.util.Scanner;

public class Check_PerfectSquare {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any number : ");
		double num = input.nextDouble();
		input.close();
		
		if(checkPerfectSquare(num)){
			System.out.println(num + " is a Perfect Square");
		}
		else {
			System.out.println(num + " is not a Perfect Square");
		}

	}
	static boolean checkPerfectSquare(double x) {
		
		double sq = Math.sqrt(x);
		
		return((sq - Math.floor(sq)) == 0); // Math.floor() returns closest value of given number
	}

}
