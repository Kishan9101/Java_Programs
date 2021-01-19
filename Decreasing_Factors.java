package abcd;

import java.util.Scanner;

public class Practical8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		int a = input.nextInt();
		
		for(int i=2; a>1;){
			
			if(a%i == 0){
				System.out.println(i);
				a = a / i;// TODO Auto-generated method stub
			}
			
			else {
				i++;
			}
		}
       
		input.close();
	}

}
