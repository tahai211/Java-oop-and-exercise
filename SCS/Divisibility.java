package SCS;

import java.util.Scanner;

public class Divisibility {
	private static void check(int n,int x,int y){
		for (int i = 0 ; i < n ; i++) {
			if (i % x == 0 && i% y != 0) {
				System.out.println(i);
			}
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n,x,y;
		for(int i = 0 ; i < t ; i++) {
			n= sc.nextInt();
			x= sc.nextInt();
			if (x<n) {
			y = sc.nextInt();
			if(x % y != 0) {
				check(n, x, y);
			}
			}
			
			
		}

	}

}
