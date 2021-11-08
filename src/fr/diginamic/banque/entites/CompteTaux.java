package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
	
	private double taux;
	
	public CompteTaux(int numeroCompte, double soldeCompte, double taux) {
		super(numeroCompte, soldeCompte);
		this.taux = taux;
	}

	@Override
	public String toString() {
		return super.toString() + " - Taux de rémuneration : " + taux + " %";
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

}
