package fr.diginamic.jdr.entites;

import java.util.Random;

public class Troll extends Personnage {

	public Troll(int force, int vie) {
		super(force, vie);
		this.force = new Random().nextInt(16 - 10) + 10;
		this.vie = new Random().nextInt(31 - 20) + 20;
	}
	
	@Override
	public void setForce() {
		this.force = new Random().nextInt(16 - 10) + 10;
	}
	
	@Override
	public void setVie() {
		this.vie = new Random().nextInt(31 - 20) + 20;
	}
	
	@Override
	protected String getType() {
		return "Troll";
	}

}
