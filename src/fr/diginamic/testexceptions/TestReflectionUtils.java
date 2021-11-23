package fr.diginamic.testexceptions;

import fr.diginamic.exceptions.ReflectionException;
import listes.Ville;

public class TestReflectionUtils {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, ReflectionException {
		Ville ville = new Ville("Montpellier", 277_600);
		
		ReflectionUtils refUtils = new ReflectionUtils();
		
		refUtils.afficherAttributs(ville);
		
		// Tester ReflectionException
		refUtils.afficherAttributs(null);

	}

}
