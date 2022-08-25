package SCS;

import java.util.Scanner;

public class Dò_mìn_remix {
	static int m, n;
	static char[][] x;

	private static void input() {
		Scanner sc = new Scanner(System.in);
		x = new char[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				x[i][j] = sc.next().charAt(0);

			}

		}
	}

	private static int check(int row, int col) {
		int[] dx = { row, row, row + 1, row + 1, row + 1, row - 1, row - 1, row - 1 };
		int[] dy = { col + 1, col - 1, col - 1, col, col + 1, col - 1, col, col + 1 };
		int dem = 0;
		for (int i = 0; i < 8; i++) {
			if (dx[i] <= m && dx[i] >= 0 && dy[i] <= n && dy[i] >= 0) {
				
				if (x[dx[i]][dy[i]] == '*') {
					dem++;
				}
			}
		}
		return dem;

	}

	private static int solve() {
		int dem = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (x[i][j] == '.') {
					dem += check(i, j);
					
				}
				else if (x[i][j] == '*') {
					continue;
				}

			}
		}
		return dem;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			m = sc.nextInt();
			n = sc.nextInt();
			input();
			int sesult = solve();
			System.out.println("Case #" + i + ":" + sesult);

		}

	}

}
