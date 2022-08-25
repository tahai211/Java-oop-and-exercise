package SCS;

import java.util.Scanner;

public class Hệ_thống_viễn_thông {
	static int m, n;
	static char[][] matrix;
	static int cnt;

	private static void input() {
		Scanner sc = new Scanner(System.in);
		cnt = 0;
		matrix = new char[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.next().charAt(0);
				if(matrix[i][j] == 'H') {
					cnt++;
				}
			}
		}
	}

	private static void check(int x, int y, int delta) {
		int[] dx = { x, x - delta, x, x + delta };
		int[] dy = { y - delta, y, y + delta, y };
		for (int i = 0; i < 4; i++) {
			if (dx[i] <= m && dx[i] >= 0 && dy[i] <= n && dy[i] >= 0) {
				if (matrix[dx[i]][dy[i]] == 'H') {
					matrix[dx[i]][dy[i]] = 'X';
					cnt--;
				}
			}
		}
	}

	private static void solve() {

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 'A') {
					check(i, j, 1);

				} else if (matrix[i][j] == 'B') {
					check(i, j, 1);
					check(i, j, 2);

				} else if (matrix[i][j] == 'C') {
					check(i, j, 1);
					check(i, j, 2);
					check(i, j, 3);

				}
			}
		}
	}
	private static void output(int t) {
		System.out.printf("#%d %d",t,cnt);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			m = sc.nextInt();
			n = sc.nextInt();
			input();
			solve();
			output(t);
		}

	}

}
