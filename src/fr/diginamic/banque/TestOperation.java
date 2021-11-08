package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
		
		Credit cred1 = new Credit("01/10/2021", 500.00);
		Credit cred2 = new Credit("15/10/2021", 1500.00);
		Debit deb1 = new Debit("04/10/2021", 25.19);
		Debit deb2 = new Debit("23/10/2021", 127.00);
		
		
		Operation opes[] = {cred1, cred2, deb1, deb2};
		
		double montant = 0.0;
		for (int i = 0; i < opes.length; i++) {
			System.out.println(opes[i]);
			
			if(opes[i].getType().equals("Crédit")) {
				montant += opes[i].getMontant();
			} else {
				montant -= opes[i].getMontant();
			}
		}
		System.out.println(montant);
		
		
	}
	


}
