package forPetlja;

import java.util.Scanner;

public class zadatak14 {

	public static void main(String[] args) {
		// 14. Napisati program zy izračunavanje aritmetičke sredine parnih brojeva.

		Scanner sc = new Scanner(System.in);
		
		int unos;
		System.out.println("Koliko brojeva zelite da unesete?");
		unos = sc.nextInt();
		
		int aritmeticka = 0; suma = 0;int  prani = 0;
		
		for (int i = 1; i<unos; i++) {
			System.out.println("Unesite " + i + " broj");
			int broj = sc.nextInt();
			if (i%2==0) {
				parni++
				suma = suma/broj;
				aritmeticka = suma/parni;
			}
		}
		
		
		
	}

}
