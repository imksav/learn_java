// this is wrong code....
// sorry guys......
//very soon it will be resolved.......

import java.util.Scanner;
public class MatrixMultiplication {

	public static void main(String[] args) {
		// declaration of required variables....
		System.out.println("Enter a size of 3X3 matrix:- ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		System.out.println("Enter elements of 3X3 matrix:- ");
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				a[i][j] = sc.nextInt();
				b[i][j] = sc.nextInt();
				c[i][j] = sc.nextInt();
				
				c[i][j] = 0;
				for(int k = 0; k<3; k++) {
					c[i][j] = c[i][j] + ( a[i][k] * b[k][j]);
				}
				System.out.println(c[i][j]+ " ");				
			}
			System.out.println();
		}
	}
}
