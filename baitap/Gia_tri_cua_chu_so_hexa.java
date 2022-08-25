package baitap;

import java.util.Scanner;

public class Gia_tri_cua_chu_so_hexa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
	    System.out.printf("x = %08x = %d\n",a,a);
	    System.out.printf("0: %x = %d\n",(a<<60)>>>60,(a<<60)>>>60);
	    System.out.printf("1: %x = %d\n",((a>>>4)<<60)>>>60,((a>>>4)<<60)>>>60);
	    System.out.printf("2: %x = %d\n",((a>>>8)<<60)>>>60,((a>>>8)<<60)>>>60);
	    System.out.printf("3: %x = %d\n",((a>>>12)<<60)>>>60,((a>>>12)<<60)>>>60);
	    System.out.printf("4: %x = %d\n",((a>>>16)<<60)>>>60,((a>>>16)<<60)>>>60);
	    System.out.printf("5: %x = %d\n",((a>>>20)<<60)>>>60,((a>>>20)<<60)>>>60);
	    System.out.printf("6: %x = %d\n",((a>>>24)<<60)>>>60,((a>>>24)<<60)>>>60);
	    System.out.printf("7: %x = %d\n",((a>>>28)<<60)>>>60,((a>>>28)<<60)>>>60);

	}

}
