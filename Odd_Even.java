import java.util.Scanner;
class Odd_Even{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number to check either Odd or Even:- ");
	int num1 = input.nextInt();

	// logical format

		if(num1 % 2 == 0){
		System.out.println("The entered number " +num1+ " is Even.");
		}
		else{
		System.out.println("The entered number " +num1+ " is Odd.");
		}
	}
}