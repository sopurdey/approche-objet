package fr.diginamic.testenumeration;

import java.util.ArrayList;

public class TestContinentAvecEnum {

	public static void main(String[] args) {

		ArrayList<Ville> villes = new ArrayList<>();
		villes.add(new Ville("New York", 8_419_000, Continent.AMERIQUENORD));
		villes.add(new Ville("Paris", 2_161_000, Continent.EUROPE));
		villes.add(new Ville("Pékin", 21_540_000, Continent.ASIE));
		villes.add(new Ville("Moscou", 11_920_000, Continent.EUROPE));
		villes.add(new Ville("Berlin", 3_645_000, Continent.EUROPE));
		villes.add(new Ville("Sydney", 5_312_000, Continent.OCEANIE));
		villes.add(new Ville("Sao Paulo", 12_330_000, Continent.AMERIQUESUD));
		villes.add(new Ville("Dakar", 1_056_600, Continent.AFRIQUE));
		
		for (Ville v: villes) {
			System.out.println(v);
		}
	}
}
