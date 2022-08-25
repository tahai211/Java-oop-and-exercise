package array;

import java.util.Scanner;

public class Tich_vo_huong_cua_vec_to {
	static int n;
	static int[] x;
	static int[] y;

	private static void input() {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		x = new int[n];
		y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		for (int j = 0; j < n; j++) {
			y[j] = sc.nextInt();
		}
	}
	private static void scalar() {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += (x[i] * y[i]);
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		

	}

}
