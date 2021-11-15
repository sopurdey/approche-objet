package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class TesteListeInt {

	public static void main(String[] args) {
		
		ArrayList<Integer> entiers = new ArrayList<>(
				Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
		
		// Affichez tous les éléments de la liste
		for (Integer entier : entiers) {
			System.out.println(entier);
		}
		
		// Affichez la taille de la liste
		System.out.println(entiers.size());
		
		// Recherchez et affichez le plus grand élément de la liste
		Integer max = 0;
		for (int i = 0; i < entiers.size(); i++) {
			if (entiers.get(i) > max) {
				max = entiers.get(i);
			}
		}

		System.out.println("Plus grand : " + max);

		// Supprimez le plus petit élément de la liste et affichez le résultat
		System.out.println("Avant suppression du plus petit : " + entiers);
		Integer min = Collections.min(entiers);
		for (Integer i = 0; i < entiers.size(); i++) {
			if (entiers.get(i) < min) {
				min = entiers.get(i);
			}
		}
		System.out.println("Plus petit : " + min);
		
		Iterator<Integer> iter = entiers.iterator();
		while (iter.hasNext()) {
			Integer entier = iter.next();
			if(entier.equals(min)) {
				iter.remove();
			}
		}
		System.out.println("Après suppression du plus petit : " + entiers);
		
		// Recherchez tous les éléments négatifs et modifiez les de manière à ce qu’ils deviennent positifs.
		for (int i = 0; i < entiers.size(); i++) {
			if (entiers.get(i) < 0) {
				entiers.set(i, Math.abs(entiers.get(i)));
			}
		}
		// Affichez la liste résultante
		System.out.println("Après modifier nombres négatifs : " + entiers);
		
	}

}
