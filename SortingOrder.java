import java.util.Scanner;
public class SortingOrder {

	public static void main(String[] args) {

		//declaration of required variables....
		int size, temp;
		System.out.print("Enter a number of elements in an array:- ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter " +size+ " elements:- ");
		for(int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < size; i++) {
			for(int j = i + 1; j < size; j++) {
				if(a[i] > a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
			}
		System.out.println("Sorting in ascending order:- ");
		for(int i = 0; i < size; i++) {
			System.out.print(a[i]+ ",");
		}
	}
}
