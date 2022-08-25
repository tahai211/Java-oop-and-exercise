package SCS;

import java.util.Scanner;

public class SUM_OF_PRODUCT {
	private static void solve(int t) {
	
		int s = 0;
		
		for (int i = 1; i <= t; i++) {
		
			
			
			s += i * ((int) (t/i));
			}
		System.out.println(s);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			solve(n);
		}

	}

}
