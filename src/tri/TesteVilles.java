package tri;

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
		
		ArrayList<Ville> villesTri = new ArrayList<>();
		villesTri.addAll(villes);
		
		// Test Comparable
		// System.out.println("Tri avec Comparable : ");
		// Collections.sort(villesTri);
		
		// Test Comparator nombre d'habitants
		Collections.sort(villesTri, new ComparatorHabitant());
		System.out.println("Tri par nb habitants : ");
		for (Ville v: villesTri) {
			System.out.println(v);
		}
		System.out.println("Tri par nom : ");
		Collections.sort(villesTri, new ComparatorNom());
		
		for (Ville v: villesTri) {
			System.out.println(v);
		}
		
		
	}

}
