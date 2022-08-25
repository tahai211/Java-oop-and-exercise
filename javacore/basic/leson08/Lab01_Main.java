package javacore.basic.leson08;

import java.util.Scanner;

public class Lab01_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int p = sc.nextInt();
			int q = sc.nextInt();
			HinhChuNhat[] HCN = new HinhChuNhat[m];
			for (int j = 0; j < m; j++) {
				double d = sc.nextDouble();
				double r = sc.nextDouble();
				HCN[i] = new HinhChuNhat(d, r);
				
			}
			HinhVuong[] HV = new HinhVuong[n];
			for (int jj = 0; jj < n; jj++) {
				double canh = sc.nextDouble();
				HV[jj] = new HinhVuong(canh, canh, canh);
			}
			System.out.println("Case "+i+"#");
			for(int ii = 0 ; ii< m ; ii++) {
				
				if (ii == p) {
					System.out.println(HCN[ii].hienThiThongTin());
				}
			}
			for(int ii = 0 ; ii< m ; ii++) {
				if (ii == q ) {
					System.out.println(HV[ii].hienThiThongTin());
				}
			}
			
			
		}
	}

}
