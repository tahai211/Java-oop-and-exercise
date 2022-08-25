package baitap;

import java.util.Scanner;

public class Dao_chu_so_Hexa {

	public static void main(String[] args) {
		long c,v,b,n,f,r,t,y,u;
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
	    c =Long.parseLong(a,16);
	    System.out.printf(a+" ~ "+c+"\n");
	    v = ((c<<60)>>>32);
	    b = (((c>>>4)<<60)>>>36);
	    n = (((c>>>8)<<60)>>>40);
	    f = (((c>>>12)<<60)>>>44);
	    r = (((c>>>16)<<60)>>>48);
	    t = (((c>>>20)<<60)>>>52);
	    y = (((c>>>24)<<60)>>>56);
	    u = ((c>>>28));
	    String str = Long.toHexString((v|b)|(n|f)|(r|t)|(y|u));
		System.out.printf(str+" ~ "+((v|b)|(n|f)|(r|t)|(y|u)));

	}

}
