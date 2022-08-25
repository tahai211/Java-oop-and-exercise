package SCS;

import java.util.Scanner;

public class Vùng_bao_lớn_nhất {
	static int m;
	static int n;
	static int h;
	static int w;
	static int[][] x;

	private static void input() {
		Scanner sc = new Scanner(System.in);
		x = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				x[i][j] = sc.nextInt();
			}
		}
	}

	private static int tong_vong(int a, int b) {
		int tong = 0;
		for (int i = a; i < a + h; i++) {
			for (int j = b; j < b + w; j++) {
				if ((i == a || i == a + h - 1 || j == b || j == b + w - 1) && x[i][j] % 2 == 0) {
					tong += x[i][j];
				}
			}
		}
		return tong;
	}

	private static void solve(int t) {
		int sum = 0;
		int d = 0;
		for (int i = 0; i < m - h; i++) {
			for (int j = 0; j < n - w; j++) {
				d = tong_vong(i, j);
				if (sum < d) {
					sum = d;
				}
			}
		}
		System.out.printf("#%d %d", t, sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			h = sc.nextInt();
			w = sc.nextInt();
			m = sc.nextInt();
			n = sc.nextInt();

			input();
			solve(t);

		}

	}

}
