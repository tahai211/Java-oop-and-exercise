package SCS;

import java.util.Scanner;

public class Đào_vàng_remix {
	
	static int [][]x;
	private static void input(int r,int c) {
		Scanner sc = new Scanner(System.in);
		x = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				x[i][j] = sc.nextInt();
			}
		}
	}
	private static int solve(int r,int c) {
		int hang=0;
		int cot = 0;
		int sum;
		for (int i = 0; i < r; i++) {
			sum = 0;
			for (int j = 0; j < c; j++) {
				sum+= x[i][j];
				
			}
			if (sum ==0) {
				hang ++;
			}
		}
		int g = 0;
		for (int a = 0; a < c; a++) {
			sum = 0;
			for (int b = 0; b < r; b++) {
				
				sum+=x[g+b][a];
				
			}
			if (sum ==0) {
				cot ++;
			}
		}
		return ((hang*r+cot*c)-(hang*cot));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			int r=sc.nextInt();
			int c=sc.nextInt();
			input(r, c);
			int f =solve(r, c);
			System.out.printf("#%d %d",i,f);
		}

	}

}
