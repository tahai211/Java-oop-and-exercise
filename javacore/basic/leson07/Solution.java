package javacore.basic.leson07;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int u = 0; u < t; u++) {
			int n = sc.nextInt();
			if (n >= 2 && n <= 100) {
				MyPoint []mp = new MyPoint[n];
				for(int ii=0; ii < n ; ii++) {
					mp[ii] = new MyPoint();
					mp[ii].setX(sc.nextDouble());
					mp[ii].setY(sc.nextDouble());
					
				}
				int k = sc.nextInt();
				double x1 = sc.nextDouble();
				double x2 = sc.nextDouble();
				int p = sc.nextInt();
				int m = sc.nextInt();
				MyCircle[] mc = new MyCircle[m];
				for(int ii=0; ii < m ; ii++) {
					mc[ii] = new MyCircle();		
					double x = sc.nextDouble();
					double y = sc.nextDouble();		 
					mc[ii].setTam(new MyPoint(x, y));	
					mc[ii].setR(sc.nextDouble());
				}
				int q = sc.nextInt();
				for(int ii=0; ii < m ; ii++) {
					if(ii==q) {
					System.out.println(mc[ii].toString());
					}
				}
				int i = sc.nextInt();
				int j = sc.nextInt();
				
			}
		}

	}

}
