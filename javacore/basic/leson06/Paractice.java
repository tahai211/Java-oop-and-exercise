package javacore.basic.leson06;

public class Paractice {
	public static final double sum(double... x) {
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];

		}
		return sum;
	}

	public static final double getMin(double... x) {
		double min = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] < min) {
				min = x[i];
			}
		}
		return min;
	}

	public static final double getMax(double... x) {
		double max = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		return max;
	}

	public static final String toUpper(String str) {
		int x;
		String a = "";
		for (int i = 0; i < str.length(); i++) {
			x = (int) str.charAt(i);
			if (x >= 97 && x <= 122) {
				x = x - 32;
			}
			x = (char) x;
			a += x;
		}
		return a;
	}
	public static final String toUpperFirstChar(String str) {
		String [] words = str.split(" ");
		for(int i = 0 ; i< words.length ; i++) {
			char firstChar = words[i].charAt(0);
			char upperFirstChar = String.valueOf(firstChar).toUpperCase().charAt(0);
			words[i] = upperFirstChar + words[i].substring(1);
		}
		String result = String.join(" ", words);
		return result;
	}
	public static final int Fibonacci(int n) {
		if(n<=2) {
			return 1;
		}
		return Fibonacci(n-1) + Fibonacci(n-2);
	}
}
