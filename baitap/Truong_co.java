package baitap;

import java.util.Scanner;

public class Truong_co {
	

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         int a,b,c=0,d=1;
         a=sc.nextInt();
         b=sc.nextInt();
         c=~c;
         d=d<<b;
         a = a&(c^d);
        System.out.printf("%d",a);

	}

}
