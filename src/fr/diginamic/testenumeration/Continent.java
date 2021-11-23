package fr.diginamic.testenumeration;

public enum Continent {
	EUROPE("Europe"), ASIE("Asie"), OCEANIE("Océanie"), AFRIQUE("Afrique"), AMERIQUENORD("Amérique du Nord"),
	AMERIQUESUD("Amérique du Sud");

	private String libelle;

	private Continent(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}

}
