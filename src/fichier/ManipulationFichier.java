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
		lignes.remove(0);
		
		List<String> villes = new ArrayList<>();
		
		for (String ligne: lignes) {
			String[] tokens = ligne.split(";");
			tokens[9] = tokens[9].trim().replaceAll(" ", "");
			//System.out.println(tokens[9]);
			for (int i = 0; i < tokens.length; i++) {
				if (Integer.valueOf(tokens[9]) < 25_000) {
					System.out.println(tokens[9]);
				}
			}
		}
		
		
	}

}
