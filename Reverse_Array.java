package abcd;

import java.util.Scanner;

public class Practical10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] list = new int[10];
		
		System.out.print("Enter 10 numbers : ");
		for (int i=0; i<list.length; i++)
			list[i] = input.nextInt();
		
		System.out.println("Original Array : ");
		for (int i=0; i<list.length; i++)
			System.out.println(list[i] + " ");
      
		reverse(list);
    
		System.out.println("Reversed Array : ");
		for (int i=0; i<list.length; i++)
			System.out.println(list[i] + " ");// TODO Auto-generated method stub

	}
	
	public static void reverse(int[] arr) {
		for(int i=0; i<arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}

}
