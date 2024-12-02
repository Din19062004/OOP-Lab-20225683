package hust.soict.hedspi.lab01;
import java.util.Scanner;

public class DrawATriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a positive integer: ");
		int n = sc.nextInt();
		while(n <= 0) {
			System.out.println("Must be a positive integer. Try again!");
			System.out.println("Please enter a positive integer: ");
			n = sc.nextInt();
		}
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for(int j = n - i + 1; j <= n + i - 1; j++) {
				System.out.print("*");
			}
			for(int j = n + i; j <= 2*n - 1; j++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
