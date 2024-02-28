import java.util.Scanner;
class Qfourteen{

	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scn.nextInt();
		int i = 1;
		int fact = 1;
		while( i<=num ){
			fact = fact * i;
			
			i++;
		}System.out.println("Factorial of " + num + " is : " + fact);

		
		
	}
}
 
//