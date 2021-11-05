package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale adr1 = new AdressePostale(40, "rue Louis Lépine", 34470, "Pérols");
		
		// AdressePostale adr2 = new AdressePostale(4, "rue Edith Piaf", 44800, "Nantes");
		
		Personne p1 = new Personne("CREVAN", "Hervé", adr1);
		
		Personne p2 = new Personne("BONNAMY", "Richard");
	}

}
