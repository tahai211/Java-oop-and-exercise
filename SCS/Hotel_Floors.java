package SCS;

import java.util.Scanner;

public class Hotel_Floors {
	static char[][] x;

	/*
	 * Chúng ta được cung cấp một cái nhìn từ trên xuống của một tầng khách sạn,
	 * được thể hiện bằng một ma trận MxN gồm các ký tự, bao gồm (chỉ) những thứ
	 * sau:
	 * 
	 * '#' là Tường '-' là Không gian trống '*' là không gian bị chiếm dụng (bởi một
	 * người).
	 * 
	 * Chúng tôi được yêu cầu đánh giá số người trung bình sống trong một phòng.
	 * 
	 * Ràng buộc: M, N <= 100 Số trường hợp thử nghiệm <= 10 Tất cả các cạnh biên
	 * giới của bản đồ sẽ là tường. Sẽ có ít nhất một phòng.
	 * 
	 * Đầu vào Dòng đầu tiên chứa số lượng đầu vào thử nghiệm, với mỗi trường hợp
	 * thử nghiệm bao gồm: Ma trận MN MxN của các ký tự
	 * 
	 * Đầu ra Đối với mỗi trường hợp thử nghiệm, hãy xuất một dòng có số người sống
	 * trung bình trong một phòng, được làm tròn đến chính xác hai chữ số thập phân.
	 * 
	 */
	//BÀI NÀY NÊN VIẾT BẰNG C/C++
	private static void input(int m, int n) {

		Scanner sv = new Scanner(System.in);
		x = new char[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				x[i][j] = sv.next().charAt(0);
			}

		}
		for (int a = 0; a < m; a++) {
			for (int b = 0; b < n; b++) {
				System.out.println(x[a][b]);
			}
		}

	}

	private static void hotel(int m, int n) {
		float dem = 0;
		char s = '*';
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (x[i][j] == s) {
					dem++;
				}
			}
		}
		dem /= (m - 2);
		System.out.println(dem);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int m, n;
		for (int i = 0; i < t; i++) {
			m = sc.nextInt();
			n = sc.nextInt();
			input(m, n);
			hotel(m, n);

		}

	}

}
