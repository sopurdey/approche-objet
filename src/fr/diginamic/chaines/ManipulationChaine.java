package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		
		char premierCaractere = chaine.charAt(0);
		// Afficher la première caractère
		System.out.println("Première caractère : " + premierCaractere);
		
		// La longeur de la chaine de caractères
		System.out.println(chaine.length());
		// Afficher l'index du 1er ;
		System.out.println(chaine.indexOf(';'));
		
		// Afficher le nom de famille (en majuscules, puis minuscules)
		String nom = chaine.substring(chaine.indexOf(premierCaractere), chaine.indexOf(';'));
		System.out.println(nom.toUpperCase());
		System.out.println(nom.toLowerCase());
		
		// Découper la chaine de caractères en morceaux
		String[] arr = chaine.split(";");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		String nomS1 = arr[0];
		String prenomS1 = arr[1];
		Double salaireS1 = Double.parseDouble(arr[2].replace(" ", ""));
		
		Salarie s1 = new Salarie(nomS1, prenomS1, salaireS1);
		s1.setSalaire(salaireS1);
		System.out.println(s1);
		
	}

}
