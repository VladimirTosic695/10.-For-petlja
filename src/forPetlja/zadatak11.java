package forPetlja;

import java.util.Scanner;

public class zadatak11 {

	public static void main(String[] args) {
		// 11. Napisati program kojim se štampaju Amstrongovi brojevi. 
		//Broj je Armstrongov ako je jednak zbiru kubova svojih cifara.
		
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Unesite broj.");
		a = sc.nextInt();
		
		int d,s,j;
		
		
		int Armstrongov;
		for (int i = 1; 100<=999; i++) {
			
			Armstrongov = i;
			
			s = a/100;
			d = (a/10)%10;
			j = a%10;
			
			
					
					if (s*s*s)+(d*d*d)+(j*j*j);
			System.out.println("broj je " + Armstrongov);
		}
		
	
		
	}

}
