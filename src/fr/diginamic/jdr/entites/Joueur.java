package fr.diginamic.jdr.entites;

import java.util.Random;

public class Joueur extends Personnage {
	private int score;

	public Joueur(int force, int vie, int score) {
		super(force, vie);
		this.score = score;
	}
	
	@Override
	public void setForce() {
		this.force = new Random().nextInt(19 - 12) + 12;
	}
	
	@Override
	public void setVie() {
		this.vie = new Random().nextInt(51 - 20) + 20;
	}
	
	@Override
	protected String getType() {
		return "Joueur";
	}
	
	@Override
	public String toString() {
		return "[score=" + score + ", force=" + force + ", vie=" + vie + "]";
	}


	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}



}
