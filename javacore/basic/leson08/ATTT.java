package javacore.basic.leson08;

public class ATTT extends SinhVien {
	private double madoc;
	private double LTAT;
	private double DTS;
	
	public ATTT(String name, String nganh, double madoc, double lTAT, double dTS) {
		super(name, nganh);
		this.madoc = madoc;
		this.LTAT = lTAT;
		this.DTS = dTS;
	}




	public double getMadoc() {
		return madoc;
	}


	public void setMadoc(double madoc) {
		this.madoc = madoc;
	}


	public double getLTAT() {
		return LTAT;
	}


	public void setLTAT(double lTAT) {
		this.LTAT = lTAT;
	}


	public double getDTS() {
		return DTS;
	}


	public void setDTS(double dTS) {
		this.DTS = dTS;
	}


	@Override
	public double getDiem() {
		
		return (madoc*2+LTAT*2+DTS)/5;
	}

}
