package decision;

import java.util.Scanner;

public class Tri_tuyet_doi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		a = Math.abs(a);
		b = Math.abs(b);
		c = Math.abs(c);
		System.out.printf("|a| = %d\n",a);
		System.out.printf("|b| = %d\n",b);
		System.out.printf("|c| = %d",c);
		

	}

}
