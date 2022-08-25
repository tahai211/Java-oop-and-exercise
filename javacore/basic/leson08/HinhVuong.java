package javacore.basic.leson08;

public class HinhVuong extends HinhChuNhat {
	private double canh;

	public HinhVuong(double d, double r,double canh) {
		super(d, r);
		this.canh = canh;
	}

	public double getCanh() {
		return canh;
	}

	public void setCanh(double canh) {
		this.canh = canh;
	}
	@Override
	public double getChuVi() {
		return canh*4;
	}
	@Override
	public double getDienTich() {
		// TODO Auto-generated method stub
		return canh*canh;
	}
	@Override
	public String hienThiThongTin() {
		// TODO Auto-generated method stub
		return "HV(canh = "+getCanh()+"): chu vi = "+getChuVi()+", dien tich = "+getDienTich();
	}
		
	
	

}
