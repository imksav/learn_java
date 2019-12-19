import java.util.Scanner;
class Palindrome{
	public static void main(String[] args) {
		System.out.println("Enter a number to check either a number is Palindrome or not:- ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int number = num;
		int sum = 0;
		int rem;

		while(num>0){
			rem = num % 10;
			num = num / 10;
			sum = sum * 10 + rem;
		}
		if (number == sum) {
			System.out.println("The number is Palindrome.\n");
		}
		else{
			System.out.println("The number is not Palindrome.\n");

		}
	}
}