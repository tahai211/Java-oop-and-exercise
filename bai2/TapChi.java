package bai2;

public class TapChi extends TaiLieu {
	protected int numberph;
	protected int monthph;
	public TapChi(String id, String namensx, int number, int numberph, int monthph) {
		super(id, namensx, number);
		this.numberph = numberph;
		this.monthph = monthph;
	}
	public int getNumberph() {
		return numberph;
	}
	public void setNumberph(int numberph) {
		this.numberph = numberph;
	}
	public int getMonthph() {
		return monthph;
	}
	public void setMonthph(int monthph) {
		this.monthph = monthph;
	}
	
	

}
