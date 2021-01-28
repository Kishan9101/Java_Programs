package Extra_Programs;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		double num1 = input.nextDouble();
		System.out.print("Enter second number : ");
		double num2 = input.nextDouble();
		
		System.out.print("Enter an Operator(+, -, *, /) : ");
		char operator = input.next().charAt(0);
		
		input.close();
		double output;
		
		switch(operator) 
		{
		   case '+':
			   output = num1 + num2;
			   break;
			   
		   case '-':
			   output = num1 - num2;
			   break;
			   
		   case '*':
			   output = num1 * num2;
			   break;
			   
		   case '/':
			   output = num1 / num2;
			   break;
			   
			   default:
				   System.out.println("Please enter suitable operator");
				   return;
		}
		
		System.out.println(num1 + " " + operator + " " + num2 + " : " + output);
	}

}
