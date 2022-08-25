package loop;

import java.util.Scanner;

public class Uoc_chung_lon_nhat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == 0 || b == 0){
	        System.out.printf("%d",(a+b));
	    }
	    while (a != b){
	        if (a > b){
	            a -= b; // a = a - b
	        }else{
	            b -= a;
	        }
	    }
	    System.out.printf("%d",a);

	}

}
