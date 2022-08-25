package javacore.basic.leson08;

public class HinhChuNhat {
	private double d;
	private double r;
	public HinhChuNhat(double d, double r) {
		this.d = d;
		this.r = r;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double getChuVi() {
		return (d+r)*2;
	}
	public double getDienTich() {
		return d*r;
	}
	
	public String hienThiThongTin() {
		return "HCN (" + d + ", " + r + ") :" + " Chu Vi"
				+ getChuVi() + ", Dien Tich=" + getDienTich() ;
	}
	
	
}
