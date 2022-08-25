package bai2;

public class TaiLieu {
	protected String id;
	protected String namensx;
	protected int number;
	public TaiLieu(String id, String namensx, int number) {
		super();
		this.id = id;
		this.namensx = namensx;
		this.number = number;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNamensx() {
		return namensx;
	}
	public void setNamensx(String namensx) {
		this.namensx = namensx;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	

}
