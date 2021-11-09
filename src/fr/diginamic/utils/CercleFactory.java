package fr.diginamic.utils;

import fr.dignamic.entites.Cercle;

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
