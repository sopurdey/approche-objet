package entites;

public class AdressePostale {
	public int numero;
	public String libelle;
	public int cp;
	public String ville;
	
	public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
		numero = numeroRue;
		libelle = libelleRue;
		cp = codePostal;
		this.ville = ville;
		
	}

}
