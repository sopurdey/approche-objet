package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {
	/**
	 * Méthode pour créer les cercles
	 * @param r rayon
	 * @return une instance de la classe Cercle
	 */
	public static Cercle creerCercle(double r) {
		return new Cercle(r);
	}
}
