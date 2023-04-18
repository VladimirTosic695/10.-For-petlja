package forPetlja;

public class zadatak2 {

	public static void main(String[] args) {
		
		System.out.printf("%8s%8s%8s \n", "broj","kvadat","kub");
		
		for (int kvadrat = 1; kvadrat <=5; kvadrat++ )
		{
			System.out.printf("%8d%8d%8d \n", kvadrat, kvadrat*kvadrat, kvadrat*kvadrat*kvadrat);
		}

	}

}
