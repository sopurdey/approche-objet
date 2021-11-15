package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TesteListeString {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(
				Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
		
		// Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
		String longest = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() > longest.length()) {
				longest = list.get(i);
			}
		}
		System.out.println("Plus de lettres : " + longest);
		
		// Modifiez le contenu de la liste de manière à mettre tous les noms de villes en majuscules.
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i).toUpperCase();
			list.set(i, s);
		}
		System.out.println(list);
		
		// Supprimez de la liste les villes dont le nom commence par la lettre N.
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String item = iter.next();
			if (item.startsWith("N")) {
				iter.remove();
			}
		}
		//Affichez la liste résultante
		System.out.println(list);
		
	}

}
