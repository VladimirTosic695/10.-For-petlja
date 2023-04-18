package forPetlja;

import java.util.Scanner;

public class zadatak15 {

	public static void main(String[] args) {
		// 15. Napisati program koji učitava 10 brojeva i ispisuje koliko ima negativnih, 
		// nula i pozitivnih brojeva.

		Scanner sc = new Scanner(System.in);
		
		int unos;
		System.out.println("Koliko brojeva zelite da unesete?");
		unos = sc.nextInt();
		
		int pozitivan = 0, nula = 0, negativan = 0;
		for (int i = 1; i <=10;i++ ) {
			System.out.println("Unesite " + i + " broj.");
			int broj = sc.nextInt();
			
			if (broj>0) {
				i = pozitivan++;
			}
			if (broj==0) {
				i = nula++;
			}
			if (broj<0) {
				i = negativan++;
			}
		}
		
		System.out.println(pozitivan+" pozitivnih "+ nula+" nula "+negativan+" negativnih");
	}

}
