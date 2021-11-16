package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TesteVilles {

	public static void main(String[] args) {
		
		ArrayList<Ville> villes = new ArrayList<>();
		villes.add(new Ville("Nice", 343_000));
		villes.add(new Ville("Carcassonne", 47_800));
		villes.add(new Ville("Narbonne", 53_400));
		villes.add(new Ville("Lyon", 484_000));
		villes.add(new Ville("Foix", 9_700));
		villes.add(new Ville("Pau", 77_200));
		villes.add(new Ville("Marseille", 850_700));
		villes.add(new Ville("Tarbes", 40_600));
		
		// Recherchez et affichez la ville la plus peuplée
		Ville plusPeuplee = villes.get(0);
		
		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).getNbHabitants() > plusPeuplee.getNbHabitants()) {
				plusPeuplee = villes.get(i);
			}
		}
		System.out.println(plusPeuplee);
		
		// Supprimez la ville la moins peuplée
		Ville moinsPeuplee = villes.get(0);
		
		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).getNbHabitants() < moinsPeuplee.getNbHabitants()) {
				moinsPeuplee = villes.get(i);
			}
		}
		System.out.println(moinsPeuplee);
		villes.remove(moinsPeuplee);
		System.out.println(villes);
		
		// Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
		for (Ville v: villes) {
			if (v.getNbHabitants() > 100_000) {
				v.setNom(v.getNom().toUpperCase());
			}
		}

		// Affichez la liste résultante
		for (Ville v: villes) {
			System.out.println(v);
		}
		
		System.out.println("======================");
		
		ArrayList<Ville> villesTri = new ArrayList<>();
		villesTri.addAll(villes);
		
		// Test Comparable
		Collections.sort(villesTri);
		for (Ville v: villesTri) {
			System.out.println(v);
		}
		
		
	}

}
