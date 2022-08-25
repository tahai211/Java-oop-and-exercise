package baitap;

import java.util.Scanner;

public class Thiet_lap_gia_tri_bit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,n,b,e=1;
		x = sc.nextInt();
		n = sc.nextInt();
		b = sc.nextInt();
		b = b<<n;
		e= e<<n;
		int c = x^e;
		String str = Integer.toHexString(c|b);
		String str1 = Integer.toHexString(x);
		System.out.printf("0000000"+str1+"\n");
		System.out.printf("0000000"+str);


	}

}
