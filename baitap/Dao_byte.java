package baitap;

import java.util.Scanner;

public class Dao_byte {

	public static void main(String[] args) {
		long c,v,b,n,f;
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
	    c =Long.parseLong(a,16);
	    System.out.printf(a+" ~ "+c+"\n");
	    v = ((c<<56)>>>32);
	    b = (((c>>>8)<<56)>>>40);
	    n = (((c>>>16)<<56)>>>48);
	    f = (((c>>>24)<<56)>>>56);
	    String str = Long.toHexString((v|b)|(n|f));
		System.out.printf(str+" ~ "+((v|b)|(n|f)));


	}

}
