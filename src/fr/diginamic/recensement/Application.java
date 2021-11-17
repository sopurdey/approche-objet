package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Application {

	public static void main(String[] args) throws IOException {

		// Lecture du fichier
		Path cheminFichier = Paths.get("C:/Users/Formation/Downloads/recensement.csv");

		// Liste pour les lignes de tableau
		List<String> lignes = Files.readAllLines(cheminFichier);
		
		// Liste pour stocker toutes les villes
		ArrayList<Ville> villes = new ArrayList<>();
		
		//String ligneEntete = lignes.get(0);
		//String enteteFichier = creerLigne(ligneEntete);
		
		
		String ligne;
		for (int i = 1; i < lignes.size(); i++) {

			ligne = lignes.get(i);

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
		
		// Recherchez la ville de Montpellier et affichez toutes les informations la concernant
		for (Ville ville : villes) {
			if (ville.getNomCommune().contentEquals("Montpellier")) {
				System.out.println(ville);
			}
		}
		
		System.out.println("=======================");
		
		// afficher la population de tout le département de l’Hérault
		int popHerault = 0;
		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).getCodeDepartement().equals("34")) {
				popHerault += villes.get(i).getPopTotale();
			}
		}
		System.out.println(popHerault);
		
		System.out.println("=======================");
		
		// Affichez la plus petite ville du département
		Ville villeMin = villes.get(0);
		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).getCodeDepartement().equals("34") 
					&& villes.get(i).getPopTotale() < villeMin.getPopTotale()) {
				villeMin = villes.get(i);
			}
		}
		System.out.println(villeMin);
		
		// Affichez les 10 plus grandes villes du département

		
		// Affichez les 10 plus petites villes du département
		
	}
	
	
	
	
	

	/*
	public static String creerLigne(String ligne) {
		String[] cols = ligne.split(";");
		return cols[0] + ";" + cols[1] + ";" + cols[2] + ";" + cols[5] + ";" + cols[6] + ";" + cols[9] + ";";
	}
	*/

}
