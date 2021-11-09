package fr.diginamic.entites;

public class Theatre {
	private String nom;
	private int maxCapacite;
	private int totalInscrits;
	private double recetteTotale;
	
	public void inscrire(int nombreClients, double prixPlace) {
		if ((totalInscrits + nombreClients) <= maxCapacite) {
			totalInscrits += nombreClients;
		} else 
			System.out.println("Erreur : la capactié max est atteinte");
	}

	public Theatre(String nom, int maxCapacite, int totalInscrits, double recetteTotale) {
		super();
		this.nom = nom;
		this.maxCapacite = maxCapacite;
		this.totalInscrits = totalInscrits;
		this.recetteTotale = recetteTotale;
	}

	@Override
	public String toString() {
		return "Theatre " + nom + " : Capacité max : " + maxCapacite + " - Recette totale : " + recetteTotale;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getMaxCapacite() {
		return maxCapacite;
	}

	public void setMaxCapacite(int maxCapacite) {
		this.maxCapacite = maxCapacite;
	}

	public int getTotalInscrits() {
		return totalInscrits;
	}

	public void setTotalInscrits(int totalInscrits) {
		this.totalInscrits = totalInscrits;
	}

	public double getRecetteTotale() {
		return recetteTotale;
	}

	public void setRecetteTotale(double recetteTotale) {
		this.recetteTotale = recetteTotale;
	}

}
