package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
	private double[] tab = new double[0];
	
	public void ajout(double d) {
		tab = Arrays.copyOf(tab, tab.length + 1);
		tab[tab.length - 1] = d;
	}
	
	public double calcul() {
		int l = tab.length;
		double total = 0.0;
		
		for (int i = 0; i < l; i++) {
			total += tab[i];
		}
		double moyenne = total / l;
		
		return moyenne;
	}

	public double[] getTab() {
		return tab;
	}

	public void setTab(double[] tab) {
		this.tab = tab;
	}
	
	
}
