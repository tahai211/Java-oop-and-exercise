package javacore.basic.leson08;

public class CNTT extends SinhVien {
	private double web;
	private double android;
	private double nhung;
	public CNTT(String name, String nganh, double web, double android, double nhung) {
		super(name, nganh);
		this.web = web;
		this.android = android;
		this.nhung = nhung;
	}
	
	
	public double getWeb() {
		return web;
	}

	public void setWeb(double web) {
		this.web = web;
	}

	public double getAndroid() {
		return android;
	}

	public void setAndroid(double android) {
		this.android = android;
	}

	public double getNhung() {
		return nhung;
	}

	public void setNhung(double nhung) {
		this.nhung = nhung;
	}

	@Override
	public double getDiem() {
		
		return (web+android*2+nhung*2)/5;
	}

}
