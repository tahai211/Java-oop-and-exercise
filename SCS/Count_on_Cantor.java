package SCS;

import java.util.Scanner;

public class Count_on_Cantor {
	/*
	 * Một trong những chứng minh nổi tiếng của toán học hiện đại là chứng minh của
	 * Georg Cantor rằng tập hợp các số hữu tỉ là có thể đếm được. Chứng minh hoạt
	 * động bằng cách sử dụng một phép liệt kê rõ ràng các số hữu tỉ như thể hiện
	 * trong sơ đồ bên dưới.
	 * 
	 * 1/1 1/2 1/3 1/4 1/5 ... 2/1 2/2 2/3 2/4 3/1 3/2 3/3 4/1 4/2 5/1 Trong sơ đồ
	 * trên, số hạng đầu tiên là 1/1, số hạng thứ hai là 1/2, số hạng thứ ba là 2/1,
	 * số hạng thứ tư là 3/1, số hạng thứ năm là 2/2, v.v.
	 * 
	 * Đầu vào Đầu vào bắt đầu bằng một dòng chứa một số nguyên t <= 20, số lượng
	 * trường hợp thử nghiệm. t các trường hợp thử nghiệm theo sau.
	 * 
	 * Sau đó, nó chứa một số duy nhất trên mỗi dòng.
	 * 
	 * Đầu ra Bạn phải viết một chương trình sẽ đọc một danh sách các số trong phạm
	 * vi từ 1 đến 10 ^ 7 và sẽ in cho mỗi số một số hạng tương ứng trong phép liệt
	 * kê Cantor như được cho bên dưới.
	 */
	private static void solved(int n) {
		
		int k = 1;
		int tu = 1;
		int mau = 1;
		int dem = 1;

		while (k < n) {// ct chay tu 1 ,
			if (dem % 2 == 1) {// luc nay dem = 1 la so le
				mau++;
				k++;
				dem++;// cho dem thanh so chan
				if (n == k) {
					break;
				}
				while (tu < dem) {// duong co dem la so chan di cheo xuong
					tu++;
					mau--;
					k++;
					if (n == k) {
						break;
					}
				}

			}
			if (n == k) {
				break;
			}
			if (dem % 2 == 0) {// dem la so chan
				tu++;
				k++;
				dem++;// cong cho dem thanh so le

				if (n == k) {
					break;
				}
				while (mau < dem) {// duong cheo co dem la so le thi di len

					tu--;
					mau++;
					k++;
					if (n == k) {
						break;
					}
				}

			}

		}
		System.out.printf("TERM %d IS %d/%d",n,tu,mau);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			solved(n);
		}
		System.out.printf("\n");

	}

}
