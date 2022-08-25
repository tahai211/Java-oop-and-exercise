package decision;

import java.util.Scanner;

public class So_sanh_hai_so {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if(a > b) {
			System.out.printf("a > b");
		}else if(a < b){
			System.out.printf("a < b");
		}else{
			System.out.printf("a = b");
		}
		

	}

}
