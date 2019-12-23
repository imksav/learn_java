import java.util.Scanner;
public class Assignment1Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float sum = 0;
		
		System.out.println("Enter the number of days:- ");
		
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		int []a = new int[days];
		
		//	assigning the days............
		System.out.println("Enter tempreature of each day:- ");
		for(int i = 0; i < days; i++) {
			a[i] = sc.nextInt();
		}
		
		//	printing all days you input....
		for(int i = 0; i < days; i++) {
			System.out.println("The temperature of day "+ (i+1) + " is " +a[i]+ " degree Fahrenheit.");
		}
		
			//	checking category of temperature either very hot or pleasant or very cold......
		for(int i = 0; i < days; i++) {
			if(a[i] > 85) {
				System.out.println("The temperature of day "+ (i+1) + " is very hot.");
			}
			else if(a[i] > 65) {
				System.out.println("The temperature of day "+ (i+1) + " is pleasant.");
			}
			else {
				System.out.println("The temperature of day "+ (i+1) + " is very cold.");
			}
		}
		
		
		//	for total temperature calculation...... 
		for(int i = 0; i < days; i++) {
			sum = a[i] + sum;
		}
		
		//	for average temperature calculation......
		float avg = (sum/days);
		
		//printing total temperature and average temperature.....
		System.out.println("Total temperature throughout " +days+ " days is " +sum+ " degree Fahrenheit." );
		System.out.println("Average temperature throughout " +days+ " days is " +avg+ " degree Fahrenheit." );
	}
}
