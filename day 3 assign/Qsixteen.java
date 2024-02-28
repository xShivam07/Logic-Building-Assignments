import java.util.Scanner;
class Qsixteen{

	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number minimum be two digit : ");
		int num = scn.nextInt();

		int count = 0;
		for(int div = 2; div*div <= num; div++){
			if(num % div == 0){
				count++;
				break;
		
			}
		}
		if(count == 0){
			System.out.println("Prime");
		}
		else{
			System.out.println("Not Prime");
		}
		
	}
}
 
//