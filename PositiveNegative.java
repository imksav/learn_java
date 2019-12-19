import java.util.Scanner;
class PositiveNegative{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number to check either +ve or -ve or Neutral:- ");
	float num = input.nextFloat();
		if (num > 0) {
			System.out.println("The number " +num+ " is Positive.");
		}
		else if (num < 0) {
			System.out.println("The number " +num+ " is Negative.");
		}
		else{
			System.out.println("The number " +num+ " is Neutral.");
		}
	}
}