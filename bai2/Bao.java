package bai2;

public class Bao extends TaiLieu {
	protected int dayph;

	public Bao(String id, String namensx, int number, int dayph) {
		super(id, namensx, number);
		this.dayph = dayph;
	}

	public int getDayph() {
		return dayph;
	}

	public void setDayph(int dayph) {
		this.dayph = dayph;
	}
	
	

}
