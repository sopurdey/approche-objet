package entites;

public class AdressePostale {
	public int numero;
	public String libelle;
	public int cp;
	public String ville;
	
	public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
		this.numero = numeroRue;
		this.libelle = libelleRue;
		this.cp = codePostal;
		this.ville = ville;
		
	}

	@Override
	public String toString() {
		return "AdressePostale [numero=" + numero + ", libelle=" + libelle + ", cp=" + cp + ", ville=" + ville + "]";
	}
	

}
