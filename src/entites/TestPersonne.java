package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale adr1 = new AdressePostale(40, "rue Louis Lépine", 34470, "Pérols");
		
		AdressePostale adr2 = new AdressePostale(4, "rue Edith Piaf", 44800, "Nantes");
		
		Personne p1 = new Personne("Crevan", "Hervé", adr1);
		
		Personne p2 = new Personne("Bonnamy", "Richard");
		
		p1.afficherNomMajuscules();
		p1.setNom("Dupont");
		p1.setPrenom("Jean");
		p1.afficherNomMajuscules();
		System.out.println(p2.getAdresse());
		p2.setAdresse(adr2);
		System.out.println(p1.adresse);
		System.out.println(p2.getNom());
		System.out.println(p2.getPrenom());
		System.out.println(p2.getAdresse());
	}

}
