package array;

import java.util.Scanner;

public class Tim_cap_phan_tu_thuan_trong_mang {
	static int n;
	static int[] x;

	private static void input() {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
	}

	private static void bSearch(int a, int y) {
		for (int i = 0; i < n; i++) {
			if (i > a && x[i] > y) {
				System.out.printf("( %d , %d) = (%d , %d)\n", a, i, y, x[i]);
			}
		}
	}

	private static void output() {
		for (int i = 0; i < n; i++) {
			System.out.printf(i + "   ");
		}
		System.out.printf("\n");
		for (int i = 0; i < n; i++) {
			System.out.printf(x[i] + "   ");
		}
		for (int i = 0; i < n; i++) {
			bSearch(i, x[i]);
		}

	}

	public static void main(String[] args) {
		input();
		output();

	}

}
