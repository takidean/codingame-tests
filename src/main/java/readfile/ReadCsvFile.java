package readfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadCsvFile extends Object implements Serializable  {

    public static enum CategorieSocioProfessionnelle {
        Agriculteur,
        Artisan,
        Cadre,
        Employe,
        Ouvrier,
        Retraite
    };

    public List<String> readLinesFromFile (Path inputFile) throws IOException {
        int a=3;
         List<String> listOfLines = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(inputFile, StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
             String[] attributes = line.split(",");

                line = br.readLine();
                listOfLines.add(line);
            } } catch (IOException ioe)
        { ioe.printStackTrace(); }


        return null;
    }

}
