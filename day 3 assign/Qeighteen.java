import java.util.Scanner;
class Qeighteen{

	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a first number : ");
		int num1 = scn.nextInt();
		System.out.print("Enter a second number : ");
		int num2 = scn.nextInt();

		
		int c;
		System.out.println("Choose an Operation:");
        	System.out.println("1. Addition");
        	System.out.println("2. Subtraction");
        	System.out.println("3. Multiplication");
        	System.out.println("4. Division");
        	System.out.print("Enter your choice: ");
        	int i = scn.nextInt();
		
		switch(i){
		case 1: 
			 c = num1 + num2;
			System.out.println("Result : " + num1 + "+" + num2 + "=" + c);
			break;

		case 2: 
			c = num1 - num2;
			System.out.println("Result : " + num1 + "-" + num2 + "=" + c);
			break;
		case 3: 
			c = num1 * num2;
			System.out.println("Result : " + num1 + "*" + num2 + "=" + c);
			break;
		case 4: 
			if(num2 != 0){
			c = num1 / num2;
			System.out.println("Result : " + num1 + "/" + num2 + "=" + c);
			}else{
				System.out.println("Cannot Divide by zero");
			}
			break;
		default:
			System.out.println("Invalid choice");
		}

		
		
	}
}
 
//