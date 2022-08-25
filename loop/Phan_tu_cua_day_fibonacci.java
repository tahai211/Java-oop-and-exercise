package loop;

import java.util.Scanner;

public class Phan_tu_cua_day_fibonacci {
	static int Fibonacci(int n)
	{
	    if (n == 1 || n == 2)
	        return 1;
	    return Fibonacci(n - 1) + Fibonacci(n - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0 ;i <= t ; i++) {
			int n = sc.nextInt();
			System.out.println(Fibonacci(n));
		}

	}

}
