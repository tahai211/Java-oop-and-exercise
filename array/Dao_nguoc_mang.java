package array;

import java.util.Scanner;

public class Dao_nguoc_mang {
	public static void input(int x [],int n)
	{
		Scanner sc = new Scanner(System.in);
		for (int i = 0 ; i < n;i++)
		{
			x[i] = sc.nextInt();
		}
	}
	public static void output(int x [])
	{
		Scanner sc = new Scanner(System.in);
		for (int i = 0 ; i < x.length;i++)
		{
			System.out.println(x[i]);
		}
	}
	public static void output_reverse(int x [])
	{
		int tmp;
		for (int i = 0 ;  i < x.length/2; i++)
		{
			tmp = x[i];
			x[i] = x[x.length-1-i];
			x[x.length-1-i] = tmp;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] x = new int[n];
		input(x, n);
		output(x);
		output_reverse(x);
		output(x);

	}

}
