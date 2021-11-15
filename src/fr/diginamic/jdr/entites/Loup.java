package fr.diginamic.jdr.entites;

import java.util.Random;

public class Loup extends Personnage {

	public Loup(int force, int vie) {
		super(force, vie);
		this.force = new Random().nextInt(9 - 3) + 3;
		this.vie = new Random().nextInt(11 - 5) + 5;
	}
	
	@Override
	public void setForce() {
		this.force = new Random().nextInt(9 - 3) + 3;
	}
	
	@Override
	public void setVie() {
		this.vie = new Random().nextInt(11 - 5) + 5;
	}

	@Override
	protected String getType() {
		return "Loup";
	}
}
