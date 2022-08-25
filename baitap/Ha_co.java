package baitap;

import java.util.Scanner;

public class Ha_co {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=0;
        a=a>>b;
        int e = a&c;
        a= a<<b;
        System.out.printf(Integer.toBinaryString(a)+"\n");
       System.out.printf("%d",a);

	}

}
