package fr.diginamic.maison;

public abstract class Piece {
	protected double superficie;
	protected int etage;
	
	protected abstract String getType();
	
	public Piece(double superficie, int etage) {
		this.superficie = superficie;
		this.etage = etage;
	}

	@Override
	public String toString() {
		return getType() + " [superficie=" + superficie + ", etage=" + etage + "]";
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}

}
