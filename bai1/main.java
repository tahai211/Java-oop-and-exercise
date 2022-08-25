package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	// Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên. Mỗi cán
	// bộ cần quản lý các dữ liệu: Họ tên, tuổi, giới tính(name, nữ, khác), địa chỉ.

//Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc (1 đến 10).
//Cấp kỹ sư có thuộc tính riêng: Nghành đào tạo.
//Các nhân viên có thuộc tính riêng: công việc.
//Yêu cầu 1: Xây dựng các lớp CongNhan, KySu, NhanVien kế thừa từ lớp CanBo.

//Yêu cầu 2: Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực hiện các chức năng sau:

//Thêm mới cán bộ.
//Tìm kiếm theo họ tên.
//Hiện thị thông tin về danh sách các cán bộ.
//Thoát khỏi chương trình

	public static void main(String[] args) {
		quantri qt = new quantri();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Quản lý cán bộ\n");
			System.out.println("1.Thêm mới cán bộ\n");
			System.out.println("2.Tìm kiếm theo họ tên\n");
			System.out.println("3.Hiện thị thông tin về danh sách các cán bộ\n");
			System.out.println("4.Thoát khỏi chương trình\n");
			int a = sc.nextInt();
			switch (a) {
			case 1: {
				System.out.println("Thêm cán bộ\n");
				System.out.println("a: Thêm công nhân\n");
				System.out.println("b: Thêm Kỹ Sư\n");
				System.out.println("c: Thêm Nhân Viên\n");
				String line = sc.next();
				switch (line) {
				case "a": {
					System.out.println("Thêm công nhân\n");
					System.out.println("Nhập tên :");
					String name = sc.next();
					System.out.println("\nNhập tuổi :");
					int age = sc.nextInt();
					System.out.println("\nNhập giới tính :");
					String sex = sc.next();
					System.out.println("\nNhập địa chỉ :");
					String address = sc.next();
					System.out.println("\nNhập bậc :");
					int lever = sc.nextInt();
					CanBo congnhan = new CongNhan(name, age, sex, address, lever);
					qt.addOfficer(congnhan);
					System.out.println(congnhan.toString());
					break;
				}

				case "b": {
					System.out.println("Thêm công nhân\n");
					System.out.println("Nhập tên :");
					String name = sc.nextLine();
					System.out.println("\nNhập tuổi :");
					int age = sc.nextInt();
					System.out.println("\nNhập giới tính :");
					String sex = sc.nextLine();
					System.out.println("\nNhập địa chỉ :");
					String address = sc.nextLine();
					System.out.println("\nNhập bậc :");
					String nnt = sc.nextLine();
					CanBo kysu = new KySu(name, age, sex, address, nnt);
					qt.addOfficer(kysu);
					System.out.println(kysu.toString());
					break;
				}

				case "c": {
					System.out.println("Thêm công nhân\n");
					System.out.println("Nhập tên :");
					String name = sc.nextLine();
					System.out.println("\nNhập tuổi :");
					int age = sc.nextInt();
					System.out.println("\nNhập giới tính :");
					String sex = sc.nextLine();
					System.out.println("\nNhập địa chỉ :");
					String address = sc.nextLine();
					System.out.println("\nNhập bậc :");
					String job = sc.nextLine();
					CanBo nhanvien = new NhanVien(name, age, sex, address, job);
					qt.addOfficer(nhanvien);
					System.out.println(nhanvien.toString());
					break;
				}
				

				}
				break;

			}
			case 2:{
				System.out.println("Search: ");
				String search = sc.next();
				qt.searchOfficerByName(search).forEach(CanBo->{
                    System.out.println(CanBo.toString());
                });
				break;

				
			}
			case 3:{
				qt.showListInforOfficer();
				break;
			}
			case 4:{
				return;
			}
			default:
                System.out.println("Invalid");
                continue;
				

			}
			
				
			
		}

	}

}
