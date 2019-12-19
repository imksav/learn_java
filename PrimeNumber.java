import java.util.Scanner;
class PrimeNumber{
	public static void main(String[] args) {
		System.out.println("Enter a number to check either a given number is prime or composite: ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int i;
		int flag = 0;
		for (i = 2; i <= (num1 / 2); i++) {
			if (num1 % i == 0) {
				flag = 1;
				break;
			}
		}
			if (flag == 0) {
			System.out.println(num1+ " is Prime Number.");
		}
		else{
			System.out.println(num1+ " is Composite Number.");
			}			
		}
	}