package vladimir.tosic;

import java.util.Scanner;

public class primer4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int brojSabiraka;
		System.out.println("Koliko brojeva zelite da sabarete? ");
		brojSabiraka = sc.nextInt();
		double broj,zbir = 0;
		for (int i = 1; i<=brojSabiraka; i++) {
			System.out.println("Unesite "+i+". broj.");
			broj = sc.nextDouble();
			zbir = zbir + broj;		
		}
		System.out.println("Zbir unetih brojeva je " + zbir);
		sc.close();
	}

}
