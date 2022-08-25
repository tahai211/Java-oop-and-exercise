package SCS;

import java.util.Iterator;
import java.util.Scanner;

public class Truy_vấn_ma_trận {
	static int n, m, k, dem;
	static int[][] a;
	static int[][] c;
	static int[][] b;

	public static void input(Scanner sc) {
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();
		a = new int[n][m];
		b = new int[k][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < 2; j++) {
				b[i][j] = sc.nextInt();
			}
		}
	}

	public static void up(int s) {
		c = new int[n][m];

		int i = 0;
		if (i < s) {
			for (int r = n - s; r < n; r++) {
				for (int j = 0; j < m; j++) {
					c[r][j] = a[i][j];
				}
				i++;
			}

		}
		if (i >= s && i < n) {
			for (int r = 0; r < n - s; r++) {
				for (int j = 0; j < m; j++) {
					c[r][j] = a[i][j];
				}
				i++;
			}
		}
		
	}

	public static void down(int s) {
		c = new int[n][m];
		int i = 0;
		if (i < n - s) {
			for (int r = s; r < n; r++) {
				for (int j = 0; j < m; j++) {
					c[r][j] = a[i][j];
				}
				i++;
			}

		}
		if (i >= n - s && i < n) {
			for (int r = 0; r < s; r++) {
				for (int j = 0; j < m; j++) {
					c[r][j] = a[i][j];
				}
				i++;
			}
		}
		
	}

	public static void left(int s) {
		c = new int[n][m];
		int r = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (j < s) {
					r = j+(m-s);
					c[i][r] = a[i][j];
				}
				else {
					r = j-s;
					c[i][r] = a[i][j];
				}
			}

		}
	}

	public static void right(int s) {
		c = new int[n][m];
		int r = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (j < m-s) {
					r = j+s;
					c[i][r] = a[i][j];
				}
				else {
					r = j-(m-s);
					c[i][r] = a[i][j];
				}
			}

		}
	}
	static int []dx = {0,1,0,1};
	static int []dy = {0,0,1,1};
	
	public static int check(int a,int b) {
		int t = 0;
		for (int i = 0; i <4; i++) {
			if(a == n-1 || b == m-1) {
				return 0;
			}
			int x = a+dx[i];
			int y = b+dy[i];
			if (x < n && x >= 0 && y < m && y >= 0) {
				
				t += c[x][y];
			}
			
		}
		if(t ==4 || t == 8) {
			
			return 1;
		}
		t =0;
		return 0;
	}

	public static void solve() {
		dem = 0;
		for (int i = 0; i < k; i++) {
			if (b[i][0] == 1) {
				down(b[i][1]);
			}
			if (b[i][0] == 2) {
				right(b[i][1]);
			}
			if (b[i][0] == 3) {
				up(b[i][1]);
			}
			if (b[i][0] == 4) {
				left(b[i][1]);
			}
			for (int t = 0; t < n; t++) {
				for (int j = 0; j < m; j++) {
					
					dem += check(t, j);
					
				}
				
			}
			System.out.printf("%d  ", dem);
			dem =0;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			input(sc);
			System.out.printf("# %d ",i+1);
			solve();
		}

	}

}
