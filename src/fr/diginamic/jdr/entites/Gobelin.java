package fr.diginamic.jdr.entites;

import java.util.Random;

public class Gobelin extends Personnage {

	public Gobelin(int force, int vie) {
		super(force, vie);
		this.force = new Random().nextInt(11 - 5) + 5;
		this.vie = new Random().nextInt(16 - 10) + 10;
	}
	
	@Override
	public void setForce() {
		this.force = new Random().nextInt(11 - 5) + 5;
	}
	
	@Override
	public void setVie() {
		this.vie = new Random().nextInt(16 - 10) + 10;
	}

	@Override
	protected String getType() {
		return "Gobelin";
	}
}
