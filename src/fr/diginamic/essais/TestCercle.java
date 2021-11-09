package fr.diginamic.essais;

import fr.diginamic.utils.CercleFactory;
import fr.dignamic.entites.Cercle;

public class TestCercle {

	public static void main(String[] args) {

		// Création de cercle sans la classe Factory
		Cercle c1 = new Cercle(3);
		Cercle c2 = new Cercle(4);
		
		System.out.println(c1);
		System.out.println(c2);
		
		// Création de cercle avec la classe Factory
		Cercle c3 = CercleFactory.creerCercle(1);
		
		System.out.println(c3);
	}

}
