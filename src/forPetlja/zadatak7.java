package forPetlja;

import java.util.Scanner;

public class zadatak7 {

	public static void main(String[] args) {
		// 7. Napisati program kojim se za date prirodne brojeve m i n, izračunava:
		// S = n*(n+m)*(n+2m)*(n+3m)...*(n+m*m)

		
		Scanner sc = new Scanner(System.in);
		
		int n,m;
		int suma = 0;
		System.out.println("Unesite n");
		n = sc.nextInt();
		System.out.println("Unesite m");
		m = sc.nextInt();
		
		for (int i = 1; i<=m ;m++ ) {
			suma = suma + n*(n+i*m);
		}
		System.out.println("Racun je " + suma);
	}

}
