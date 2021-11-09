package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		
		Theatre th1 = new Theatre("London Coliseum", 2300, 2100, 100_000);
		System.out.println(th1);
		
		th1.inscrire(50, 50.0);
		th1.inscrire(100, 50.0);
		th1.inscrire(50, 50.0);
		th1.inscrire(1, 50.0);

		System.out.println(th1);
	}

}
