package vladimir.tosic;

import java.util.Scanner;

public class primer7 {

	public static void main(String[] args) {
		// Napisati program kojim se za date prirodne brojeve m i n, izračunava:
		// S = n*(n+m)*(n+2m)*(n+3m)...*(n+m*m)
		
		Scanner sc = new Scanner(System.in);
		int m, n;
		System.out.println("Unesite broj m");
		m = sc.nextInt();
		System.out.println("Unesite broj n");
		n = sc.nextInt();
		int s = 1;
		for (int i =1; i<=m;i++) {
			s= s * (n+i*m);
			
		}
		System.out.println("S= "+ n*s);
		sc.close();
	}

}
