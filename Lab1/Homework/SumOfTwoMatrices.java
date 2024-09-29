import java.util.Scanner;

public class SumOfTwoMatrices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of two matrices: ");
		System.out.println("Number of row(s): ");
		int row = sc.nextInt();
		while(row <= 0) {
			System.out.println("Must be greater than 0. Try again.");
		}
		System.out.println("Number of col(s): ");
		int col = sc.nextInt();
		while(col <= 0) {
			System.out.println("Must be greater than 0. Try again.");
		}
		
		System.out.println("Please enter the first matrix: ");
		int matrix1[][] = new int[10][10];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Please enter the second matrix: ");
		int matrix2[][] = new int[10][10];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		
		int resultMatrix[][] = new int[10][10];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		System.out.println("The sum of two entered matrices is: ");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.printf("%d ", resultMatrix[i][j]);
			}
			System.out.printf("\n");
		}
		sc.close();
	}
}
