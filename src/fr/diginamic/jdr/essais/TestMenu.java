package fr.diginamic.jdr.essais;

import fr.diginamic.jdr.entites.Gobelin;
import fr.diginamic.jdr.entites.Joueur;
import fr.diginamic.jdr.entites.Loup;
import fr.diginamic.jdr.entites.Menu;
import fr.diginamic.jdr.entites.Troll;

public class TestMenu {

	public static void main(String[] args) {
		Menu menu1 = new Menu();

		// Instanciation des créatures pour combattre
		Loup loup = new Loup(0, 0);
		System.out.println("Loup : " + loup);
		Gobelin gobelin = new Gobelin(0,0);
		System.out.println("Gobelin : " + gobelin);
		Troll troll = new Troll(0,0);
		System.out.println("Troll : " + troll);
		
		menu1.creerPersonnage();
		System.out.println(menu1);
		menu1.combattreCreature(loup);
		
	}

}
