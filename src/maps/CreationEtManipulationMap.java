package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {

		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		
		// Ajouter dans mapVilles les informations pour Lille, Lyon et Bordeaux
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		
		// Mettre en place une boucle pour afficher l'ensemble des clés contenues dans la map
		System.out.println("Clés : ");
		Iterator<Integer> clesIter = mapVilles.keySet().iterator();
		while (clesIter.hasNext()) {
			System.out.println(clesIter.next());
		}
		
		System.out.println("------------------------");
		
		// Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
		System.out.println("Valeurs : ");
		Iterator<String> valeursIter = mapVilles.values().iterator();
		while (valeursIter.hasNext()) {
			System.out.println(valeursIter.next());
		}
		
		System.out.println("------------------------");

		// Afficher la taille de la map
		System.out.println("Taille : " + mapVilles.size());
	}

}
