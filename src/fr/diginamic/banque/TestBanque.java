package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		Compte compte1 = new Compte(123456789, 100_000.00);
		System.out.println(compte1);

	}

}
