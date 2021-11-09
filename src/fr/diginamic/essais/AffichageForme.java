package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	public void afficher(Forme f) {
		String texte = "Périmètre : " + f.calculerPerimetre() + " - Surface : " + f.calculerSurface();
		System.out.println(texte);
	}


}
