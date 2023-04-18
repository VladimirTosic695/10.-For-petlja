package forPetlja;

import java.util.Scanner;

public class zadatak4 {

	public static void main(String[] args) {
		//4. Napisati program koji sabira zadati broj sabiraka.
		Scanner sc = new Scanner(System.in);
		
		int brojSabiraka;
		System.out.println("Koliko brojeva zelite da saberete?");
		brojSabiraka = sc.nextInt();
		
		int zbir = 0;
		
		for (int i = 1; i<=brojSabiraka; i++)
		{
			System.out.println("Unesite "+i+" broj: ");
			int sabirak = sc.nextInt();
			zbir = zbir + sabirak;
		}
		System.out.println("Zbir brojeva je " + zbir);
		
	}

}
