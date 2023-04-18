package forPetlja;

import java.util.Scanner;

public class zadatak10 {

	public static void main(String[] args) {
		// 10. U zadatom intervalu ispitati i ispisati sve brojeve deljive brojem 3.

		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		System.out.println("Unesite najmanji broj");
		a= sc.nextInt();
		System.out.println("Unesite najveci broj");
		b= sc.nextInt();
		
		for (int i = a; i<=b; i++) {
			if (i % 3 ==0) {
				System.out.println(i + " ");
			}
		}
		
	}

}
