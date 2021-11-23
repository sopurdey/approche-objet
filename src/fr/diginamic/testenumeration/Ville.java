package fr.diginamic.testenumeration;

public class Ville {
	String nom;
	int nbHabitants;
	private Continent continent;
	
	public Ville(String nom, int nbHabitants, Continent continent) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.continent = continent;
	}
	
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitants=" + nbHabitants + ", continent=" + continent.getLibelle() + "]";
	}

	// Redéfinissez la méthode equals
	@Override
	public boolean equals(Object objet) {
		if (!(objet instanceof Ville)) {
			return false;
		}
		
		Ville autre = (Ville) objet;
		return this.nom.equals(autre.getNom()) && this.nbHabitants == autre.getNbHabitants();
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
