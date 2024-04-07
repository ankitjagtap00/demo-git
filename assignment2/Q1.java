package assignment2;

import java.util.Scanner;

public class Q1 {

	Scanner sc = new Scanner(System.in);
	int n, a = 0, b = 1, c;

	public void fibonacciIteration() {
		System.out.println("enter the numer");
		n = sc.nextInt();
		System.out.print(a + " " + b);
		for (int i = 2; i <= n; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
	}
	public void fibonacciRecursion(int n) {
		if (n > 0) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
			n--;
			fibonacciRecursion(n);
		}
	}

	public void fibonacciArray(int arr[], int n) {
		for (int i = 2; i < n; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}

		System.out.println("fibonacci series is:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}