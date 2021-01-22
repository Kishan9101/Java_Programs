package Extra_Programs;

import java.util.Scanner;

public class Check_PrimeNumber {

	public static void main(String[] args) {
		
		int temp;
		boolean isPrime=true;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter any number : ");
		int num = input.nextInt();
		
		input.close();
		
		for(int i=2; i<=num/2; i++){
			temp = num%i;
			if(temp==0){
				isPrime = false;
				break;
				//TODO Auto-generated method stub
			}
			
		}
		if(isPrime) {
			System.out.println(num + " is a Prime number");
    }
		else {
			System.out.println(num + " is not a Prime number");// 
		}

}
}
