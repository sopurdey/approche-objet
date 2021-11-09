package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		Salarie s1 = new Salarie("DYLAN", "Bob", 1500);
		System.out.println(s1.getSalaire());
		s1.afficherDonnees();
		//System.out.println(s1);
		
		Pigiste p1 = new Pigiste("BLOGGS", "Joe", 15, 84.5);
		System.out.println(p1.getSalaire());
		p1.afficherDonnees();
	}

}
