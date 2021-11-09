package fr.diginamic.formes;

public class Cercle extends Forme {
	private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	@Override
	public double calculerSurface() {
		return 3.14 * (rayon * rayon);
	}

	@Override
	public double calculerPerimetre() {
		return 3.14 * 2 * rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public double setRayon(double rayon) {
		return this.rayon = rayon;
	}





}
