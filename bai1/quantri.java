package bai1;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class quantri {
	private List<CanBo> canbo;

	public quantri() {
		this.canbo = new ArrayList<>();
	}

	public void addOfficer(CanBo canbo) {
		this.canbo.add(canbo);
	}

	public List<CanBo> searchOfficerByName(String name) {
		return this.canbo.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
	}

	public void showListInforOfficer() {
		this.canbo.forEach(o -> System.out.println(o.toString()));
	}

}
