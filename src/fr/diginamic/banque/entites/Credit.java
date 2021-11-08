package fr.diginamic.banque.entites;

public class Credit extends Operation {

	private static final String CREDIT = "Crédit";

	public Credit(String date, double montant) {
		super(date, montant);
		
	}

	@Override
	public String getType() {
		
		return CREDIT;
	}
	
	
}
