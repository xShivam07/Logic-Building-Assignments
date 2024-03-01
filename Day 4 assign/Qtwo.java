// Write a java program that finds the minimum and maximum values in an array.
   

import java.util.Scanner;

class Qtwo{
	
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		// Take size input..

		int size = scn.nextInt();

		//Create an Array

		int[] num = new int[size];

		// Take elements of an array...

		System.out.println("Enter the elements of an array : ");

		for(int i = 0; i<size; i++){
			System.out.println("Element "+ (i+1) + " is ");
			num[i] = scn.nextInt();	
		}
		
		//initialize the value of min and max...
		
		int min = num[0];
		int max = num[0];

		for(int i =1; i<size; i++){
			if(num[i] < min){
				min = num[i];
			}
			if(num[i] > max){
				max = num[i];
			}
		}

		//Display the value of min and max....

		System.out.println("Minimum element of array : " + min);
		System.out.println("Maximum element of array : " + max);
		
	}
}