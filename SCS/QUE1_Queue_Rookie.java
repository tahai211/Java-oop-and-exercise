package SCS;

import java.util.Scanner;

public class QUE1_Queue_Rookie {
	static int n;
	static int[] x;
	static int[] y;

	private static void input() {
		Scanner sv = new Scanner(System.in);
		n = sv.nextInt();
		x = new int[n];
		y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sv.nextInt();
		}
		for (int j = 0; j < n; j++) {
			y[j] = sv.nextInt();
		}
	}
	private static void sort() {
		int tmp;
		for (int i = 0 ; i < n-1 ; i++) {// vòng này sẽ chạy đến n-1 vì chỉ duyệt đến đấy phần tử cuối cùng đương nhiên không xét 
			for (int j = i+ 1 ; j < n ; j ++) {//khi có giá trị ở index i vòng này sẽ bắt đầu chạy từ i+1 vì phía trước đã đc sắp xếp và chạy đến phần tử cuối 
				if ( x[i]< x[j]) {//đây là sắp xếp tăng dần nên nếu tìm thấp phần tử bé hơn thì sẽ đổi chỗ 
					tmp = x[i];
					x[i] = x[j];
					x[j] = tmp;
					
					tmp = x[i];
					x[i] = x[j];
					x[j] = tmp;
				}
			}
		}
	}
	private static void solve() {
		sort();
	    int i, j, tmp;
	    for (i = 0; i < n; i++)
	    {
	        if (y[i] != i)//co n nguoi -> ta can kt xem no co dung thu c[i] khong -> neu khong thi doi cho 
	        {//
	            for (j = i ; j < y[i]; j--)
	            {
	               tmp = x[i];
	                x[i] = x[j];
	                x[j] = tmp; 
	            }
	        }
	    }
	}
	private static void output()
	{
	   for (int i = 0; i < n; i++)
	    {
	        System.out.println(x[i]);
	    } 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			input();
			solve();
			output();
		}

	}

}
