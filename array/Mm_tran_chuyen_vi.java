package array;

import java.util.Scanner;

public class Mm_tran_chuyen_vi {
	static int t;
	static int n;
	static int[][] x;
	static int[][] y;
	private static void input() {
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		n = sc.nextInt();
		x = new int[t][n];
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < n; j++) {
				x[i][j] = sc.nextInt();
			}
		}

	}

	private static void output() {
		y = new int[n][t];
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < n; j++) {
				y[j][i]=x[i][j];

			}
		}
		for (int e = 0; e < n; e++) {
			for (int f = 0; f < t; f++) {
				System.out.println(y[e][f]);

			}
		}
	}

	public static void main(String[] args) {
		input();
		output();
	}

}
