package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder();
		String text = "";

		long debut = System.currentTimeMillis();
		// Code à chronométrer
		for (int i= 0; i< 100000; i++) {
			builder.append(i);
		}
		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes 1 :" + (fin - debut));
		
		long debut2 = System.currentTimeMillis();
		// Code à chronométrer
		for (int i= 0; i< 100000; i++) {
			text += i;
		}
		long fin2 = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes 2 :" + (fin2 - debut2));
	}

}
