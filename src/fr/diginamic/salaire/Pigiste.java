package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	protected int joursTravailles;
	protected double salaireJournalier;
	
	public Pigiste(String nom, String prenom, int joursTravailles, double salaireJournalier) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.joursTravailles = joursTravailles;
		this.salaireJournalier = salaireJournalier;
	}

	@Override
	public double getSalaire() {
		return joursTravailles * salaireJournalier;
	}

	@Override
	protected String getType() {
		return "Pigiste";
	}
	
}
