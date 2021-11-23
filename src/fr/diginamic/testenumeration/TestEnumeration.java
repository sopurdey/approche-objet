package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {

		// Utilisez une boucle pour affichez toutes les saisons.
		Saison saisons[] = Saison.values();
		for (Saison s : saisons) {
			System.out.println(s);
		}
		
		System.out.println(Saison.valueOf("HIVER"));

		// Utilisez une méthode de base des énumérations pour retrouver et afficher le
		// libellé de l’instance de Saison dont le nom est ETE.
		String nom = "ETE";
		Saison saisonEte = Saison.valueOf(nom);
		System.out.println("ETE : " + saisonEte.getLibelle());
		
		// Teste de la méthode getByLabel();
		String libelle = "Hiver";
		Saison saisonHiver = Saison.getByLabel(libelle);
		System.out.println("HIVER : " + saisonHiver);
		
	}

}
