import java.util.Scanner;
//Compare integers using if statements, relation operators and equality operators
public class Comparision {

	public static void main(String[] args) {

		// Assigninng the number from user
		Scanner input = new Scanner(System.in);
		// Display the message
			System.out.println("Enter first number:- ");
				int num1 = input.nextInt();
				
				// Display the message
			System.out.println("Enter second number:- ");
				int num2 = input.nextInt();

				// Main program begins here
					if (num1 > num2) {
						System.out.println("The first number " +num1+ " is greater than second number " +num2+ ".");
						}
						else if(num1 < num2) {
							System.out.println("The second number " +num2+ " is greater than first number " +num1+ ".");
						}
						else {
							System.out.println("The first number " +num1+ " is equal to second number " +num2+ ".");
						}			
	}

}
