package hust.soict.hedspi.lab01;
import java.util.Scanner;

public class LinearEquation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Programe to solve the linear equation ax + b = 0.");
		System.out.println("Please enter a: ");
		double a = sc.nextDouble();
		System.out.println("Please enter b: ");
		double b = sc.nextDouble();
		
		if(a == 0) {
			if(b == 0) {
				System.out.println("The equation has infinite solutions.");
			}
			else {
				System.out.println("The equation has no solution.");
			}
		}
		else {
			double root = -b/a;
			System.out.println("The equation has unique solution x = "+ root);
		}
		
		sc.close();
	}
}
