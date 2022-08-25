package javacore.basic.leson08;

public abstract class SinhVien {
	private String name;
	private String nganh;
	public SinhVien(String name, String nganh) {
		this.name = name;
		this.nganh = nganh;
	}
	public abstract double getDiem();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNganh() {
		return nganh;
	}
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	public String getHocLuc() {
		String str;
		if(getDiem()< 4) {
			str =  "Yeu";
		}
		else if ( getDiem()>=4 && getDiem()<= 6) {
			str = "Trung Binh";
		}
		else if ( getDiem()>=6 && getDiem()<= 7) {
			str = "Trung Binh Kha";
		}
		else if ( getDiem()>=7 && getDiem()<= 8) {
			str = "Kha";
		}
		else if ( getDiem()>=8 && getDiem()<= 9) {
			str = "Gioi";
		}
		else {
			str = "Xuat Sac";
		}
		return str;
		
	}
	
	public String hienThiThongTin() {
		return "SV:" + name + " - " + nganh + " - " + getDiem() +  " - " + getHocLuc() ;
	}
	
	

}
