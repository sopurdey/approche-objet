package entites;

public class TestAdressePostale {

	public static void main(String[] args) {

		AdressePostale adr1 = new AdressePostale(40, "rue Louis Lépine", 34470, "Pérols");
		
		AdressePostale adr2 = new AdressePostale(4, "rue Edith Piaf", 44800, "Nantes");
		
		System.out.println(adr1.libelle);
	}

}
