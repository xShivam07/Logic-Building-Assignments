// Write a java program that calculates the sum of multples of 3 in a sequence of numbers.
   

import java.util.Scanner;

class Qthree{
	
	public static void main(String args[]){
		Scanner scn  = new Scanner(System.in);

		int n  = scn.nextInt();

		int sum = 0;

		for(int i = 0; i<n;i++){
			int t = 2*(i-1);
			if(t % 3 == 0){
				sum = t;
			}
		}
		System.out.println("Sum: " + sum);
		
	}
}