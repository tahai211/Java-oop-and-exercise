package javacore.basic.leson09.lab02;

import java.util.Scanner;

public class Lab02_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int p = sc.nextInt();
			int q = sc.nextInt();
			FullTimeEmployee[] fe = new FullTimeEmployee[m];
			for(int j = 0 ; j < m ; j++) {
				fe[i] = new FullTimeEmployee();
				fe[i].setName(sc.nextLine());
				fe[i].setPaymentPerHour(sc.nextInt());
			}
			PartTimeEmployee[] pe = new PartTimeEmployee[n];
			for(int j = 0 ; j < n ; j++) {
				pe[i] = new PartTimeEmployee();
				pe[i].setName(sc.nextLine());
				pe[i].setPaymentPerHour(sc.nextInt());
				pe[i].setWorkingHours(sc.nextInt());
			}
			int [] NVPT = new int[p];
			for(int a = 0 ; a < p ; a++) {
				NVPT[a]= sc.nextInt();
			}
			int [] NVFT = new int[q];
			for(int b = 0 ; b < q ; b++) {
				NVFT[b] = sc.nextInt();
			}
			System.out.println("case#"+t+":");
			for(int b = 0 ; b < q ; b++) {
				//fe[NVFT[b]];
			}
			for(int b = 0 ; b < q ; b++) {
				//pe[NVPT[b]];
			}
		}

	}

}
