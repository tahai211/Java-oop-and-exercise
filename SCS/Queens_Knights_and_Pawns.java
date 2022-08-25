package SCS;

import java.util.Scanner;

public class Queens_Knights_and_Pawns {
	static int Q = 0;
	static int K = 1;
	static int P = 2;
	static int OK = 3;
	static int NOT = 4;

	static int[][] x = new int[1001][1001];// Luu ban co
	static int hang, cot;
	static int sum = 0;
	// Đường đi con mã
	static int[] K_x = { -2,-2,-1,-1,1,1,2,2,};//đây là các vị trí mà quân mã sẽ đi đến 8 hướng vd: x= x1-2;y=y1-1 ,  (x1,y1) là vị trí bất kì mà quân mã đang đứng 
	static int[] K_y = { -1,1,-2,2,-2,2,-1,1 };

	private static int checkK(int row, int col) {
		int dem = 0;
		// check 8 hướng của quân mã
		for (int i = 0; i < 8; i++) {
			int r = row + K_x[i];//quân mã sẽ đi theo dạng x+X[i] , y +Y[i] 
			int c = col + K_y[i];
			if (r <= hang && r >= 0 && c <= cot && c >= 0)// check xem ô đó có nằm trong bàn cờ k
			{
				// Nếu ô nào đang ở vị trí an toàn
				// thì tức là con mã có thể ăn
				// cho ô đó thành NOT để tránh lặp và tăng biến đếm
				if (x[r][c] == OK) {
					x[r][c] = NOT;
					dem++;
				}
			}
		}
		return dem;
	}

	// Đường đi con hậu
	static int Q_x[] = { 0, 0, 1, 1, 1, -1, -1, -1 };
	static int Q_y[] = { 1, -1, -1, 0, 1, -1, 0, 1 };

	/*
	 * Duyệt mỗi con hậu tại vị trí row, col theo từng hướng Sử dụng đệ quy
	 */
	private static void checkQ(int row, int col, int direct) {
		int r = row + Q_x[direct];
		int c = col + Q_y[direct];

		if (r <= hang && r >= 0 && c <= cot && c >= 0) {
			// Ô nào đang an toàn thì sẽ bị ăn
			// Cho thành Unsafe
			if (x[r][c] == OK) {
				x[r][c] = NOT;
				sum--;
				checkQ(r, c, direct);
			} else if (x[r][c] == NOT) {
				// Trường hợp này là đã tính trước đó.
				checkQ(r, c, direct);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bang = 0;
		while (true) {
			hang = sc.nextInt();
			cot = sc.nextInt();
			if (hang == 0 && cot == 0) {
				break;// giá trị hàng cột =0 cho biết kết thúc đầu vào
			}
			sum = hang * cot;
			bang++;
			hang--;
			cot--;

			for (int i = 0; i <= hang; i++) {// ban đầu cần gán cho tất cả các ô trong bàn cờ đều là giá trị
				for (int j = 0; j <= cot; j++) {
					x[i][j] = OK;// cả bàn cờ bằng 3
				}
			}
			// 4 4 gồm có 4 hàng 4 cột
			// 2 1 4 2 4 gồm 2 quân Q tại vị trí (1,4) và (2,4)
			// 1 1 2 gồm 1 quân K tại vị trí (1,2)
			// 1 2 3 gồm 1 quân P tại vị trí (2,3)
			int r, c;// là vị trí
			int[][] row = new int[2][100];
			int[][] col = new int[2][100]; // Lưu thông tin con hậu, con mã
			int[] num = new int[3]; // lưu số lượng hậu mã tốt

			for (int a = 0; a < 3; a++) {// số lượng là mảng 1 chiều
				num[a] = sc.nextInt();
				for (int b = 0; b < num[a]; b++) {// có bao nhiêu quân nhập bấy nhiêu lầnvị trí
					r = sc.nextInt();
					c = sc.nextInt();
					x[r-1][c-1] = a;// gán vị trí các quân lên bảng
					if (a != 2)// a = 2 là vị trí quân tốt thì k cần tính 
					{
						row[a][b] = r-1;
						col[a][b] = c-1;
					}
				}
			}
			// Tính tổng các ô rảnh mà chưa có con nào đang đứng
			sum -= num[Q] + num[K] + num[P];
			// tại num[0] số quân Q ta nhập ở trên
			// tại num[1] số quân K ta nhập ở trên
			// tại num[2] số quân P ta nhập ở trên

			// Duyệt các con mã
			for (int j = 0; j < num[K]; j++) {
				sum -= checkK(row[K][j], col[K][j]);
			}

			// Duyệt các con hậu
			for (int j = 0; j < num[Q]; j++) {
				for (int i = 0; i < 8; i++) {
					checkQ(row[Q][j], col[Q][j], i);
				}
			}
			System.out.println("Board "+bang+" has " + sum + " safe squares.");
		}
		

	}

}
