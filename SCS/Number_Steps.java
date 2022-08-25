package SCS;

import java.util.Scanner;
/*Trước tiên, bạn có thể thấy rằng các số sẽ nằm trên 2 đường thẳng có phương trình là y = x và y = x - 2. Do đó, khi đọc vào một điểm (x, y), nếu như điểm đó không thuộc một trong hai đường trên thì có nghĩa là sẽ không có số. Ngược lại, chắc chắn sẽ có số.

Tiếp theo, vì các điểm thuộc 2 phương trình y = x và y = x - 2 nên tọa độ của chúng sẽ cùng chẵn hoặc cùng lẻ. Hơn nữa, mình phát hiện ra một quy luật đó là:

Nếu x, y chẵn thì giá trị số = x + y.
Nếu x, y lẻ thì giá trị số = x + y - 1.*/

public class Number_Steps {
	private static int check(int x,int y) {
		if (x >= y && x - y <= 2)
		{
			if (x%2 == 0 && y%2 == 0) { return x + y;}
			if (x%2 == 1 && y%2 == 1) { return x + y -1;}
		}
		return -1;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		int t = sc.nextInt();
		for (int i = 0 ; i < t ; i++) {
			x= sc.nextInt();
			y = sc.nextInt();
			int n = check(x, y);
			if (n == -1) {
				System.out.println("No Number");
			}else {
				System.out.println(n);
			}
			
		}

	}

}
