package fr.diginamic.jdr.entites;

import java.util.Random;

public class Menu {
	public Joueur joueur;

	public Menu() {

	}

	public Joueur creerPersonnage() {
		int f = this.chiffreAleatoire(19, 12);
		int v = this.chiffreAleatoire(51, 20);

		joueur = new Joueur(f, v, 0);
		return joueur;
	}

	public void combattreCreature(Personnage c) {
		if (joueur.getVie() == 0) {
			String text = "Votre personnage est décédé. Il a obtenu le score de " + joueur.getScore()
					+ " points. Veuillez créer un nouveau personnage";
			System.out.println(text);
		} else {
			if(c.getType() == "Loup") {
				
			}
		}
	}

	public int afficherScore() {
		return joueur.getScore();
	}

	public void sortir() {
		// TODO add method body

	}

	public int chiffreAleatoire(int max, int min) {
		return new Random().nextInt(max - min) + min;
	}

	@Override
	public String toString() {
		return "Menu [Joueur=" + joueur + "]";
	}

}
