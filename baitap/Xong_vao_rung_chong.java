package baitap;

import java.util.Scanner;

public class Xong_vao_rung_chong {

	public static void main(String[] args) {
		int i = ~0;
		int e = 1;
		Scanner sc= new Scanner(System.in);
		int b = sc.nextInt();
		int n = sc.nextInt();
		b = b<<n;
		e = e<<n;
		int c= i^e;//neu XOR voi b thi truong hop b=1 k thoa man ta phai XOR voi 1
		String str = Integer.toHexString(c|b);//
		System.out.println(str);

	}

}
