package fr.diginamic.salaire;

public abstract class Intervenant {
	protected String nom;
	protected String prenom;

	public abstract double getSalaire();
	protected abstract String getType();
	
	/**
	 * 
	 */
	public void afficherDonnees() {
		String texte =  "Nom : " + nom + ", " + prenom + " - Salaire : " + getSalaire() + " - Statut : " + getType();
		System.out.println(texte);
	}
	
}
