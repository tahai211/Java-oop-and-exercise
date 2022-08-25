package javacore.basic.leson09.lab01;

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
			Rectangle [] rc = new Rectangle[m];
			for(int j = 0 ; j < m ; j++) {
				rc[j] = new Rectangle();
				rc[j].setLenght(sc.nextDouble());
				rc[j].setWidth(sc.nextDouble());
			}
			Circle[] cl = new Circle[n];
			for(int r = 0 ;r < m ; r++) {
				cl[r] = new Circle();
				cl[r].setRadius(sc.nextDouble());
				
			}
			int [] ttcn = new int[p];
			for(int a = 0 ; a < p ; a++) {
				ttcn[a]= sc.nextInt();
			}
			int [] tthv = new int[q];
			for(int b = 0 ; b < q ; b++) {
				tthv[b] = sc.nextInt();
			}
			System.out.println("case#"+t+":");
			for(int b = 0 ; b < q ; b++) {
				rc[ttcn[b]].show();
			}
			for(int b = 0 ; b < q ; b++) {
				cl[tthv[b]].show();
			}
		}

	}

}
