package bai1;

public class CanBo {
	protected String name;
	protected int tuoi;
	protected String gioitinh;
	protected String diachi;
	public CanBo(String name, int tuoi, String gioitinh, String diachi) {
		super();
		this.name = name;
		this.tuoi = tuoi;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	

}
