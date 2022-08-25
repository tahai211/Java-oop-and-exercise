package bai1;

public class CongNhan extends CanBo {
	protected int bac;

	public CongNhan(String name, int tuoi, String gioitinh, String diachi, int bac) {
		super(name, tuoi, gioitinh, diachi);
		this.bac = bac;
	}

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}

	@Override
	public String toString() {
		return "CongNhan [name=" + name + ", tuoi=" + tuoi + ", gioitinh=" + gioitinh + ", diachi=" + diachi + "]";
	}
	

}
