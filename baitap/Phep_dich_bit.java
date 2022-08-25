package baitap;

import java.util.Scanner;

public class Phep_dich_bit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		int n = sc.nextInt();
		System.out.printf("x = %d = "+"0x"+Long.toHexString(x)+"\n", x);
		System.out.printf("x >> %d = "+"0x"+Long.toHexString(x>>n)+"\n", n);
		System.out.printf("x << %d = "+"0x"+Long.toHexString(x<<n), n);

	}

}
