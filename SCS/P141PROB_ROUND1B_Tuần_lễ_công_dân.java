package SCS;

import java.util.Scanner;

public class P141PROB_ROUND1B_Tuần_lễ_công_dân {
	static char [][]x ;
	static int Q_x[] = { 0, 0, 1, 1, 1, -1, -1, -1 };
	static int Q_y[] = { 1, -1, -1, 0, 1, -1, 0, 1 };
	int demBT ()
	{
		
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int R= sc.nextInt();
	int C = sc.nextInt();
	x = new char[R][C];
	for(int i = 0 ; i < R ; i++) {
		for ( int j = 0 ; j < R ; j++) {
			x[i][j] = sc .next().charAt(0);
		}
	}
	}

}
