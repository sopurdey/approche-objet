package entites2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	/**
	 * Constructeur avec nom, prenom
	 * @param nom
	 * @param prenom
	 */
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	/**
	 * Constructeur avec nom, prenom, adresse
	 * @param nom
	 * @param prenom
	 * @param adresse
	 */
	public Personne(String nom, String prenom, AdressePostale adresse) {
			this.nom = nom;
			this.prenom = prenom;
			this.adresse = adresse;
	}
	
	/**
	 * Méthode pour afficher le nom et prénom avec nom en majuscules
	 */
	public void afficherNomMajuscules() {
		System.out.println(this.nom.toUpperCase() + " " + this.prenom);
	}

	/**
	 * Méthode pour modifier le nom de famille
	 * @param nom
	 * @return String nom modifié
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * Méthode pour modifier le prénom
	 * @param prenom
	 * @return String prénom modifié
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * Méthode pour modifier l'adresse
	 * @param adresse
	 * @return AdressePostale adresse modifiée
	 */
	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
	
	/**
	 * Obtenir le nom
	 * @return String nom
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Obtenir le prénom
	 * @return String nom
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * Obtenir l'adresse
	 * @return AdressePostale adresse
	 */
	public AdressePostale getAdresse() {
		return adresse;
	}

	
}
