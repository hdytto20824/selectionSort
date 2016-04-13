package sort;

import java.util.Scanner;

public class sort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Array Size:");

		int arraySize = scanner.nextInt();
		int[] size = new int[arraySize];

		for (int i = 0; i < size.length; i++) {
			System.out.printf("Input Number%d：", i + 1);
			int input = scanner.nextInt();
			size[i] = input;
		}

		System.out.print("Before: ");
		for (int i = 0; i < size.length; i++) {
			System.out.print(size[i] + " ");
		}

		System.out.println();
		System.out.print("After : ");
		for (int a = arraySize; a >= 0; a--) {
			for (int k = 0; k < arraySize - 1; k++) {
				if (size[k] > size[k + 1]) {
					int j = 0;
					j = size[k];
					size[k] = size[k + 1];
					size[k + 1] = j;
				}
			}

		}

		for (int i = 0; i < size.length; i++) {
			System.out.print(size[i] + " ");
		}
	}
}