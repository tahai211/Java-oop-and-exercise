package javacore.basic.leson13.lab02;

import java.util.Comparator;

public class AgeComparator implements Comparator<Studen> {
//công việc sosánh thực hiện bởi comparable và comparator 
	@Override
	public int compare(Studen o1, Studen o2) {
		// TODO Auto-generated method stub
		return o1.getBirthday().compareTo(o2.getBirthday());
	}

}
