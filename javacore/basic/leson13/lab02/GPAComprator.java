package javacore.basic.leson13.lab02;

import java.util.Comparator;

public class GPAComprator implements Comparator<Studen>{

	@Override
	public int compare(Studen o1, Studen o2) {
		if (o1.getGpa() > o2.getGpa()) {
			return -1;
		}else if(o1.getGpa() < o2.getGpa()) {
			return 1;
		}else {
		return 0;
		}
	}

}
