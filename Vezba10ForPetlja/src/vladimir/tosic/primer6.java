package vladimir.tosic;

import java.util.Scanner;

public class primer6 {

	public static void main(String[] args) {
//Napisati naredbe kojima se za dato n izračunava faktorijel
// prirodnog broja n: fakt = n! = 1*2*3*...*n
		
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Unesite broj n.");
	n = sc.nextInt();
	int faktorijel = 1;
	for (int i = 1; i<=n; i++) {
		faktorijel = faktorijel * i;
		
	}
	System.out.println("Faktorijel broja " + n + " je " +faktorijel);
	sc.close();
	}

}
