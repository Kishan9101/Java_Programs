package Extra_Programs;

import java.util.Scanner;

public class Grade_with_Marks {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Marks : ");
		int marks = input.nextInt();
		
		if(marks <= 100 && marks >= 90){
			System.out.println("You passed with Grade A");// TODO Auto-generated method stub
		}else if(marks < 90 && marks >= 80) {
			System.out.println("You passed with Grade B");
		}else if(marks < 80 && marks >= 70) {
			System.out.println("You passed with Grade C");
		}else if(marks < 70 && marks >= 60) {
			System.out.println("You passed with Grade D");
		}else if(marks < 60 && marks >= 50) {
			System.out.println("You passed with Grade E");
		}else {
			System.out.println("You passed with Grade F");
		}

		input.close();
		
	}

}
