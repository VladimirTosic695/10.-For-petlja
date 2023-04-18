package vladimir.tosic;

//import java.util.Scanner;

public class primer5 {

	public static void main(String[] args) {
	// 5. Napisati niz naredbi kojim se izračunava kvadrat prirodnih brojeva od 15 do 25.
		//Scanner sc = new Scanner(System.in);
		int kvadrat;
		System.out.println("Broj\tkvadrat");
		for(int i = 15;i<=25; i++) {
			kvadrat = i*i;
			System.out.println(i+"\t"+kvadrat+" ");
		}
	}

}
