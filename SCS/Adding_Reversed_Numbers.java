package SCS;

import java.util.Scanner;

public class Adding_Reversed_Numbers {
	private static int reverse(int a) {
		int s = a;
		int j = 0;
		while (s >= 1) {
			s = s / 10;
			j++;

		}

		int len = 0;
		int[] x = new int[j];
		while (a > 0) {
			x[len++] = a % 10;
			a = a / 10;

		}
		a = 0;
		for (int i = 0; i < j; i++) {
			a = a * 10 + x[i];
		}
		return a;
	}

	public static void main(String[] args) {
		/*
		 * Input The input consists of N cases (equal to about 10000). The first line of
		 * the input contains only positive integer N. Then follow the cases. Each case
		 * consists of exactly one line with two positive integers separated by space.
		 * These are the reversed numbers you are to add.
		 * 
		 * Output For each case, print exactly one line containing only one integer -
		 * the reversed sum of two reversed numbers. Omit any leading zeros in the
		 * output.
		 */

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int m, n;
		for (int i = 0; i < t; i++) {
			m = sc.nextInt();
			n = sc.nextInt();
			int x = reverse(m);
			int y = reverse(n);
			int a = x + y;
			System.out.println(reverse(a));

		}

	}

}
