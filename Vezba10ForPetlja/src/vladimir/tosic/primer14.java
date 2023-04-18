package vladimir.tosic;

import java.util.Scanner;

public class primer14 {

	public static void main(String[] args) {
		// Napisati program za izračunavanje aritmetičke sredine parnih brojeva.
		
		Scanner sc = new Scanner(System.in);
		double zbir = 0,broj,parni= 0, sredina=0;
		System.out.println("Koliko brojeva zelite da unesete?");
		int brojSabiraka = sc.nextInt();
		
		for (int i = 1; i<=brojSabiraka; i++) {
			System.out.println("Unesite "+i+". broj");
			broj = sc.nextDouble();
			if (broj%2==0) {
				parni++;
				zbir = zbir + broj;
				sredina = zbir / parni;
				
			}
		}
		System.out.println("Srednja vrednost je " + sredina);
		sc.close();
	}

}
