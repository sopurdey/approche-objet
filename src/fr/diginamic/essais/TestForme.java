package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(3);
		Carre carre1 = new Carre(2);
		Rectangle rectangle1 = new Rectangle(5, 10);
		
		AffichageForme a = new AffichageForme();
		
		a.afficher(cercle1);
		a.afficher(carre1);
		a.afficher(rectangle1);
	}	

}
