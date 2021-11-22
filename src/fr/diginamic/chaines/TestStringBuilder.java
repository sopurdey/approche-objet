package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder();
		String text = "";

		// Ajoutez tous les nombres de 1 à 100 000 dans une instance de StringBuilder.
		long debut = System.currentTimeMillis();

		for (int i= 0; i <= 100000; i++) {
			builder.append(i);
		}
		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes (StringBuilder) :" + (fin - debut));
		
		// Refaites le chronométrage en utilisant cette fois uniquement la classe String et l’opérateur de concaténation +,
		long debut2 = System.currentTimeMillis();

		for (int i= 0; i <= 100000; i++) {
			text += i;
		}
		long fin2 = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes (concatination) :" + (fin2 - debut2));
	}

}
