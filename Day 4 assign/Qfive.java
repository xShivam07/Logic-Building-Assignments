// Write a java program to compare the two matrices.
   

import java.util.Scanner;

class Qfive{
	
	public static void main(String args[]){
		Scanner scn  = new Scanner(System.in);

		System.out.println("Enter the number of rows in matrices : ");
		int rows = scn.nextInt();
		System.out.println("Enter the number of columns in matrices: ");
		int cols = scn.nextInt();

		int[][] matrix1 = new int[rows][cols];

		System.out.println("Enter the Elements of matrix1 : ");

		for(int i = 0; i<rows;i++){
			for(int j = 0; j<cols;j++){
				System.out.println("Enter Element [" +(i+1) + "][" + (j+1) + "] :");
				matrix1[i][j] = scn.nextInt();

			}
		}
		int[][] matrix2 = new int[rows][cols];

		System.out.println("Enter the elements of matrix 2 : ");

		for(int i = 0; i<rows; i++){
			for(int j = 0; j< cols;j++){
				System.out.println("Enter Element [" +(i+1) + "][" + (j+1) + "] :");
				matrix2[i][j] = scn.nextInt();


			}
		}
		boolean check = true;
		for(int i =0;i<rows;i++){
			for(int j = 0; j<cols;j++){
				if(matrix1[i][j] != matrix2[i][j]){
					check = false;
					break;	
				}
				
            			
        		}
			if (!check) {
                		break;
			}
        	}
        	if (check) {
            		System.out.println("Matrices are equal.");
        	} else {
            		System.out.println("Matrices are not equal.");
        	}
			
		
		
	}
}