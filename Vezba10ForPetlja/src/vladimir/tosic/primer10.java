package vladimir.tosic;

import java.util.Scanner;

public class primer10 {

	public static void main(String[] args) {
		// U zadatom intervalu ispitati i ispisati sve brojeve deljive brojem 3.
		
		Scanner sc = new Scanner (System.in);
		
		int a,b;
		System.out.println("Unesite prvi proj.");
		a = sc.nextInt();
		System.out.println("Unesite drugi proj.");
		b = sc.nextInt();
		sc.close();
		int i;
		for (i = a; i<=b;i++) {
			if (i%3==0) {
				System.out.print(i+ " ");
			}
			
		}
		
	}

}
