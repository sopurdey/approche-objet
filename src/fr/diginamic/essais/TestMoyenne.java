package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {

		CalculMoyenne tableau = new CalculMoyenne();

		tableau.ajout(2.5);
		tableau.ajout(2.0);
		tableau.ajout(5.0);

		double resultat = tableau.calcul();

		System.out.println(resultat);

	}

}
