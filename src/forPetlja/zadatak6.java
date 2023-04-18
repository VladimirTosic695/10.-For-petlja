package forPetlja;

import java.util.Scanner;

public class zadatak6 {

	public static void main(String[] args) {
		// 6. Napisati naredbe kojima se za 
		//dato n izračunava faktorijel prirodnog broja n: fakt = n! = 1*2*3*...*n

		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Unesite broj n");
		n = sc.nextInt();
		int a = 1;
		for (int b = 1; b<=n; b++) {
			a = a*b;
		}
		System.out.println("Faktorijel za broj " + n + " je " + a);
	sc.close();
	}

}
