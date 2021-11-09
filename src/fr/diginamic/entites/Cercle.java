package fr.diginamic.entites;

public class Cercle {
	private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	/**
	 * Méthode pour calculer le périmètre d'un cercle
	 * @return double périmètre
	 */
	public double calculerPerimetre() {
		return 3.14 * 2 * rayon;
	}
	
	/**
	 * Méthode pour calculer la surface d'un cercle
	 * @return double surface
	 */
	public double calculerSurface() {
		return  3.14 * (rayon * rayon);
	}
	
	@Override
	public String toString() {
		return "Périmètre : " + calculerPerimetre() + " - Surface : " + calculerSurface();
	}

	public double getRayon() {
		return rayon;
	}

	public double setRayon(double rayon) {
		return this.rayon = rayon;
	}

}
