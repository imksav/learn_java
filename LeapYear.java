import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	System.out.println("Enter a year to check either a leap year or not:- ");
	int year = input.nextInt();

		// Main program begins here
		if(year % 400 == 0){
		System.out.println(+year+ " year is Leap year.");
		}
		else if(year % 100 == 0){
		    System.out.println(+year+ " year is not Leap year.");
		}
		else if(year % 4 == 0){
		    System.out.println(+year+ " year is Leap year");
		}
		else{
		System.out.println(+year+ " year is not Leap year");
		}
	}
}