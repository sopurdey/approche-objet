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
import java.util.Set;

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

		// Stocker la séléction des villes du département triée par population (décroissant)
		ArrayList<Ville> selection = new ArrayList<>();
		for (Ville ville : villes) {
			if (ville.getCodeDepartement().equals("34")) {
				selection.add(ville);
			}
		}
		
		// Afficher les 10 premières villes de la liste
		System.out.println("10 plus grandes villes de l'Hérault : ");
		for (int i = 0; i < 10; i++) {
			System.out.println(selection.get(i).getNomCommune() + " - " + selection.get(i).getPopTotale());
		}
		
		System.out.println("=======================");

		// Affichez les 10 plus petites villes du département
		System.out.println("10 plus petites villes de l'Hérault : ");
		// Inverser l'ordre du tri par ordre croissant
		Collections.reverse(selection);
		// Afficher les 10 premières villes de la liste
		for (int i = 0; i < 10; i++) {
			System.out.println(selection.get(i).getNomCommune() + " - " + selection.get(i).getPopTotale());
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
	}

}
