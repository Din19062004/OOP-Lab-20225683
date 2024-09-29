import java.util.Scanner;

public class Calculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the first number: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Please enter the second number: ");
		double num2 = sc.nextDouble();
		
		double sum = num1 + num2;
		double difference = num1 - num2;
		double product = num1 * num2;
		
		
		System.out.println("The sum of two numbers is: "+ sum);
		System.out.println("The difference of two numbers is: "+ difference);
		System.out.println("The product of two numbers is: "+ product);
		
		try {
			if (num2 == 0) {
				throw new ArithmeticException("Division by zero is not allowed!");
			}
			else {
				double division = num1 / num2;
				System.out.println("The division of two numbers is: "+ division);
			}
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}
