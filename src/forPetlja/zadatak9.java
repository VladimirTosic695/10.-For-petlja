package forPetlja;

public class zadatak9 {

	public static void main(String[] args) {
		// 9. U intervalu brojeva od 1 .. 100 ispitati sve parne brojeve.
		
			
		
	/*	int s = 0;
		for(int i = 1; i <=100; i++) {
			if (i%==0) {
				s = s+i;
			}
		
		}*/
		
		
		for (int i = 1; i<=100; i++) {
			i = ++i;
			System.out.println(i + " ");
		}
	}

}
