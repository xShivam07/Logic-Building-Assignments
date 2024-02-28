import java.util.Scanner;
class Qfifteen{

	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number minimum be two digit : ");
		int num = scn.nextInt();

		int count = num;
		int sum = 0;
		do{
			int digit = count % 10;
			sum = sum + digit;
			count /= 10;
			
		}while(count != 0);
		System.out.println("Sum of digits of " + num + " is: " + sum);
		
		
	}
}
 
//