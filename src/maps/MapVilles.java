package maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import tri.Ville;

public class MapVilles {

	public static void main(String[] args) {

		// Créez une map permettant de stocker les instances de villes (valeur) en fonction de leur nom (clé).
		HashMap<String, Ville> mapVilles = new HashMap<>();
		mapVilles.put("Nice", new Ville("Nice", 343_000));
		mapVilles.put("Carcassonne", new Ville("Carcassonne", 47_800));
		mapVilles.put("Narbonne", new Ville("Narbonne", 53_400));
		mapVilles.put("Lyon", new Ville("Lyon", 484_000));
		mapVilles.put("Foix", new Ville("Foix", 9_700));
		mapVilles.put("Pau", new Ville("Pau", 77_200));
		mapVilles.put("Marseille", new Ville("Marseille", 850_700));
		mapVilles.put("Tarbes", new Ville("Tarbes", 40_600));
		

		// Recherchez et supprimez la ville qui a le moins d’habitants
		int min = Integer.MAX_VALUE;
		String cleMin = null;
		
		Iterator<String> iterCles = mapVilles.keySet().iterator();
		while (iterCles.hasNext()) {
			String cle = iterCles.next();
			Ville v = mapVilles.get(cle);
			if (v.getNbHabitants() < min) {
				min = v.getNbHabitants();
				cleMin = cle;
			}
		}
		System.out.println("Le moins d'habitants = " + cleMin);
		mapVilles.remove(cleMin);
		
		// Affichez l’ensemble des villes restantes
		for (Ville ville : mapVilles.values()) {
			System.out.println(ville);
		}
	}

}
