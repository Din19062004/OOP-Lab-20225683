import java.util.Scanner;

public class SortAnArray {
	public static void merge(double array[], int L, int M, int R) {
		double tempArray[] = new double[100];
		int i = L, j = M + 1;
		for(int k = L; k <= R; k++) {
			if(i > M) {
				tempArray[k] = array[j];
				j++;
			}
			else if(j > R) {
				tempArray[k] = array[i];
				i++;
			}
			else {
				if(array[i] < array[j]) {
					tempArray[k] = array[i];
					i++;
				}
				else {
					tempArray[k] = array[j];
					j++;
				}
			}
		}
	}
	
	public static void mergeSort(double array[], int L, int R) {
		if(L < R) {
			int M = (L + R)/2;
			mergeSort(array, L, M);
			mergeSort(array, M + 1, R);
			merge(array, L, M, R);
		}
	}
	
	public static double calculateSum(double array[], int arraySize) {
		double sum = 0;
		for(int i = 0; i < arraySize; i++) {
			sum = sum + array[i];
		}
		return sum;
	}
	
	public static double calculateAverage(double array[], int arraySize) {
		double sum = calculateSum(array, arraySize);
		double average = sum / arraySize;
		return average;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the array: ");
		int arraySize = sc.nextInt();
		
		System.out.println("Please enter each element of the array: ");
		double array[] = new double[50];
		for(int i = 0; i < arraySize; i++) {
			array[i] = sc.nextDouble();
		}
		
		mergeSort(array, 0, arraySize - 1);
		System.out.println("The array after being sorted is: ");
		for(int i = 0; i < arraySize; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("\n");
		
		System.out.println("The sum of all elements in this array is: " +calculateSum(array, arraySize));
		System.out.println("The average sum of this array is: " +calculateAverage(array, arraySize));
		sc.close();
	}
}
