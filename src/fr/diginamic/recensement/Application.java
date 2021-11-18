package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Application {

	public static void main(String[] args) throws IOException {
		/* === ETAPE 1 == */

		// Lecture du fichier
		Path cheminFichier = Paths.get("C:/Users/Formation/Downloads/recensement.csv");

		// Liste pour les lignes de tableau
		List<String> lignes = Files.readAllLines(cheminFichier);

		// Liste pour stocker toutes les villes
		ArrayList<Ville> villes = new ArrayList<>();

		for (int i = 1; i < lignes.size(); i++) {

			String ligne = lignes.get(i);

			// Découper la ligne en tableaux de chaînes de caractères
			String[] morceaux = ligne.split(";");

			String codeRegion = morceaux[0];
			String nomRegion = morceaux[1];
			String codeDepartement = morceaux[2];
			String codeCommune = morceaux[5];
			String nomCommune = morceaux[6];
			String population = morceaux[9];

			int popTotale = Integer.parseInt(population.replace(" ", "").trim());

			// Créer une instance de la ville
			Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, popTotale);

			// Ajouter l'instance à la liste
			villes.add(ville);
		}

		/* === ETAPE 3 == */
		// Recherchez la ville de Montpellier et affichez toutes les informations la
		// concernant
		for (Ville ville : villes) {
			if (ville.getNomCommune().contentEquals("Montpellier")) {
				System.out.println("Montpellier : " + ville);
			}
		}

		/* === ETAPE 4 == */
		// Afficher la population de tout le département de l’Hérault
		int popHerault = 0;
		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).getCodeDepartement().equals("34")) {
				popHerault += villes.get(i).getPopTotale();
			}
		}
		System.out.println("Population de l'Hérault : " + popHerault);

		/* === ETAPE 5 == */
		// Affichez la plus petite ville du département
		Ville popVilleMin = villes.get(0);
		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).getCodeDepartement().equals("34")
					&& villes.get(i).getPopTotale() < popVilleMin.getPopTotale()) {
				popVilleMin = villes.get(i);
			}
		}
		System.out.println("Ville la moins peuplée : " + popVilleMin.getNomCommune());

		System.out.println("=======================");

		/* === ETAPE 6 == */
		// Affichez les 10 plus grandes villes du département

		// Trier par population - ordre décroissant
		Collections.sort(villes, new ComparatorPopulation());

		// Stocker la séléction des villes du département triée par population
		// (décroissant)
		ArrayList<Ville> selectionHerault = new ArrayList<>();
		for (Ville ville : villes) {
			if (ville.getCodeDepartement().equals("34")) {
				selectionHerault.add(ville);
			}
		}

		// Afficher les 10 premières villes de la liste
		System.out.println("10 plus grandes villes de l'Hérault : ");
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1 + ") " + selectionHerault.get(i).getNomCommune() + " - "
					+ selectionHerault.get(i).getPopTotale());
		}

		System.out.println("=======================");

		// Affichez les 10 plus petites villes du département
		System.out.println("10 plus petites villes de l'Hérault : ");
		// Inverser l'ordre du tri par ordre croissant
		Collections.reverse(selectionHerault);
		// Afficher les 10 premières villes de la liste
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1 + ") " + selectionHerault.get(i).getNomCommune() + " - "
					+ selectionHerault.get(i).getPopTotale());
		}

		System.out.println("=======================");

		/* === ETAPE 7 == */
		// Affichez la population de toute la région Occitanie
		int popOccitanie = 0;
		for (Ville ville : villes) {
			if (ville.getNomRegion().equals("Occitanie")) {
				popOccitanie += ville.getPopTotale();
			}
		}
		System.out.println("Population de l'Occitanie : " + popOccitanie);

		System.out.println("=======================");

		/* === ETAPE 8 == */
		// Affichez les 10 villes les plus importantes de la région Occitanie
		ArrayList<Ville> selectionOccitanie = new ArrayList<>();
		for (Ville ville : villes) {
			if (ville.getNomRegion().equals("Occitanie")) {
				selectionOccitanie.add(ville);
			}
		}

		System.out.println("Les 10 plus grandes villes de l'Occitanie : ");
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1 + ") " + selectionOccitanie.get(i).getNomCommune() + " - "
					+ selectionOccitanie.get(i).getPopTotale());
		}

		System.out.println("=======================");

		// Affichez le département le plus peuplé de la région Occitanie
		// TODO trouver une solution plus optimisée
		HashMap<String, Integer> deptPopMap = new HashMap<>();
		Integer pop = 0;
		for (Ville ville : selectionOccitanie) {
			// Vérifier si le département est déjà dans la map
			if (deptPopMap.containsKey(ville.getCodeDepartement())) {

				// Addition de la population de l'instance à la population du département
				pop = deptPopMap.get(ville.getCodeDepartement()) + ville.getPopTotale();

				// Ajout du nouveau total comme valeur de la clé du département
				deptPopMap.put(ville.getCodeDepartement(), pop);
			} else {
				pop = ville.getPopTotale();

				// Création de pair clé (département) et valeur (population)
				deptPopMap.put(ville.getCodeDepartement(), pop);
			}
		}

		// Boucle pour trouver le département avec la plus grande population
		Map.Entry<String, Integer> maxPop = null;
		for (Map.Entry<String, Integer> entry : deptPopMap.entrySet()) {
			if (maxPop == null || entry.getValue().compareTo(maxPop.getValue()) > 0) {
				maxPop = entry;
			}
		}
		System.out.println(maxPop.getKey() + " est le département le plus peuplé en Occitanie avec " + maxPop.getValue()
				+ " habitants");

		/* === ETAPE 8 == */
		// Affichez les 10 régions les plus peuplées de France
		HashMap<String, Integer> regionPopMap = new HashMap<>();
		Integer popRegion = 0;
		for (Ville ville : villes) {
			// Vérifier si la région est déjà dans la map
			if (regionPopMap.containsKey(ville.getNomRegion())) {

				// Addition de la population de l'instance à la population de la région
				popRegion = regionPopMap.get(ville.getNomRegion()) + ville.getPopTotale();

				// Ajout du nouveau total comme valeur de la clé de la région
				regionPopMap.put(ville.getNomRegion(), popRegion);
			} else {
				popRegion = ville.getPopTotale();

				// Création de pair clé (nom de région) et valeur (population)
				regionPopMap.put(ville.getNomRegion(), popRegion);
			}
		}
		
		// Boucle pour trouver la région avec la plus grande population
		Map.Entry<String, Integer> maxPopRegion = null;
		for (Map.Entry<String, Integer> entry : regionPopMap.entrySet()) {
			if (maxPopRegion == null || entry.getValue().compareTo(maxPopRegion.getValue()) > 0) {
				maxPopRegion = entry;
			}
		}
		System.out.println(maxPopRegion.getKey() + " est la région le plus peuplée avec " + maxPopRegion.getValue()
				+ " habitants");
	}
}
