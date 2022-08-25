package SCS;

import java.util.Arrays;

import java.util.Scanner;

public class Count_the_Pairs {
	static int n, k;
	static int []x;
	private static void input() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		x = new int [n];
		for (int i = 0 ; i < n ; i++) {
			x[i] = sc.nextInt();
		}
	}
	private static int bSearch(int L,int R,int key) {
		int mid;
		while(L <= R) {
			 mid = L +(R-L)/2;
			if(x[mid] == key) {
				return 1;
			}
			else if(x[mid] > key) {
				R = mid - 1;
			}
			else if(x[mid] < key) {
				L = mid + 1;
			}
		}
		return 0;
	}
	private static void solve() {
		Arrays.sort(x);//sap xep mang
		int tem = 0;
		for (int i = 0 ; i < n ; i++) {
			tem +=bSearch(i, n-1 ,x[i]+k);
		}
		System.out.println(tem);
	}
	public static void main(String[] args) {
		input();
		solve();
	}

}
