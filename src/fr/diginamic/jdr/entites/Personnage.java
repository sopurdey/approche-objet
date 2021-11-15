package fr.diginamic.jdr.entites;

import java.util.Random;

public abstract class Personnage {
	protected int force;
	protected int vie;
	
	public abstract void setForce();
	public abstract void setVie();
	protected abstract String getType();
	
	@Override
	public String toString() {
		return "[force=" + force + ", vie=" + vie + "]";
	}
	public Personnage(int force, int vie) {
		super();
		this.force = force;
		this.vie = vie;
	}
	public int getForce() {
		return force;
	}
	
	public int getVie() {
		return vie;
	}


}
