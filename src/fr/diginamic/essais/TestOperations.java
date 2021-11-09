package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		
		double a = 10.0;
		double b = 2.5;
		
		double resultat = 0;
		
		resultat = Operations.calcul(a, b, '+');
		System.out.println(resultat);
		
		resultat = Operations.calcul(a, b, '-');
		System.out.println(resultat);
		
		resultat = Operations.calcul(a, b, '*');
		System.out.println(resultat);
		
		resultat = Operations.calcul(a, b, '/');
		System.out.println(resultat);

	}

}
