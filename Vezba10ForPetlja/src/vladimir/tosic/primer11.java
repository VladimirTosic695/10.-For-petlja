package vladimir.tosic;

import java.util.Scanner;

public class primer11 {

	public static void main(String[] args) {
		// Napisati program kojim se štampaju Amstrongovi brojevi. 
		//Broj je Armstrongov ako je jednak zbiru kubova svojih cifara.
		// primer je za trocifrene brojeve
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite trocifren broj.");
		int broj = sc.nextInt();
		int s,d,j;
		
		
		
		for (int i =broj; i<=999;i++) {
			s = i/100;
			d = i/10 % 10;
			j = i%10;
			
			int arm = s*s*s+d*d*d+j*j*j;
			if(arm==i)
				System.out.println("armstrongov broj je " + arm);
		}
		
		sc.close();
		
		/* int s,d,j;
	
		for (int i =100; i<1000; i++) {
			
			s = i/100;
			d = (i%100)/10;
			j = i%10;
			
			if (i==s*s*s+d*d*d+j*j*j)
			System.out.println("Armstrongovi brojevi su " + i);
		
		} */
		/*	int broj, s,d,j;
			
			for(int i=100;i<1000;i++) {
				broj = i;
				s = broj/100;
				d = (broj/10)%10;
				j = broj%10;
				if (broj==s*s*s+d*d*d+j*j*j)
					System.out.println("Armstrongovi brojevi su " + broj);
			}
		sc.close();*/
	}

}
