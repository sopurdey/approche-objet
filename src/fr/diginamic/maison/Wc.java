package fr.diginamic.maison;

public class Wc extends Piece {

	public Wc(double superficie, int etage) {
		super(superficie, etage);

	}

	@Override
	protected String getType() {
		return "WC";
	}
}
