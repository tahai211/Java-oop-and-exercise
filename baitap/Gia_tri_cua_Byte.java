package baitap;

import java.util.Scanner;

public class Gia_tri_cua_Byte {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
	    System.out.printf("x = %d = 0x%x\n",a,a);
	    System.out.printf("byte 0: 0x%02x = %d\n",(a<<56)>>>56,(a<<56)>>>56);
	    System.out.printf("byte 1: 0x%02x = %d\n",((a>>>8)<<56)>>>56,((a>>>8)<<56)>>>56);
	    System.out.printf("byte 2: 0x%02x = %d\n",((a>>>16)<<56)>>>56,((a>>>16)<<56)>>>56);
	    System.out.printf("byte 3: 0x%02x = %d\n",((a>>>24)<<56)>>>56,((a>>>24)<<56)>>>56);
	

	}

}
