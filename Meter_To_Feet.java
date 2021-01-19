package abcd;

import java.util.Scanner;

public class Practical3 {

	public static void main(String[] args) {
		
		System.out.println("Enter a number in meter : ");
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		double feet = num*3.28084;
		System.out.println("Value in feet is : "+feet);// TODO Auto-generated method stub

	}

}
