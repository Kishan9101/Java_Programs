package Extra_Programs;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Multiplication table num : ");
		int num = input.nextInt();
		
		System.out.print("Enter the limit n : ");
		int n = input.nextInt();
		
		for(int i = 1; i <= n; i++){
			System.out.println(num + "*" + i + "=" + (num*i));// TODO Auto-generated method stub
		}
		
		input.close();
 
	}

}
