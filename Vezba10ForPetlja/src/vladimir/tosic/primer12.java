package vladimir.tosic;

import java.util.Scanner;

public class primer12 {

	public static void main(String[] args) {
		// Napisati program koji prebrojava brojeve od 1 .. n koji su deljivi brojem 3.
		Scanner sc = new Scanner (System.in);
		int broj;
		System.out.println("Unesite broj");
		broj = sc.nextInt();
		int deljiv = 0;
		for (int i = broj; i<=20; i++) {
			if(i%3==0)
				deljiv++;
		}
		System.out.println("brojeva deljivih sa 3 ima " + deljiv);
		sc.close();
		
	}

}
