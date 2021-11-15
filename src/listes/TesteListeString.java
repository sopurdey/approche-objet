package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TesteListeString {

	public static void main(String[] args) {

		ArrayList<String> villes = new ArrayList<>(
				Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
		
		// Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
		String longest = villes.get(0);
		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).length() > longest.length()) {
				longest = villes.get(i);
			}
		}
		System.out.println("Plus de lettres : " + longest);
		
		// Modifiez le contenu de la liste de manière à mettre tous les noms de villes en majuscules.
		for (int i = 0; i < villes.size(); i++) {
			villes.set(i, villes.get(i).toUpperCase());
		}
		System.out.println("Villes en majuscules : " + villes);
		
		// Supprimez de la liste les villes dont le nom commence par la lettre N.
		Iterator<String> iter = villes.iterator();
		while (iter.hasNext()) {
			String ville = iter.next();
			if (ville.startsWith("N")) {
				iter.remove();
			}
		}
		//Affichez la liste résultante
		System.out.println("Villes (sans commencer par N : " + villes);
		for (String ville : villes) {
			System.out.println(ville);
		}
		
	}

}
