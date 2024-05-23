package org.namesorter.solid;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    public List<String> readFile(String filename) throws FileNotFoundException {
        List<String> content = new ArrayList<>();
        File myFile = new File(filename);
        Scanner reader = new Scanner(myFile);
        while (reader.hasNextLine()) {
            String name = reader.nextLine();
            content.add(name);
        }
        reader.close();
        return content;
    }
}
