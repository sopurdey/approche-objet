package entites;

public class TestAdressePostale {

	public static void main(String[] args) {

		AdressePostale adr1 = new AdressePostale();
		adr1.numeroRue = 40;
		adr1.libelleRue = "rue Louis Lépine";
		adr1.codePostal = 34470;
		adr1.ville = "Pérols";
		
		AdressePostale adr2 = new AdressePostale();
		adr1.numeroRue = 4;
		adr1.libelleRue = "rue Edith Piaf";
		adr1.codePostal = 44800;
		adr1.ville = "Nantes";
		

	}

}
