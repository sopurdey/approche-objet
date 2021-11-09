package fr.diginamic.operations;

public class Operations {
	/**
	 * Méthode pour calculer les opérations mathématiques
	 * @param a
	 * @param b
	 * @param operateur
	 * @return
	 */
	public static double calcul(double a, double b, char operateur) {
		
		if(operateur == '+') {
			return a + b;
		} else if (operateur == '-') {
			return a - b;
		} else if (operateur == '*') {
			return a * b;
		} else {
			return a / b;
		}
	}
	
	
}
