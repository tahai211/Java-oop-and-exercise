package array;

import java.util.Scanner;

public class Tích_hai_ma_trận {
	static int m,n,p;
	static int [][]x = new int[m][n];
	static int [][]y = new int[n][p];
	private static void input() {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		p = sc.nextInt();
		for(int i = 0;i <m;i++) {
			for(int j = 0 ; j< n;j++) {
				x[i][j] = sc.nextInt();
			}
		}
		for(int t = 0;t <n;t++) {
			for(int r = 0 ; r< n;r++) {
				x[t][r] = sc.nextInt();
			}
		}
	}
	

	public static void main(String[] args) {
		

	}

}
