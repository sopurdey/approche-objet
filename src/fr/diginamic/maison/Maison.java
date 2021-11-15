package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
	protected Piece[] pieces;
	
	public Maison(Piece[] pieces) {
		this.pieces = pieces;
	}

	public void ajouterPiece(Piece piece) {
		if (piece == null) {
			System.out.println("Erreur : il faut ajouter une pièce.");
		} else if (piece.getSuperficie() <= 0 || piece.getEtage() < 0) {
			System.out.println("Erreur : il faut un chiffre positif");
		} else {
			pieces = Arrays.copyOf(pieces, pieces.length + 1);
			pieces[pieces.length - 1] = piece;
		}

	}
	
	public double getSuperficieTotale() {
		double total = 0;
		for (int i = 0; i < pieces.length; i++) {
			total += pieces[i].getSuperficie();
		}
		return total;
	}
	
	public double getSuperficieParEtage(int etage) {
		double total = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getEtage() == etage) {
				total += pieces[i].getSuperficie();
			}
		}
		return total;
	}
	
	public double getSuperficieParTypePiece(String type) {
		double total = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getType() == type) {
				total += pieces[i].getSuperficie();
			}
		}
		return total;
	}
	
	public int getNbPiecesParTypePiece(String type) {
		int total = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getType() == type) {
				total += 1;
			}
		}
		return total;
	}

	@Override
	public String toString() {
		return "Maison [pieces=" + Arrays.toString(pieces) + "]";
	}

}
