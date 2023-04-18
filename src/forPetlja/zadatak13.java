package forPetlja;

import java.util.Scanner;

public class zadatak13 {

	public static void main(String[] args) {
		// 13. Napisati program za izračunavanje aritmetičke sredine unetih brojeva.

		Scanner sc = new Scanner(System.in);
		double unos;
		System.out.println("Koliko brojeva zelite da unesete?");
		unos = sc.nextDouble();
		int x;
		double b;
		for (double a = 1; a<unos; a++) {
			
			System.out.println("Unesite " + a + " brojeva");
			x = sc.nextInt();
			
			b = a/unos;
			System.out.println("aritmeticka sredina je " + b);
		}
		
		
	}

}
