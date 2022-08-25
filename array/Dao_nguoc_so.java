package array;

import java.util.Scanner;

public class Dao_nguoc_so {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int N = sc.nextInt();
		int len = 0 ;
		int [] x = new int[len];
		while (N>0)
		{
			x[len++] = N%10;
			 N = N/10;
			
		}
		N = 0;
		for (int i = 0 ;i< len ; i++ )
		{
			N = N*10 + x[i];
		}

	}

}
