package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {

		Path pathFile = Paths.get("C:/Users/Formation/Downloads/recensement.csv");
		
		List<String> lignes = Files.readAllLines(pathFile);
		
		List<String> villes = new ArrayList<>();

		String ligneEntete = lignes.get(0);
		String[] colonnesEntete = ligneEntete.split(";");
		String ligneEnteteFinale = colonnesEntete[2] + ";" + colonnesEntete[6] + ";" + colonnesEntete[9];
		villes.add(ligneEnteteFinale);
		//System.out.println(ligneEnteteFinale);
		
		for (int i = 1; i < lignes.size(); i++) {

			String ligne = lignes.get(i);
			String[] colonnes = ligne.split(";");
			
			int population = Integer.parseInt(colonnes[9].replaceAll(" ", ""));
			if (population >= 25_000) {
				villes.add(colonnes[2] + ";" + colonnes[6] + ";" + colonnes[9] + ";");
			}
		}

		for (String ville: villes) {
			System.out.println(ville);
		}
		
		Path pathCible = Paths.get("C:/Users/Formation/Downloads/recensement25000.csv");
		Files.write(pathCible, villes);
		
	}

}
