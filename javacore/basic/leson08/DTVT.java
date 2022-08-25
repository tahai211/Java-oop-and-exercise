package javacore.basic.leson08;

public class DTVT extends SinhVien{
	private double diemTDS;
	private double diemTKM;
	private double diemVDK;
	public DTVT(String name, String nganh, double diemTDS, double diemTKM, double diemVDK) {
		super(name, nganh);
		this.diemTDS = diemTDS;
		this.diemTKM = diemTKM;
		this.diemVDK = diemVDK;
	}
	public void DTVT() {
		
	}
	
	public double getDiemTDS() {
		return diemTDS;
	}

	public void setDiemTDS(double diemTDS) {
		this.diemTDS = diemTDS;
	}

	public double getDiemTKM() {
		return diemTKM;
	}

	public void setDiemTKM(double diemTKM) {
		this.diemTKM = diemTKM;
	}

	public double getDiemVDK() {
		return diemVDK;
	}

	public void setDiemVDK(double diemVDK) {
		this.diemVDK = diemVDK;
	}

	@Override
	public double getDiem() {
		
		return (diemVDK*2+diemTDS+diemTKM)/4;
	}
	
}
