package bai1;

public class NhanVien extends CanBo {
	protected String congviec;

	public NhanVien(String name, int tuoi, String gioitinh, String diachi, String congviec) {
		super(name, tuoi, gioitinh, diachi);
		this.congviec = congviec;
	}

	public String getCongviec() {
		return congviec;
	}

	public void setCongviec(String congviec) {
		this.congviec = congviec;
	}

	@Override
	public String toString() {
		return "NhanVien [name=" + name + ", tuoi=" + tuoi + ", gioitinh=" + gioitinh + ", diachi=" + diachi + "]";
	}
	

}
