package SCS;

import java.util.Scanner;

public class P141PROJ_ROUND1J_TestIQ {
	//NÊN VIẾT BẰNG C/C++
	static char[][] a = new char[4][4];
	private static int solve(){
		int dem = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (((int)a[i][j] + (int)a[i][j+1] + (int)a[i+1][j] +(int)a[i+1][j+1]) != 2*('#'+'*')) {
					dem ++;
				}

			}
		}
		return dem;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				a[i][j] = sc.next().charAt(0);

			}
		}
		if(solve() > 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}
