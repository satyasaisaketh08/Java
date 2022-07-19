package ass_1;

import java.util.*;

public class replace_all {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long rem = 1;
		long anw = 0;
		long frem = 1;
		long finalanw = 0;
		if (n == 0) {
			anw = 5;
		} else {
			while (n > 0) {
				rem = n % 10;
				if (rem == 0) {
					rem = 5;
					anw = anw * 10 + 5;
				} else {
					anw = anw * 10 + rem;
				}
				n = n / 10;
			}
		}
		while (anw > 0) {
			frem = anw % 10;
			finalanw = finalanw * 10 + frem;
			anw = anw / 10;
		}
		System.out.println(finalanw);
	}
}
