package SCS;

import java.util.Scanner;

import apple.laf.JRSUIUtils.Tree;


public class Quân_tốt_cờ_tướng {
	static int H = 3 ;
	static int [][]e = new int[10][9];
	static int []a = {1};
	static int []b = {0};
	static int []c = {1,0,0};
	static int []d = {0,-1,1};
	private static void min(int x,int y,int i) {
		
		int r = x + a[0];
		int c = y + b[0];

		if (r <= hang && r >= 0 && c <= cot && c >= 0) {
			// Ô nào đang an toàn thì sẽ bị ăn
			// Cho thành Unsafe
			if (x[r][c] == OK) {
				x[r][c] = NOT;
				sum--;
				checkQ(r, c, direct);
			} else if (x[r][c] == NOT) {
				// Trường hợp này là đã tính trước đó.
				checkQ(r, c, direct);
			}
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc .nextInt();
		int y = sc .nextInt();
		e[x][y] = 5;
		for (int i =0 ; i <= 8 ; i+= 2) {
			min(x, y, i);
			
			
		}
	}

}
