// Write a java program that add two matrices of same size.
   

import java.util.Scanner;

class Qfour{
	
	public static void main(String args[]){
		Scanner scn  = new Scanner(System.in);
		
		System.out.println("Enter number of rows of the matrix  : ");
		int rows  = scn.nextInt();
		System.out.println("Enter number of columns of the matrix  : ");
		int cols = scn.nextInt();

		int[][] matrix1 = new int[rows][cols];

		System.out.println("Enter the Elements for matrix 1 : ");

		for(int i = 0;i < rows; i++){
			for(int j = 0; j < cols;j++){
				System.out.println("Enter the element ["+ (i + 1) + "][" + (j + 1) + "] : ");
				matrix1[i][j] = scn.nextInt();
			}
		}
		int[][] matrix2 = new int[rows][cols];

		System.out.println("Enter the Elements for matrix 2 : ");

		for(int i = 0; i<rows;i++){
			for(int j = 0; j<cols;j++){
				System.out.println("Enter the element ["+ (i + 1) + "][" + (j + 1) + "] : ");
				matrix2[i][j] = scn.nextInt();
			}
		}

		int[][] result = new int[rows][cols];

		for(int i = 0; i < rows;i++){
			for(int j = 0; j<cols;j++){
				result[i][j] = matrix1[i][j] + matrix2[i][j];

			}
		}
		
		System.out.println("Sum of the matrices : ");

		for(int i = 0; i<rows;i++){
			for(int j = 0; j<cols; j++){
				System.out.print(result[i][j] +" " );
			}
		System.out.println();
		}	
		
		
		
		
		
	}
}