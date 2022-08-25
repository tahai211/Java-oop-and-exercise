package decision;

import java.util.Scanner;

public class Kiem_tra_chan_le {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a % 2 == 0) {
			System.out.printf(a+" la so chan");
		}else {
			System.out.printf(a+" la so le");
		}

	}

}
