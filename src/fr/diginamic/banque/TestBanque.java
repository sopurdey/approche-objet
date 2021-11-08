package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		Compte compte1 = new Compte(1234567890, 1000.00);		
		Compte compte2 = new CompteTaux(987654321, 20_000.00, 1.95);
		
		Compte comptes[] = new Compte[2];
		
		comptes[0] = compte1;
		comptes[1] = compte2;
		
		for (int i = 0; i < comptes.length; i++) {
			System.out.println(comptes[i]);
		}
	}

}
