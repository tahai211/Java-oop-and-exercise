package bai2;

public class Sach extends TaiLieu {
	
	protected String nameauthor;
	protected int  nuberpager;
	public Sach(String id, String namensx, int number, String nameauthor, int nuberpager) {
		super(id, namensx, number);
		this.nameauthor = nameauthor;
		this.nuberpager = nuberpager;
	}
	public String getNameauthor() {
		return nameauthor;
	}
	public void setNameauthor(String nameauthor) {
		this.nameauthor = nameauthor;
	}
	public int getNuberpager() {
		return nuberpager;
	}
	public void setNuberpager(int nuberpager) {
		this.nuberpager = nuberpager;
	}
	
	

}
