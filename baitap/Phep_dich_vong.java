package baitap;

import java.util.Scanner;

public class Phep_dich_vong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		int n = sc.nextInt();
		long c = (x>>n)^((x<<(64-n))>>>32);
		long b = ((x<<(32+n))>>>32)^(x>>(32-n));
		System.out.printf("x = %d = "+"0x"+Long.toHexString(x)+"\n", x);
		System.out.printf("x >> %d = "+c+" = 0x"+Long.toHexString(c)+"\n", n);
		System.out.printf("x << %d = "+b+" = 0x"+Long.toHexString(b), n);

	}

}
