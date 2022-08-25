package array;

import java.util.Scanner;

public class Reserve {
	static int a,b;
	static int []x;
	static int []y;
	
	public static void input()
	{
		
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		
		x = new int [a];
		
		for (int i = 0 ; i < a ; i++)
		{
			x[i] = sc .nextInt();
			
		}
		b = sc.nextInt();
		y = new int [b];
		for (int j = 0 ; j < b ; j++)
		{
			y[j] = sc .nextInt();
			
		}
	}
	public static int check(int n)
	{ 
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0 ; i < b ; i++)
		{
			if (n == y[i] )
			{
				sum++;
			}
		
			
		}
		if(sum > 0 )
		{
			return 0;
		}else {
			return 1;
		}
	}

	public static void main(String[] args) {
		input();
		for(int i =0 ; i < a; i++)
		{
			int n = check(x[i]);
			if (n == 1)
			{
				System.out.printf("%d  ",x[i]);
			}
		}
		

	}

}
