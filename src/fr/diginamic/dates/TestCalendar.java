package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {

		// Utilisez la classe Calendar pour créer une instance de Date à la date du
		// 19 mai 2016 à 23h59 et 30 secondes
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2016, 4, 19, 23, 59, 30);

		// Affichez-la au format suivant :
		// jour/mois/année
		Date date1 = cal1.getTime();
		SimpleDateFormat fortmateur1 = new SimpleDateFormat("dd/MM/YYYY");
		String dateFormatee1 = fortmateur1.format(date1);
		System.out.println(dateFormatee1);

		// Utilisez la classe Calendar, créez une instance de Date à la date du jour.
		Calendar cal2 = Calendar.getInstance();
		
		Date aujourdhui = cal2.getTime();
		System.out.println(aujourdhui);
		
		// Affichez l’instance ainsi créée au format suivant :
		// année/mois/jour heure:minute:secondes
		SimpleDateFormat fortmateur2 = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		
		String dateFormatee2 = fortmateur2.format(aujourdhui);
		System.out.println(dateFormatee2);
		
		// Affichez la même instance avec le nom des jours et des mois :
		// en français
		SimpleDateFormat formateurFR = new SimpleDateFormat("EEEE MMMM YYYY HH:mm:ss", Locale.FRENCH);
		String dateFrancais = formateurFR.format(aujourdhui);
		System.out.println(dateFrancais);
		
		// en russe
		SimpleDateFormat formateurRu = new SimpleDateFormat("EEEE MMMM YYYY HH:mm:ss", new Locale("Ru", "RU"));
		String dateRusse = formateurRu.format(aujourdhui);
		System.out.println(dateRusse);
		
		// en chinois
		SimpleDateFormat formateurChinois = new SimpleDateFormat("EEEE MMMM YYYY HH:mm:ss", Locale.CHINA);
		String dateChine = formateurChinois.format(aujourdhui);
		System.out.println(dateChine);

		// en allemand
		SimpleDateFormat formateurAllemand = new SimpleDateFormat("EEEE MMMM YYYY HH:mm:ss", Locale.GERMAN);
		String dateDE = formateurAllemand.format(aujourdhui);
		System.out.println(dateDE);
				
	}

}
