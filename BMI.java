package Extra_Programs;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds : ");
		double weight = input.nextDouble();
		
		System.out.print("Enter height in inches : ");
		double height = input.nextDouble();
		
		double bmi = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);
		
		System.out.println(bmi);
		
		if(bmi < 18.5){
			System.out.println("You are underweight");// TODO Auto-generated method stub
		}else if(bmi < 25.0 && bmi >= 18.5) {
			System.out.println("You are normal");
		}else if(bmi < 30.0 && bmi >= 25.0) {
			System.out.println("You are overweight");
		}else {
			System.out.println("You are obese");
		}
       
	    input.close();	 
		
	}

}
