package javacore.basic.leson08;

import java.util.Scanner;

public class Lab02_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int p = sc.nextInt();
			ATTT [] attt = new ATTT[m];
			CNTT [] cntt = new CNTT[n];
			DTVT [] dtvt = new DTVT[p];
			for(int j = 0 ; j < m ; j++) {
				
				attt[i].setName(sc.nextLine());
				attt[i].setNganh(sc.nextLine());
			}
			
			
		}

	}

}
