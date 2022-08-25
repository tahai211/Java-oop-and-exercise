package baitap;

import java.util.Scanner;

public class MAt_ma_ceaser_giai_ma_1_ki_tu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char plaintext = sc.next().charAt(0);
		int key = sc.nextInt();
		int ascii = ((int) plaintext-key)-65;
		int a = ((ascii) % 26)+65;
		char c = (char)a ;
		System.out.println(c);

	}

}
