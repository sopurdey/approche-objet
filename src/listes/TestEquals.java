package listes;

public class TestEquals {

	public static void main(String[] args) {

		// Vérifiez que la méthode equals retourne true pour 2 instances de villes qui
		// ont les mêmes attributs.
		Ville v1 = new Ville("Nice", 343_000);
		Ville v2 = new Ville("Nice", 343_000);

		System.out.println(v1.equals(v2)); // true

		// Faites le test maintenant en utilisant l’opérateur == avec les mêmes attributs.
		System.out.println(v1 == v2); // false (pas le même espace mémoire)
		
		// Vérifiez que la méthode retourne false si vous changez un des attributs.
		v1.setNom("Montpellier");
		System.out.println(v1.equals(v2)); // false

		// Faites le test maintenant en utilisant l’opérateur == avec des attributs différents.
		System.out.println(v1 == v2); // false
		
	}

}
