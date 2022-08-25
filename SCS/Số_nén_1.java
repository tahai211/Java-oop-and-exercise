package SCS;

import java.util.Scanner;

public class Số_nén_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc .nextInt();
		for(int i = 1 ; i <= t ; i++) {
			int n = sc .nextInt();
			int sum =0 ;
			int x = n;
			while(x > 0) {
				sum = sum *10 + x %10;
				x /= 10;
			}
			System.out.printf("#%d  %d\n",i,sum);
		}

	}

}

