package fr.diginamic.essais;

import java.util.Random;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.Wc;

public class TestMaison {

	public static void main(String[] args) {
		Cuisine kitchen = new Cuisine(15, 0);
		Piece pieces[] = {kitchen};
		
		Maison house = new Maison(pieces);
		System.out.println(house);
		
		// Test ajouter pièce null
		Piece test = null;
		house.ajouterPiece(test);
		
		// Création de pièces
		Salon lounge = new Salon(20, 0);
		SalleDeBain bath1 = new SalleDeBain(5.5, 1);
		Wc wc1 = new Wc(1.5, 0);
		Wc wc2 = new Wc(2, 0);
		Chambre bed1 = new Chambre(12, 0);
		Chambre bed2 = new Chambre(15, 1);
		Chambre bed3 = new Chambre(10.5, 1);
		
		// Ajouter pièces à la maison
		house.ajouterPiece(lounge);
		house.ajouterPiece(bath1);
		house.ajouterPiece(wc1);
		house.ajouterPiece(wc2);
		house.ajouterPiece(bed1);
		house.ajouterPiece(bed2);
		house.ajouterPiece(bed3);
		
		System.out.println(house);
		
		// Superficie RDC
		System.out.println(house.getSuperficieParEtage(0));
		// Superficie étage 1
		System.out.println(house.getSuperficieParEtage(1));
		// Superficie de la maison
		System.out.println(house.getSuperficieTotale());
		// Superficie par type Salon / Chambre
		System.out.println(house.getSuperficieParTypePiece("Salon"));
		System.out.println(house.getSuperficieParTypePiece("Chambre"));
		
		// Nombre de chambres
		System.out.println(house.getNbPiecesParTypePiece("Chambre"));
		System.out.println();
		System.out.println(new Random().nextInt(19 - 12) + 12);
	}

}
