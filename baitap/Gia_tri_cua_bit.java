package baitap;

import java.util.Scanner;

public class Gia_tri_cua_bit {
	public static int dichbit(int a, int k){
		//so nguyen sau khi qua dich bit truc tiep thi tro thanh cac bit
		int s = a << (32-(k+1));
		return s>>>31;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(dichbit(a,k));

	}

}
