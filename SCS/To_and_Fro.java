package SCS;

import java.util.Scanner;

public class To_and_Fro {
	static String str;
	static String sr;
	static int n;
	static char[][] x;
	static char[][] y;

	private static void input() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			str = sc.next();
			int nuber = str.length() / n;
		
			xeplai(nuber, n, str);
			out(nuber, n);

		}

	}

	private static void out(int number, int n) {
		sr = "";
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < n; j++) {
				y[j][i] = x[i][j];
			}
			
		}
		for (int t = 0;t < n; t++) {
			for (int r = 0; r < number; r++) {
				sr += y[t][r];
			}
		}
		System.out.println(sr);
	}

	private static void xeplai(int a, int b, String str) {
		int dem = 0;
		x = new char[a][b];
		y = new char [b][a];
		for (int i = 0; i < a; i++) {
			if (i % 2 == 1) {
				dem += b -1;
				for (int j = 0; j < b; j++) {
					x[i][j] = str.charAt(dem);
					dem--;
				}
				dem +=b +1;
			} else {
				for (int j = 0; j < b; j++) {
					x[i][j] = str.charAt(dem);
					dem++;
				}
			}
		}
	}

	public static void main(String[] args) {
		input();

	}

}
