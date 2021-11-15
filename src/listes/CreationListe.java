package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {

		// Créez une ArrayList d’entiers et stockez-y tous les nombres de 1 à 100
		ArrayList<Integer> entiers = new ArrayList<>();
		
		for (int i = 1; i <= 100; i++) {
			entiers.add(i);
		}
		
		System.out.println(entiers.size());
	}

}
