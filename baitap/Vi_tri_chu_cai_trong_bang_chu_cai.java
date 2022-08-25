package baitap;

import java.util.Scanner;

public class Vi_tri_chu_cai_trong_bang_chu_cai {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		int ascii = (int) c - 97;
		System.out.println(ascii);
	}

}
