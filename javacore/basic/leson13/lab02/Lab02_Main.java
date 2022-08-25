package javacore.basic.leson13.lab02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab02_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Studen> list = new ArrayList<>();
		String input;
		Studen s;
		for ( int i = 0 ; i< n ; i++) {
			input = sc.nextLine();
			String [] str = input.split(" ");
			switch(Integer.parseInt(str[0])) {
			case 1:
				s= new Studen();
				s.setId(Integer.parseInt(str[1]));
				s.setFristName(str[2]);
				s.setLastName(str[3]);
				s.setBirthday(LocalDate.parse(str[4]));
				s.setGpa(Double.parseDouble(str[5]));
				list.add(s);
				break;
			case 2:
				switch(Integer.parseInt(str[1])){
					case 1:
						for(int j = 0 ; j < list.size() ; j++) {
							Studen st = list.get(j);
							if(str[2].equalsIgnoreCase(st.getFristName())) {
								list.remove(st);
							}
						}
						break;
					case 2:
						for(int j = 0 ; j < list.size() ; j++) {
							Studen st = list.get(j);
							if(str[3].equalsIgnoreCase(st.getLastName())) {
								list.remove(st);
							}
						}
						break;
				}
				break;
			case 3:
				for (Studen st : list) {
					if(st.getId() == Integer.parseInt(str[1])) {
						switch(Integer.parseInt(str[2])) {
							case 1:
								st.setFristName(str[3]);
								break;
							case 2:
								st.setLastName(str[3]);
								break;
							case 3:
								LocalDate date = LocalDate.parse(str[3]);
								st.setBirthday(date);
								break;
							case 4:
								st.setGpa(Double.parseDouble(str[3]));
								break;
						}
					}
				}
				break;
			case 4:
				switch(Integer.parseInt(str[1])) {
				case 1:
					list.sort(new LastNameComparator().thenComparing(new FirstNameComparator()).thenComparing(new AgeComparator()).thenComparing(new GPAComprator()));
				case 2:
					list.sort(new AgeComparator().thenComparing(new LastNameComparator()).thenComparing(new FirstNameComparator()).thenComparing(new GPAComprator()));
				case 3:
					list.sort(new GPAComprator().thenComparing(new LastNameComparator()).thenComparing(new FirstNameComparator()).thenComparing(new AgeComparator()));
					
				}
				break;
			case 5:
				if (list.size() < 10) {
					list.stream().forEach(st -> System.out.println(st));
				}else {
					for (int j = 0 ; j < 10 ; j++) {
						System.out.println(list.get(j));
					}
				}
				break;
			case 6:
				list.stream().forEach(st -> System.out.println(st));
				break;
			}
		}

	}

}
