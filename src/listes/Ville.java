package listes;

public class Ville {
	String nom;
	int nbHabitants;
	
	public Ville(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}
	
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitants=" + nbHabitants + "]";
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

}
