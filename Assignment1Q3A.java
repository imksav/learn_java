import java.util.Scanner;
public class Assignment1Q3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a size of elements:- ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int []a = new int[size];
		
		System.out.println("Enter " +size+ " elements:- ");
			for(int i = 0; i < size; i++) {
				a[i] = sc.nextInt();
			}
			for(int i = 0; i < size; i++) {
				for(int j = i + 1; j < size; j++) {
					if(a[i] > a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] =	temp;				
					}
				}
			}
			System.out.println(a[size - 1]);
		}
}
