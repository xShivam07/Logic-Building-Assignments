import java.util.Scanner;
class Qsixteen{

	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number minimum be two digit : ");
		int num = scn.nextInt();

		if(num % 2 == 0){
			System.out.println("Prime");
		
		}
		else{
			System.out.println("Not Prime");
		}
	}
}
 
//