package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {

		// Créez une instance de la classe java.util.Date à la date du jour
		Date date1 = new Date();
		System.out.println(date1);

		// Affichez l’instance ainsi créée au format suivant :
		// jour/mois/année (sans la partie heure)
		SimpleDateFormat fortmateur1 = new SimpleDateFormat("dd/MM/YYYY");
		String dateFormatee1 = fortmateur1.format(date1);
		System.out.println(dateFormatee1);

		// Créez une instance de la classe Date à la date du
		// 19/05/2016 à 23 :59 :30 secondes
		Date date2 = new Date(116, 4, 19, 23, 59, 30);

		// Affichez l’instance ainsi créée au format suivant :
		// année/mois/jour heure:minute:seconde
		SimpleDateFormat fortmateur2 = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		
		String dateFormatee2 = fortmateur2.format(date2);
		System.out.println(dateFormatee2);
		
	}

}
