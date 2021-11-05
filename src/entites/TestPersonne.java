package entites;

import entites2.Personne;

public class TestPersonne {

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
		
		Personne p1 = new Personne();
		p1.nom = "CREVAN";
		p1.prenom = "Hervé";
		p1.adressePostale = adr1;
		
		Personne p2 = new Personne();
		p2.nom = "BONNAMY";
		p2.prenom = "Richard";
		p2.adressePostale = adr2;
	}

}
