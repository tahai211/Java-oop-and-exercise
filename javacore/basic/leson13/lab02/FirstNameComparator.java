package javacore.basic.leson13.lab02;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Studen>{

	@Override
	public int compare(Studen o1, Studen o2) {
		// TODO Auto-generated method stub
		return o1.getFristName().compareTo(o2.getFristName());
	}

}
