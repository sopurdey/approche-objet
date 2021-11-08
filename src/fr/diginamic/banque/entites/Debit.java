package fr.diginamic.banque.entites;

public class Debit extends Operation {

	private static final String DEBIT = "Débit";

	public Debit(String date, double montant) {
		super(date, montant);
		
	}

	@Override
	public String getType() {
		
		return DEBIT;
	}

}
