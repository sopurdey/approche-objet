package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	protected double salaireMensuel;
	
	public Salarie(String nom, String prenom, double salaireMensuel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaireMensuel = salaireMensuel;
	}
	
	@Override
	public double getSalaire() {
		return salaireMensuel;
	}

	@Override
	protected String getType() {
		return "Salarié";
	}


}
