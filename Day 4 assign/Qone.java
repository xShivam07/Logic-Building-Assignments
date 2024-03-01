// Write a java program that calculates the average 
   //of elements in an integer array.

import java.util.Scanner;

class Qone{
	
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
		
		//Calculate sum...
		int sum =0;
		for(int i = 0; i<size; i++){
			sum = sum + num[i];

		}

		//Compute Average....
		double avg = sum / size;

		System.out.println("Average of elements is " + avg);
	}
}