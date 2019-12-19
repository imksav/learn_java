import  java.util.Scanner;
class SumArray{
	public static void main(String[] args) {
		int sum = 0;
		float avg;
		int i;
		System.out.println("Enter a number of elements:- ");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[]a = new int[size];
		System.out.println("Enter a number of elements:- ");
		for (i = 0; i<size ;i++ ) {
			a[i] = input.nextInt();
			sum = sum + a[i];
		}
		avg	= (float) sum/size;
		System.out.println("The sum is " +sum+ " .");
		System.out.println("The average is " +avg+ " .");
	}
}