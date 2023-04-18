package forPetlja;

import java.util.Scanner;

public class zadatak12 {

	public static void main(String[] args) {
		// 12. Napisati program koji prebrojava brojeve od
		//1 .. 20 koji su deljivi brojem 3.
		
		int a = 0;
		for (int i = 1; i<31; i++) {
			if (i%3==0) {
				System.out.println(a++);
			}
		}
		
	}

}
