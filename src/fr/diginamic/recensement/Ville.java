package fr.diginamic.recensement;

public class Ville {
	String codeRegion;
	String nomRegion;
	String codeDepartement;
	String codeCommune;
	String nomCommune;
	int popTotale;

	public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeCommune, String nomCommune,
			int popTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.popTotale = popTotale;
	}

	/* === ETAPE 2 == */
	@Override
	public String toString() {
		return "Ville [codeRegion=" + codeRegion + ", nomRegion=" + nomRegion + ", codeDepartement=" + codeDepartement
				+ ", codeCommune=" + codeCommune + ", nomCommune=" + nomCommune + ", popTotale=" + popTotale + "]";
	}

	public String getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public String getCodeCommune() {
		return codeCommune;
	}

	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public int getPopTotale() {
		return popTotale;
	}

	public void setPopTotale(int popTotale) {
		this.popTotale = popTotale;
	}

}
