package SCS;

import java.util.Scanner;

public class Bóng_đá {
	static int [][] A;
	static int n;
	
	private static void k_thang() {
		for (int i = 0 ; i < n ; i++) {
			int thang =0;
			int thua =0;
			
			for (int j = 0 ; j < n ; j++) {
				if(i==j || A[i][j]==1) {
					continue;
				}
				else if(A[i][j]==3) {
					thang += 1;
				}
				else if(A[i][j]==0) {
					thua += 1;
				}
				
				
				}
			
			if (thang > thua) {
				System.out.printf("%d ",i+1);
			}
		}
		System.out.printf("\n");
	}
	
	private static void k_thua() {
		for (int i = 0 ; i < n ; i++) {
			int sum =1;
			
			for (int j = 0 ; j < n ; j++) {
				if(i==j) {
					continue;
				}
				sum *= A[i][j];
				
				}
			if (sum != 0) {
				System.out.printf("%d ",i+1);
			}
		}
		
	}
	
	private static void diem() {//chưa tìm đc cách in các đội = nhau 
		int m = 0;
		int ss = 0;
		
		for (int i = 0 ; i < n ; i++) {
			int sum = 0;
			
			for (int j = 0 ; j < n ; j++) {
				if(i==j) {
					continue;
				}
				if(A[i][j]==3) {
					sum += 3;
				}
				else if (A[i][j]==1) {
					sum += 1;
				}
				
			}
			
			if (ss<sum) {
				ss = sum;
				m = i+1;
			}
		}
		System.out.println(m);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		A = new int [n][n];
		for (int i = 0 ; i < n ; i++) {
			for (int j = 0 ; j < n ; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		diem();
		k_thang();
		k_thua();

	}

}
