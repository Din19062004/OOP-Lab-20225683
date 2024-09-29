import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to solve quadratic equation ax^2 + bx + c = 0.");
		
		System.out.println("Please enter a: ");
		double a = sc.nextDouble();
		while(a == 0) {
			System.out.println("Must be not equal to 0. Try again");
			System.out.println("Please enter a: ");
			a = sc.nextDouble();
		}
		
		System.out.println("Please enter b: ");
		double b = sc.nextDouble();
		
		System.out.println("Please enter c: ");
		double c = sc.nextDouble();
		
		double delta = b*b - 4*a*c;
		
		if(delta < 0) {
			System.out.println("The equation has no solution.");
		}
		else if(delta == 0) {
			double root = -b/(2*a);
			System.out.println("The equation has a double root: "+ root);
		}
		else {
			double sqrt = Math.sqrt(delta);
			double x1 = (-b + sqrt)/(2*a);
			double x2 = (-b - sqrt)/(2*a);
			System.out.println("The equation has two root: " + x1 + " and " + x2);
		}
		sc.close();
	}
}
