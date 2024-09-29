import java.util.Scanner;

public class TwoLinearEquations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to solve two linear equations two variables a1x + b1y = c1 and a2x + b2y = c2.");
		
		System.out.println("The first equation:");
		System.out.println("Please enter a1: ");
		double a1 = sc.nextDouble();
		while(a1 == 0) {
			System.out.println("Must be not equal to 0. Try again");
			System.out.println("Please enter a1: ");
			a1 = sc.nextDouble();
		}
		System.out.println("Please enter b1: ");
		double b1 = sc.nextDouble();
		System.out.println("Please enter c1: ");
		double c1 = sc.nextDouble();
		
		System.out.println("The second equation: ");
		System.out.println("Please enter a2: ");
		double a2 = sc.nextDouble();
		while(a2 == 0) {
			System.out.println("Must be not equal to 0. Try again");
			System.out.println("Please enter a2: ");
			a2 = sc.nextDouble();
		}
		System.out.println("Please enter b2: ");
		double b2 = sc.nextDouble();
		System.out.println("Please enter c2: ");
		double c2 = sc.nextDouble();
		
		double d = a1 * b2 - a2 * b1;
		
		if(d != 0) {
			double x = (c1 * b2 - b1 * c2) / d;
			double y = (a1 * c2 - c1 * a2) / d;
			System.out.println("The equation has unique solution: (" + x + ", " + y + ")");
		}
		else {
			double ratio1 = a1 / a2;
			if(c1 == 0 && c2 == 0) {
				System.out.println("The equation has infinitely solutions.");
			}
			else if(c1 == 0 || c2 == 0) {
				System.out.println("The equation has no solution.");
			}
			else if(c1 != 0 && c2 != 0) {
				double ratio2 = c1 / c2;
				if(ratio1 == ratio2) {
					System.out.println("The equation has infinitely solutions.");
				}
				else {
					System.out.println("The equation has no solution.");	
				}
			}	
		}
		sc.close();
	}
}
