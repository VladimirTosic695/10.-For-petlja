package vladimir.tosic;

import java.util.Scanner;

public class primer13 {

	public static void main(String[] args) {
		// Napisati program za izračunavanje aritmetičke sredine unetih brojeva.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Za koliko brojeva zelite da izracunate srednju vrednost?");
		int kolikoBrojeva = sc.nextInt();
		double zbir = 0,as = 0;
		for(int i =1;i<=kolikoBrojeva; i++) {
			System.out.println("Unesite " +i+". broj.");
			double broj = sc.nextDouble();
			zbir = zbir + broj;
			 as = zbir/kolikoBrojeva;
		}
		System.out.println("AS je "+as);
		sc.close();
		
	}
	
}
