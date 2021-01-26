package Extra_Programs;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		
		int n, number, temp, total = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		n = input.nextInt();
		number = n;
		while(number != 0)
		{
			temp = number % 10;
			total = total + temp*temp*temp;
			number = number / 10;// TODO Auto-generated method stub
		}
		
		if(total == n) {
			System.out.println(n + " is a Armstrong number");
		}
		else {
			System.out.println(n + " is not a Armstrong number");
		}

	}

}
