package bai1;

public class KySu extends CanBo {
	protected String nganhdaotao;

	public KySu(String name, int tuoi, String gioitinh, String diachi, String nganhdaotao) {
		super(name, tuoi, gioitinh, diachi);
		this.nganhdaotao = nganhdaotao;
	}

	public String getNganhdaotao() {
		return nganhdaotao;
	}

	public void setNganhdaotao(String nganhdaotao) {
		this.nganhdaotao = nganhdaotao;
	}

	@Override
	public String toString() {
		return "KySu [name=" + name + ", tuoi=" + tuoi + ", gioitinh=" + gioitinh + ", diachi=" + diachi + "]";
	}
	

}
