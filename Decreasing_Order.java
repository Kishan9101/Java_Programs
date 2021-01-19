package abcd;

import java.util.Scanner;

public class Practical5 {

	public static void main(String[] args) {
		
		int i,j,arr[] = {0,0,0};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three numbers : ");
		
		for(i=0; i<3; i++)
		     arr[i] = input.nextInt();
		     
		for(i=0; i<3-1; i++)
			
			for(j=0; j<3-i-1; j++)
				
				if(arr[j] < arr[j+1]){
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;// TODO Auto-generated method stub
				}
		
		System.out.print("Decreaseing Order : ");
		for(i=0; i<3; i++)
			System.out.println(arr[i]);

	}

}
