package vladimir.tosic;

import java.util.Scanner;

public class primer15 {

	public static void main(String[] args) {
		// Napisati program koji učitava 10 brojeva i 
		// ispisuje koliko ima negativnih, nula i pozitivnih brojeva.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite 10 brojeva.");
		int poz=0,neg=0,nula=0;
		for (int i = 1;i<=10; i++) {
			System.out.println("Unesite "+i+". broj.");
			int broj = sc.nextInt();
			if (broj<0) {
				neg++;
			} else if(broj>0) {
				poz++;
			} else {
				nula++;
			}
		}
		System.out.println("Za unete brojeve broj negativnih je " +neg+", pozitivnih "+poz+" a broj nula je "+nula);
		sc.close();
	}

}
