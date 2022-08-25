package baitap;

import java.util.Scanner;

public class So_sanh_nhung_khong_so_sanh {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		int c = b - a ;
		System.out.println(c>>>31);

	}

}
