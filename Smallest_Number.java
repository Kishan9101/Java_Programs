package Extra_Programs;

import java.util.Scanner;

public class Smallest_Number {

	public static void main(String[] args) {
		
		int num1, num2, num3, temp, result;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		num1 = input.nextInt();
		System.out.print("Enter second number : ");
		num2 = input.nextInt(); 
		System.out.print("Enter third number : ");
		num3 = input.nextInt();
		
		input.close();
		
		temp = num1 < num2 ? num1 : num2;
		result = num3 < temp ? num3 : temp;
		System.out.println("Smallest number is " + result);// TODO Auto-generated method stub

	}

}
